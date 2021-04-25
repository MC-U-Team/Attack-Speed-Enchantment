package info.u_team.attack_speed_enchantment.hook;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class PlayerAttackSpeedHook {
	
	public static float hook(float value, PlayerEntity player) {
		return getUpdatedValueForMainHand(value, player.getHeldItemMainhand());
	}
	
	private static float getUpdatedValueForMainHand(float value, ItemStack stack) {
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), stack);
		if (level < 1) {
			return value;
		}
		if (level > 10) {
			return 0;
		}
		final float factor = 1 - (level * 0.1F);
		return value * factor;
	}
}

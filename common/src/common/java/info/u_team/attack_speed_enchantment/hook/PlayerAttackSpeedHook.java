package info.u_team.attack_speed_enchantment.hook;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class PlayerAttackSpeedHook {
	
	public static float hook(float value, Player player) {
		return getUpdatedValueForMainHand(value, player.getMainHandItem());
	}
	
	private static float getUpdatedValueForMainHand(float value, ItemStack stack) {
		final int level = EnchantmentHelper.getItemEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), stack);
		// final int level = stack.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get()); // TODO
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

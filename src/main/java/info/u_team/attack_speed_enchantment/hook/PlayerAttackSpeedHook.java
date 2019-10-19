package info.u_team.attack_speed_enchantment.hook;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class PlayerAttackSpeedHook {
	
	// DO NOT CHANGE METHOD
	// This method is called from asm from PlayerEntity.getCooldownPeriod()
	public static float hook(PlayerEntity player) {
		final float value = (float) (1 / player.getAttribute(SharedMonsterAttributes.ATTACK_SPEED).getValue() * 20);
		return getUpdatedValueForMainHand(value, player.getHeldItemMainhand());
	}
	
	private static float getUpdatedValueForMainHand(float value, ItemStack stack) {
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FAST_ATTACK_SPEED, stack);
		if (level < 1) {
			return value;
		}
		final float factor = 1 - (level * 0.1F);
		return value * factor;
	}
}

package info.u_team.attack_speed_enchantment.impl;

import info.u_team.attack_speed_enchantment.util.EnchantmentUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public class ForgeEnchantmentUtil extends EnchantmentUtil {
	
	@Override
	protected int getLevel(Enchantment enchantment, ItemStack stack) {
		return stack.getEnchantmentLevel(enchantment);
	}
	
}

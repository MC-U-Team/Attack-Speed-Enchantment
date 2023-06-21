package info.u_team.attack_speed_enchantment.impl;

import info.u_team.attack_speed_enchantment.util.EnchantmentUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class FabricEnchantmentUtil extends EnchantmentUtil {
	
	@Override
	protected int getLevel(Enchantment enchantment, ItemStack stack) {
		return EnchantmentHelper.getItemEnchantmentLevel(enchantment, stack);
	}
	
}

package info.u_team.attack_speed_enchantment.util;

import info.u_team.u_team_core.util.ServiceUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public abstract class EnchantmentUtil {
	
	private static final EnchantmentUtil INSTANCE = ServiceUtil.loadOne(EnchantmentUtil.class);
	
	public static int getEnchantmentLevel(Enchantment enchantment, ItemStack stack) {
		return INSTANCE.getLevel(enchantment, stack);
	}
	
	protected abstract int getLevel(Enchantment enchantment, ItemStack stack);
	
}

package info.u_team.attack_speed_enchantment.enchantment;

import info.u_team.u_team_core.enchantment.UEnchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

public class FasterAttackSpeedEnchantment extends UEnchantment {
	
	public FasterAttackSpeedEnchantment(String name) {
		super(name, Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return 10;
	}
	
	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem() instanceof AxeItem ? true : super.canApply(stack);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return super.getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return super.getMaxEnchantability(enchantmentLevel) + 5;
	}
}

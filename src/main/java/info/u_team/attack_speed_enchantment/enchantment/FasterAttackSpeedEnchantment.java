package info.u_team.attack_speed_enchantment.enchantment;

import net.minecraft.enchantment.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

public class FasterAttackSpeedEnchantment extends Enchantment {
	
	public FasterAttackSpeedEnchantment() {
		super(Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
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

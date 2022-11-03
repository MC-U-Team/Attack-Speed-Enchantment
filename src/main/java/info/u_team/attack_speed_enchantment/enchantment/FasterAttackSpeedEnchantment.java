package info.u_team.attack_speed_enchantment.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FasterAttackSpeedEnchantment extends Enchantment {
	
	public FasterAttackSpeedEnchantment() {
		super(Rarity.COMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return 10;
	}
	
	@Override
	public boolean canEnchant(ItemStack stack) {
		return stack.getItem() instanceof AxeItem ? true : super.canEnchant(stack);
	}
	
	@Override
	public int getMinCost(int enchantmentLevel) {
		return super.getMinCost(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxCost(int enchantmentLevel) {
		return super.getMaxCost(enchantmentLevel) + 5;
	}
}

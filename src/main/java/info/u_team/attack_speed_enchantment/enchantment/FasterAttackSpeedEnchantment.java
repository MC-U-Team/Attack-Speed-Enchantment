package info.u_team.attack_speed_enchantment.enchantment;

import java.util.function.Supplier;

import com.google.common.base.Suppliers;

import info.u_team.attack_speed_enchantment.config.CommonConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;

public class FasterAttackSpeedEnchantment extends Enchantment {
	
	private final Supplier<Integer> maxLevel = Suppliers.memoize(() -> CommonConfig.getInstance().maxEnchantmentLevel.get());
	
	public FasterAttackSpeedEnchantment() {
		super(Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return maxLevel.get();
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

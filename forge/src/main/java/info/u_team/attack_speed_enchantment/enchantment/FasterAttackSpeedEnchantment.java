package info.u_team.attack_speed_enchantment.enchantment;

import java.util.function.Supplier;

import com.google.common.base.Suppliers;

import info.u_team.attack_speed_enchantment.config.CommonConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FasterAttackSpeedEnchantment extends Enchantment {
	
	private final Supplier<Integer> maxLevel = Suppliers.memoize(() -> CommonConfig.getInstance().maxEnchantmentLevel.get());
	
	public FasterAttackSpeedEnchantment() {
		super(Rarity.COMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return maxLevel.get();
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

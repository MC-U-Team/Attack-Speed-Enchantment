package info.u_team.attack_speed_enchantment.enchantment;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.u_team_core.enchantment.UEnchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = AttackSpeedEnchantmentMod.MODID)
public class FastAttackSpeedEnchantment extends UEnchantment {
	
	public FastAttackSpeedEnchantment(String name) {
		super(name, Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return 6;
	}
	
	// Handle event
	public static void apply(LivingEquipmentChangeEvent event) {
		
	}
}

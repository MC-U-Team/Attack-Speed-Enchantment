package info.u_team.attack_speed_enchantment.enchantment;

import java.util.UUID;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import info.u_team.u_team_core.enchantment.UEnchantment;
import net.minecraft.enchantment.*;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = AttackSpeedEnchantmentMod.MODID)
public class FastAttackSpeedEnchantment extends UEnchantment {
	
	private static final UUID UUID = new UUID(-2801189623500288575L, -7835931777708963832L);
	
	public FastAttackSpeedEnchantment(String name) {
		super(name, Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}
	
	@Override
	public int getMaxLevel() {
		return 6;
	}
	
	// Handle event
	@SubscribeEvent
	public static void apply(LivingEquipmentChangeEvent event) {
		if (event.getSlot() != EquipmentSlotType.MAINHAND) {
			return;
		}
		final ItemStack stack = event.getTo();
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FAST_ATTACK_SPEED, stack);
		if (level < 1) {
			return;
		}
		stack.addAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(UUID, "Weapon modifier", 1, Operation.ADDITION), EquipmentSlotType.MAINHAND);
	}
}

package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.enchantment.FasterAttackSpeedEnchantment;
import info.u_team.u_team_core.api.registry.CommonRegister;
import info.u_team.u_team_core.api.registry.RegistryEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;

public class AttackSpeedEnchantmentEnchantments {
	
	public static final CommonRegister<Enchantment> ENCHANTMENTS = CommonRegister.create(Registries.ENCHANTMENT, AttackSpeedEnchantmentMod.MODID);
	
	public static final RegistryEntry<FasterAttackSpeedEnchantment> FASTER_ATTACK_SPEED = ENCHANTMENTS.register("faster_attack_speed", FasterAttackSpeedEnchantment::new);
	
	static void register() {
		ENCHANTMENTS.register();
	}
	
}

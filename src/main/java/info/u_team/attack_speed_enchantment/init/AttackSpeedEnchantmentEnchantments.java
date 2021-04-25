package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.enchantment.FasterAttackSpeedEnchantment;
import info.u_team.u_team_core.util.registry.CommonDeferredRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class AttackSpeedEnchantmentEnchantments {
	
	public static final CommonDeferredRegister<Enchantment> ENCHANTMENTS = CommonDeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AttackSpeedEnchantmentMod.MODID);
	
	public static final RegistryObject<FasterAttackSpeedEnchantment> FAST_ATTACK_SPEED = ENCHANTMENTS.register("faster_attack_speed", FasterAttackSpeedEnchantment::new);
	
	public static void registerMod(IEventBus bus) {
		ENCHANTMENTS.register(bus);
	}
	
}

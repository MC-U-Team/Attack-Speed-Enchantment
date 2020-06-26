package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.enchantment.FasterAttackSpeedEnchantment;
import info.u_team.u_team_core.util.registry.CommonDeferredRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;

public class AttackSpeedEnchantmentEnchantments {
	
	public static final CommonDeferredRegister<Enchantment> ENCHANTMENTS = CommonDeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AttackSpeedEnchantmentMod.MODID);
	
	public static final FasterAttackSpeedEnchantment FAST_ATTACK_SPEED = new FasterAttackSpeedEnchantment("faster_attack_speed");
	
	public static void register(IEventBus bus) {
		ENCHANTMENTS.register(bus);
	}
	
}

package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.enchantment.FastAttackSpeedEnchantment;
import info.u_team.u_team_core.util.registry.BaseRegistryUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = AttackSpeedEnchantmentMod.MODID, bus = Bus.MOD)
public class AttackSpeedEnchantmentEnchantments {
	
	public static final FastAttackSpeedEnchantment FAST_ATTACK_SPEED = new FastAttackSpeedEnchantment("fast_attack_speed");
	
	@SubscribeEvent
	public static void register(Register<Enchantment> event) {
		BaseRegistryUtil.getAllRegistryEntriesAndApplyNames(AttackSpeedEnchantmentMod.MODID, Enchantment.class).forEach(event.getRegistry()::register);
	}
	
}

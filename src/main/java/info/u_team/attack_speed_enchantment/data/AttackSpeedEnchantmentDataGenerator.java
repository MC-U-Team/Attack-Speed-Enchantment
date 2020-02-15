package info.u_team.attack_speed_enchantment.data;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.data.provider.AttackSpeedEnchantmentLanguagesProvider;
import info.u_team.u_team_core.data.GenerationData;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = AttackSpeedEnchantmentMod.MODID, bus = Bus.MOD)
public class AttackSpeedEnchantmentDataGenerator {
	
	@SubscribeEvent
	public static void data(GatherDataEvent event) {
		final GenerationData data = new GenerationData(AttackSpeedEnchantmentMod.MODID, event);
		if (event.includeClient()) {
			data.addProvider(AttackSpeedEnchantmentLanguagesProvider::new);
		}
	}
	
}

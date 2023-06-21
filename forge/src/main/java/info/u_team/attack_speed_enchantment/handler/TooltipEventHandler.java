package info.u_team.attack_speed_enchantment.handler;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import info.u_team.u_team_core.util.TooltipCreator;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class TooltipEventHandler {
	
	private static final MutableComponent NONE_COMPONENT = Component.literal(" ").append(TooltipCreator.create(AttackSpeedEnchantmentMod.MODID, "faster_attack_speed", "none", 0).withStyle(ChatFormatting.DARK_PURPLE));
	
	private static void onItemTooltip(ItemTooltipEvent event) {
		final int level = event.getItemStack().getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get());
		if (level < 1) {
			return;
		}
		if (level >= 10) {
			event.getToolTip().add(NONE_COMPONENT);
		} else {
			event.getToolTip().add(Component.literal(" ").append(TooltipCreator.create(AttackSpeedEnchantmentMod.MODID, "faster_attack_speed", "faster", 0, level * 10 + "%").withStyle(ChatFormatting.DARK_GREEN)));
		}
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(TooltipEventHandler::onItemTooltip);
	}
}

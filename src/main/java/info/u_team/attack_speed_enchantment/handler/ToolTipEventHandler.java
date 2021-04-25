package info.u_team.attack_speed_enchantment.handler;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import info.u_team.u_team_core.util.TooltipCreator;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class ToolTipEventHandler {
	
	private static final IFormattableTextComponent NONE_COMPONENT = TooltipCreator.create(AttackSpeedEnchantmentMod.MODID, "faster_attack_speed", "none", 0).mergeStyle(TextFormatting.GOLD);
	
	private static void onItemTooltip(ItemTooltipEvent event) {
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), event.getItemStack());
		if (level < 1) {
			return;
		}
		if (level >= 10) {
			event.getToolTip().add(NONE_COMPONENT);
		} else {
			event.getToolTip().add(TooltipCreator.create(AttackSpeedEnchantmentMod.MODID, "faster_attack_speed", "faster", 0, level * 10 + "%").mergeStyle(TextFormatting.GREEN));
		}
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(ToolTipEventHandler::onItemTooltip);
	}
}

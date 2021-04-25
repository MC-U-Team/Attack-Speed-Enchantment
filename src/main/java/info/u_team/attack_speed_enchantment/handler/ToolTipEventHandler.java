package info.u_team.attack_speed_enchantment.handler;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class ToolTipEventHandler {
	
	private static final String TRANSLATION_BASE = "tooltip.attackspeedenchantment.faster_attack_speed";
	
	private static void onItemTooltip(ItemTooltipEvent event) {
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), event.getItemStack());
		if (level < 1) {
			return;
		}
		if (level >= 10) {
			event.getToolTip().add(new TranslationTextComponent(TRANSLATION_BASE + ".none").mergeStyle(TextFormatting.RED));
		} else {
			event.getToolTip().add(new TranslationTextComponent(TRANSLATION_BASE, level * 10 + "%"));
		}
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(ToolTipEventHandler::onItemTooltip);
	}
}

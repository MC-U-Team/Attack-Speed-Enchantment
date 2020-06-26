package info.u_team.attack_speed_enchantment.handler;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.util.text.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = AttackSpeedEnchantmentMod.MODID, value = Dist.CLIENT)
public class ToolTipEventHandler {
	
	private static final String TRANSLATION_BASE = "tooltip.attackspeedenchantment.faster_attack_speed";
	
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		final int level = EnchantmentHelper.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FAST_ATTACK_SPEED.get(), event.getItemStack());
		if (level < 1) {
			return;
		}
		if (level >= 10) {
			event.getToolTip().add(new TranslationTextComponent(TRANSLATION_BASE + ".none").applyTextStyle(TextFormatting.RED));
		} else {
			event.getToolTip().add(new TranslationTextComponent(TRANSLATION_BASE, level * 10 + "%"));
		}
	}
}

package info.u_team.attack_speed_enchantment.init;

import java.util.List;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.u_team_core.api.event.ClientEvents;
import info.u_team.u_team_core.util.EnchantmentUtil;
import info.u_team.u_team_core.util.TooltipCreator;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

public class AttackSpeedEnchantmentClientEvents {
	
	private static final MutableComponent NONE_COMPONENT = Component.literal(" ").append(TooltipCreator.create(AttackSpeedEnchantmentReference.MODID, "faster_attack_speed", "none", 0).withStyle(ChatFormatting.DARK_PURPLE));
	
	private static void onItemTooltip(ItemStack stack, TooltipFlag flag, List<Component> lines) {
		final int level = EnchantmentUtil.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), stack);
		if (level < 1) {
			return;
		}
		if (level >= 10) {
			lines.add(NONE_COMPONENT);
		} else {
			lines.add(Component.literal(" ").append(TooltipCreator.create(AttackSpeedEnchantmentReference.MODID, "faster_attack_speed", "faster", 0, level * 10 + "%").withStyle(ChatFormatting.DARK_GREEN)));
		}
	}
	
	static void register() {
		ClientEvents.registerItemTooltip(AttackSpeedEnchantmentClientEvents::onItemTooltip);
	}
	
}

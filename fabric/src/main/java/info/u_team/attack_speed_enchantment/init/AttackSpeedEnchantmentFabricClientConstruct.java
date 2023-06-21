package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.attack_speed_enchantment.handler.TooltipEventHandler;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.ModConstruct;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;

@Construct(modid = AttackSpeedEnchantmentReference.MODID, client = true)
public class AttackSpeedEnchantmentFabricClientConstruct implements ModConstruct {
	
	@Override
	public void construct() {
		ItemTooltipCallback.EVENT.register((stack, context, lines) -> TooltipEventHandler.onItemTooltip(stack, lines));
	}
	
}

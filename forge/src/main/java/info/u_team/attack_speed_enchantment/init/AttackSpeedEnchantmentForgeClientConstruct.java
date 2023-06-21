package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.attack_speed_enchantment.handler.TooltipEventHandler;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.ModConstruct;
import info.u_team.u_team_core.util.registry.BusRegister;

@Construct(modid = AttackSpeedEnchantmentReference.MODID, client = true)
public class AttackSpeedEnchantmentForgeClientConstruct implements ModConstruct {
	
	@Override
	public void construct() {
		BusRegister.registerForge(TooltipEventHandler::registerForge);
	}
	
}

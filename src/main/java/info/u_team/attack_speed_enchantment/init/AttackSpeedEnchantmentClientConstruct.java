package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.handler.TooltipEventHandler;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.IModConstruct;
import info.u_team.u_team_core.util.registry.BusRegister;

@Construct(modid = AttackSpeedEnchantmentMod.MODID, client = true)
public class AttackSpeedEnchantmentClientConstruct implements IModConstruct {
	
	@Override
	public void construct() {
		BusRegister.registerForge(TooltipEventHandler::registerForge);
	}
	
}

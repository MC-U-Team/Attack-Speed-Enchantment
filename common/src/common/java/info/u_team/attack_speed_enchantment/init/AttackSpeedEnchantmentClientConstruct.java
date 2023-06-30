package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.ModConstruct;

@Construct(modid = AttackSpeedEnchantmentReference.MODID, client = true)
public class AttackSpeedEnchantmentClientConstruct implements ModConstruct {
	
	@Override
	public void construct() {
		AttackSpeedEnchantmentClientEvents.register();
	}
	
}

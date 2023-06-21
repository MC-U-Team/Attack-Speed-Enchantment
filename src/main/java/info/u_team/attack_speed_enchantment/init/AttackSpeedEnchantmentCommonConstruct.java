package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentMod;
import info.u_team.attack_speed_enchantment.config.CommonConfig;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.IModConstruct;
import info.u_team.u_team_core.util.registry.BusRegister;

@Construct(modid = AttackSpeedEnchantmentMod.MODID)
public class AttackSpeedEnchantmentCommonConstruct implements IModConstruct {
	
	@Override
	public void construct() {
		CommonConfig.getInstance();
		
		BusRegister.registerMod(AttackSpeedEnchantmentEnchantments::registerMod);
	}
	
}

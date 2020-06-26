package info.u_team.attack_speed_enchantment;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import info.u_team.u_team_core.util.registry.BusRegister;
import info.u_team.u_team_core.util.verify.JarSignVerifier;
import net.minecraftforge.fml.common.Mod;

@Mod(AttackSpeedEnchantmentMod.MODID)
public class AttackSpeedEnchantmentMod {
	
	public static final String MODID = "attackspeedenchantment";
	
	public AttackSpeedEnchantmentMod() {
		JarSignVerifier.checkSigned(MODID);
		register();
	}
	
	private void register() {
		BusRegister.registerMod(AttackSpeedEnchantmentEnchantments::register);
	}
	
}

package info.u_team.attack_speed_enchantment;

import info.u_team.u_team_core.util.annotation.AnnotationManager;
import net.fabricmc.api.ModInitializer;

public class AttackSpeedEnchantmentMod implements ModInitializer {
	
	public static final String MODID = AttackSpeedEnchantmentReference.MODID;
	
	@Override
	public void onInitialize() {
		AnnotationManager.callAnnotations(MODID);
	}
	
}

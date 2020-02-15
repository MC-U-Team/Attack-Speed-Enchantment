package info.u_team.attack_speed_enchantment.data.provider;

import static info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments.FAST_ATTACK_SPEED;
import info.u_team.u_team_core.data.*;

public class AttackSpeedEnchantmentLanguagesProvider extends CommonLanguagesProvider {
	
	public AttackSpeedEnchantmentLanguagesProvider(GenerationData data) {
		super(data);
	}
	
	@Override
	public void addTranslations() {
		
		final String tooltip = "tooltip.attackspeedenchantment.faster_attack_speed";
		
		// English
		add(FAST_ATTACK_SPEED, "Faster Attack Speed");
		add(tooltip, "%s faster Attack Speed");
		add(tooltip + ".none", "No Attack Speed");
	}
	
}

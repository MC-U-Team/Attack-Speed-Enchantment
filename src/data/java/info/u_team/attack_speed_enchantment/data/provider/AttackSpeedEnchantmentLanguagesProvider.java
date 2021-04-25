package info.u_team.attack_speed_enchantment.data.provider;

import static info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED;

import info.u_team.u_team_core.data.CommonLanguagesProvider;
import info.u_team.u_team_core.data.GenerationData;

public class AttackSpeedEnchantmentLanguagesProvider extends CommonLanguagesProvider {
	
	public AttackSpeedEnchantmentLanguagesProvider(GenerationData data) {
		super(data);
	}
	
	@Override
	public void addTranslations() {
		// English
		addEnchantment(FASTER_ATTACK_SPEED, "Faster Attack Speed");
		addTooltip("faster_attack_speed", "faster", 0, "%s Less Attack Cooldown");
		addTooltip("faster_attack_speed", "none", 0, "No Attack Cooldown");
		
		// Deutsch
		addEnchantment("de_de", FASTER_ATTACK_SPEED, "Schnellere Angriffsgeschwindigkeit");
		addTooltip("de_de", "faster_attack_speed", "faster", 0, "%s Weniger Angriffsabklingzeit");
		addTooltip("de_de", "faster_attack_speed", "none", 0, "Keine Angriffsabklingzeit");
	}
	
}

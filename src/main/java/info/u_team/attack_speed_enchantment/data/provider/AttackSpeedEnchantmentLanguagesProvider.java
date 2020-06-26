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
		addEnchantment(FAST_ATTACK_SPEED, "Faster Attack Speed");
		add(tooltip, "%s faster Attack Speed");
		add(tooltip + ".none", "No Attack Speed");
		
		// Deutsch
		addEnchantment("de_de", FAST_ATTACK_SPEED, "Schnellere Angriffsgeschwindigkeit");
		add("de_de", tooltip, "%s schnellere Angriffsgeschwindigkeit");
		add("de_de", tooltip + ".none", "Keine Angriffsgeschwindigkeit");
	}
	
}

package info.u_team.attack_speed_enchantment.config;

import java.nio.file.Path;

import net.fabricmc.loader.api.FabricLoader;

public class FabricCommonConfig extends CommonConfig {
	
	@Override
	public Path configBasePath() {
		return FabricLoader.getInstance().getConfigDir();
	}
	
}

package info.u_team.attack_speed_enchantment.config;

import java.nio.file.Path;

import net.minecraftforge.fml.loading.FMLPaths;

public class ForgeCommonConfig extends CommonConfig {
	
	@Override
	public Path configBasePath() {
		return FMLPaths.CONFIGDIR.get();
	}
	
}

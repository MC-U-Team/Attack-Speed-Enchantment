package info.u_team.attack_speed_enchantment.config;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.u_team_core.api.Platform;
import net.minecraft.util.Mth;

public class CommonConfig {
	
	private static final CommonConfig INSTANCE = new CommonConfig();
	
	public static CommonConfig getInstance() {
		return INSTANCE;
	}
	
	public final Supplier<Integer> maxEnchantmentLevel;
	
	private final Path path = Platform.getInstance().getConfigPath().resolve(AttackSpeedEnchantmentReference.MODID + ".properties");
	private final Properties properties;
	
	private CommonConfig() {
		properties = new Properties();
		
		if (Files.exists(path)) {
			load();
		}
		
		properties.computeIfAbsent("maxEnchantmentLevel", unused -> "10");
		
		maxEnchantmentLevel = () -> {
			return Mth.clamp(Integer.valueOf(properties.getProperty("maxEnchantmentLevel", "10")), 0, 10);
		};
		
		if (!Files.exists(path)) {
			save();
		}
	}
	
	private void load() {
		try (final Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			properties.load(reader);
		} catch (final IOException ex) {
			LogManager.getLogger(AttackSpeedEnchantmentReference.MODID).warn("Could not read property file '" + path.toAbsolutePath() + "'", ex);
		}
	}
	
	private void save() {
		try (final BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			properties.store(writer, "Configuration file for Attack Speed Enchantment mod");
		} catch (final IOException ex) {
			LogManager.getLogger(AttackSpeedEnchantmentReference.MODID).warn("Could not read property file '" + path.toAbsolutePath() + "'", ex);
		}
	}
}

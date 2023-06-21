package info.u_team.attack_speed_enchantment.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import info.u_team.attack_speed_enchantment.init.AttackSpeedEnchantmentEnchantments;
import info.u_team.attack_speed_enchantment.util.EnchantmentUtil;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;

@Mixin(Player.class)
public class PlayerMixin {
	
	@Inject(method = "getCurrentItemAttackStrengthDelay", cancellable = true, at = @At("RETURN"))
	private void getCurrentItemAttackStrengthDelayWithFasterAttackSpeed(CallbackInfoReturnable<Float> callback) {
		final int level = Mth.clamp(EnchantmentUtil.getEnchantmentLevel(AttackSpeedEnchantmentEnchantments.FASTER_ATTACK_SPEED.get(), ((Player) (Object) this).getMainHandItem()), 0, 10);
		if (level > 0) {
			System.out.println("LEVEL: " + level);
			callback.setReturnValue(callback.getReturnValueF() * (1 - (level * 0.1F)));
		}
	}
}

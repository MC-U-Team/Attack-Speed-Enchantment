package info.u_team.attack_speed_enchantment.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import info.u_team.attack_speed_enchantment.hook.PlayerAttackSpeedHook;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
	
	@Inject(method = "getCooldownPeriod", cancellable = true, at = @At("RETURN"))
	private void updateCooldownPeriodWithFasterAttackSpeed(CallbackInfoReturnable<Float> callback) {
		final float newValue = PlayerAttackSpeedHook.hook(callback.getReturnValueF(), (PlayerEntity) (Object) this);
		
		callback.setReturnValue(newValue);
		callback.cancel();
	}
}

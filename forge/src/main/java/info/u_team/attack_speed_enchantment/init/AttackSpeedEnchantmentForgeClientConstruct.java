package info.u_team.attack_speed_enchantment.init;

import info.u_team.attack_speed_enchantment.AttackSpeedEnchantmentReference;
import info.u_team.attack_speed_enchantment.handler.TooltipEventHandler;
import info.u_team.u_team_core.api.construct.Construct;
import info.u_team.u_team_core.api.construct.ModConstruct;
import info.u_team.u_team_core.util.registry.BusRegister;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;

@Construct(modid = AttackSpeedEnchantmentReference.MODID, client = true)
public class AttackSpeedEnchantmentForgeClientConstruct implements ModConstruct {
	
	@Override
	public void construct() {
		BusRegister.registerForge(bus -> bus.addListener(EventPriority.NORMAL, false, ItemTooltipEvent.class, event -> {
			TooltipEventHandler.onItemTooltip(event.getItemStack(), event.getToolTip());
		}));
	}
	
}

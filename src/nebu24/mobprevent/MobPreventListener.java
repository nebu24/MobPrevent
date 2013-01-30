package nebu24.mobprevent;

import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobPreventListener implements Listener {
	
	public void PreventSpawn(CreatureSpawnEvent event) {
		if(event.getEntityType() == EntityType.ENDERMAN) {
			event.setCancelled(true);
		}
	}

}

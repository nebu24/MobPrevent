package com.nebu24.mobprevent;

import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.EventHandler;

public class MobPreventEntityListener implements Listener {
	
	private final MobPrevent plugin;
	
	public MobPreventEntityListener(MobPrevent instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void PreventSpawn(CreatureSpawnEvent event) {
		if(event.getEntityType() == EntityType.ENDERMAN) {
			event.setCancelled(true);
			
		}
		plugin.getLogger().info("Enderman spawned!");
	}

}

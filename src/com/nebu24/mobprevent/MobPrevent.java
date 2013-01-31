package com.nebu24.mobprevent;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MobPrevent extends JavaPlugin {
	
	private final MobPreventEntityListener entityListener = new MobPreventEntityListener(this);
	
	@Override
	public void onDisable() {
		getLogger().info("Goodbye world!");
	}
	
	@Override
	public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(entityListener, this);
		super.onEnable();
		
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
	}

}

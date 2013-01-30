package nebu24.mobprevent;

import org.bukkit.plugin.java.JavaPlugin;

public class MobPrevent extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new MobPreventListener(), this);
		super.onEnable();
	}

}

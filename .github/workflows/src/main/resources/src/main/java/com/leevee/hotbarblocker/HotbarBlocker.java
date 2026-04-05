package com.leevee.hotbarblocker;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HotbarBlocker extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("HotbarBlocker has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("HotbarBlocker has been disabled!");
    }

    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent event) {
        if (!event.getPlayer().hasPermission("hotbarblocker.allow")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "You cannot change your hotbar slots!");
        }
    }

}

package de.moozunity.luckyblocks.event;

import de.moozunity.luckyblocks.LuckyBlocks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

import java.util.Random;

public class BlockBreakEvent implements Listener {

    @EventHandler
    public void onBlockBreakEvent(org.bukkit.event.block.BlockBreakEvent event) {
        if(event.getBlock().getType() == Material.SPONGE) {
            event.setCancelled(true);
            event.getBlock().setType(Material.AIR);
            LuckyBlocks.getActions().get(new Random().nextInt(LuckyBlocks.getActions().size())).onOpen(event.getPlayer(), event.getBlock());
        }
    }

    @EventHandler
    public void onRedstone(BlockRedstoneEvent event) {
        if(event.getBlock().getLocation().subtract(0, 1,0).getBlock().getType().equals(Material.SPONGE)) {
            event.getBlock().getLocation().subtract(0, 1,0).getBlock().setType(Material.AIR);
            for (Entity entity : event.getBlock().getWorld().getNearbyEntities(event.getBlock().getLocation(), 5, 5, 5)) {
                if(entity instanceof Player) {
                    LuckyBlocks.getActions().get(new Random().nextInt(LuckyBlocks.getActions().size())).onOpen((Player) entity, event.getBlock().getLocation().subtract(0, 1,0).getBlock());
                    break;
                }
            }
        }
    }

}

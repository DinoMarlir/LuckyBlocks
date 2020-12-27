package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class GroundAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        player.sendMessage("§e§lSTAR POWER!");
        for (int i = 0; i < 10; i++) {
            block.getLocation().add(i, 0, 0).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().add(0, 0, i).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().subtract(0, 0, i).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().subtract(i, 0, 0).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().add(i, 0, -i).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().add(-i, 0, i).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().add(i, 0, i).getBlock().setType(Material.YELLOW_CONCRETE);
            block.getLocation().add(-i, 0, -i).getBlock().setType(Material.YELLOW_CONCRETE);
        }
    }
}

package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class GiantAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        spawnEntity(block.getLocation(), EntityType.GIANT, 10);
        player.sendMessage("§2I hope you have an good sword");
    }
}

package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TNTAction extends Action {

    @Override
    public void onOpen(Player player, Block block) {
        spawnEntity(block.getLocation(), EntityType.PRIMED_TNT, 3);
    }
}

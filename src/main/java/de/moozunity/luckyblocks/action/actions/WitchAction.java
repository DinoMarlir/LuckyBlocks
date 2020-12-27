package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class WitchAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        spawnEntity(block.getLocation(), EntityType.WITCH, 1);
        spawnEntity(block.getLocation(), EntityType.BAT, 10);
    }
}

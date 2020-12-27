package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class PotatoAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        player.sendMessage("§6POTATO PARADISE");
        dropItem(block.getLocation().add(0, 10, 0), Material.POTATO, 15);
        dropItem(block.getLocation().add(0, 10, 0), Material.POISONOUS_POTATO, 2);
        dropItem(block.getLocation().add(0, 10, 0), Material.BAKED_POTATO, 7);
    }
}

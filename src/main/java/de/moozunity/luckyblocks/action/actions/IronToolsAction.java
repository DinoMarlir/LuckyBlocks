package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class IronToolsAction extends Action {

    @Override
    public void onOpen(Player player, Block block) {
        dropItem(block.getLocation(), Material.IRON_AXE);
        dropItem(block.getLocation(), Material.IRON_SWORD);
        dropItem(block.getLocation(), Material.IRON_SHOVEL);
        dropItem(block.getLocation(), Material.IRON_HOE);
        dropItem(block.getLocation(), Material.IRON_PICKAXE);
    }
}

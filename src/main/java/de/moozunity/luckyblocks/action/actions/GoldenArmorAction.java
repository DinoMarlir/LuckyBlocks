package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class GoldenArmorAction extends Action {

    @Override
    public void onOpen(Player player, Block block) {
        dropItem(block.getLocation(), Material.GOLDEN_BOOTS);
        dropItem(block.getLocation(), Material.GOLDEN_LEGGINGS);
        dropItem(block.getLocation(), Material.GOLDEN_CHESTPLATE);
        dropItem(block.getLocation(), Material.GOLDEN_HELMET);
    }
}

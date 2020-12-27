package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Random;

public class AppleAction extends Action {

    @Override
    public void onOpen(Player player, Block block) {
        dropItem(block.getLocation(), Material.GOLDEN_APPLE, new Random().nextInt(7));
        dropItem(block.getLocation(), Material.APPLE, new Random().nextInt(16));
        dropItem(block.getLocation(), Material.ENCHANTED_GOLDEN_APPLE, new Random().nextInt(4));
    }
}

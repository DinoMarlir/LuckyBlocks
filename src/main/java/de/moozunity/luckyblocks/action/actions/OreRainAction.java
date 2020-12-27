package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Random;

public class OreRainAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        player.sendMessage("§aYEAH");
        dropItem(block.getLocation().add(0, 10,0), Material.DIAMOND, new Random().nextInt(14));
        dropItem(block.getLocation().add(0, 10,0), Material.EMERALD, new Random().nextInt(14));
        dropItem(block.getLocation().add(0, 10,0), Material.GOLD_INGOT, new Random().nextInt(20));
        dropItem(block.getLocation().add(0, 10,0), Material.IRON_INGOT, new Random().nextInt(30));
        dropItem(block.getLocation().add(0, 10,0), Material.LAPIS_LAZULI, new Random().nextInt(30));
    }
}

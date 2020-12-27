package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Random;

public class RandomAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        dropItem(block.getLocation(), Material.values()[new Random().nextInt(Material.values().length)]);
        player.sendMessage(ChatColor.values()[new Random().nextInt(ChatColor.values().length)] + "WOHO! What is this?!");
    }
}

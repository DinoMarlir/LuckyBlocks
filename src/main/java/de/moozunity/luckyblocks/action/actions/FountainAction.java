package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import de.moozunity.luckyblocks.util.WorldEditUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.util.Collections;

public class FountainAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        player.sendMessage("Maybe your wish came true");
        WorldEditUtils.pasteSchematic(block.getWorld(), block.getLocation(), new File("./schem/fountain.schem"));
        ItemStack stack = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName("Coin");
        meta.setLore(Collections.singletonList("Throw this coin into the fountain"));
        stack.setItemMeta(meta);
        player.getInventory().addItem(stack);
    }
}

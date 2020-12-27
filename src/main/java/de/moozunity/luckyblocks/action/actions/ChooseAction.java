package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class ChooseAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        block.getLocation().add(1, 0, 0).getBlock().setType(Material.SPONGE);
        block.getLocation().add(-1, 0, 0).getBlock().setType(Material.SPONGE);
        player.sendMessage("§3Choose one...");
    }
}

package de.moozunity.luckyblocks.action;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public abstract class Action extends ActionUtils {

    public abstract void onOpen(Player player, Block block);

}

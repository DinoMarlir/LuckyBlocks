package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;

import java.util.Random;

public class StackAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        Pig pig = (Pig) spawnEntity(block.getLocation(), EntityType.PIG);
        for (int i = 0; i < new Random().nextInt(20); i++) {
            Entity entity = spawnEntity(pig.getLocation(), EntityType.VILLAGER);
            pig.addPassenger(entity);
        }
    }
}

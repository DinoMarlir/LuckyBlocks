package de.moozunity.luckyblocks.action;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public abstract class ActionUtils {

    public void dropItem(Location location, Material material) {
        location.getWorld().dropItem(location, new ItemStack(material));
    }

    public void dropItem(Location location, Material material, int count) {
        for (int i = 0; i < count; i++) {
            location.getWorld().dropItem(location, new ItemStack(material));
        }
    }

    public void dropItem(Location location, ItemStack stack) {
        location.getWorld().dropItem(location, stack);
    }

    public void dropItem(Location location, ItemStack stack, int count) {
        for (int i = 0; i < count; i++) {
            location.getWorld().dropItem(location, stack);
        }
    }

    public void spawnEntity(Location location, EntityType entitytype, int count) {
        for (int i = 0; i < count; i++) {
            location.getWorld().spawnEntity(location,entitytype);
        }
    }

    public Entity spawnEntity(Location location, EntityType entitytype) {
        return location.getWorld().spawnEntity(location,entitytype);
    }

}

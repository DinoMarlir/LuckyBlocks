package de.moozunity.luckyblocks.action.actions;

import de.moozunity.luckyblocks.action.Action;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BobAction extends Action {
    @Override
    public void onOpen(Player player, Block block) {
        Zombie bob = (Zombie) spawnEntity(block.getLocation(), EntityType.ZOMBIE);
        ItemStack stack = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = stack.getItemMeta();
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        meta.addEnchant(Enchantment.THORNS, 3, false);
        stack.setItemMeta(meta);
        bob.getEquipment().setHelmet(stack);
        stack.setType(Material.DIAMOND_CHESTPLATE);
        bob.getEquipment().setChestplate(stack);
        stack.setType(Material.DIAMOND_LEGGINGS);
        bob.getEquipment().setLeggings(stack);
        stack.setType(Material.DIAMOND_BOOTS);
        bob.getEquipment().setBoots(stack);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2,false);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4,false);
        stack.setItemMeta(meta);
        stack.setType(Material.DIAMOND_SWORD);
        bob.getEquipment().setItemInMainHand(stack);
        bob.setCustomNameVisible(true);
        bob.setCustomName("§e§lBob");
    }
}

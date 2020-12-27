package de.moozunity.luckyblocks;

import de.moozunity.luckyblocks.action.Action;
import de.moozunity.luckyblocks.action.actions.*;
import de.moozunity.luckyblocks.event.BlockBreakEvent;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class LuckyBlocks extends JavaPlugin {

    @Getter
    private static ArrayList<Action> actions = new ArrayList<Action>();

    @Override
    public void onEnable() {
        getLogger().info("Lucky Blocks info");
        Bukkit.getPluginManager().registerEvents(new BlockBreakEvent(), this);
        loadActions();
    }

    @Override
    public void onDisable() {
        getLogger().info("Lucky Blocks disabled");
    }

    private void loadActions() {
        addAction(new AppleAction());
        addAction(new CatAction());
        addAction(new GiantAction());
        addAction(new GoldenArmorAction());
        addAction(new IronToolsAction());
        addAction(new TNTAction());
        addAction(new RandomAction());
        addAction(new WitchAction());
        addAction(new FountainAction());
        addAction(new PotatoAction());
        addAction(new GroundAction());
        addAction(new BobAction());
        addAction(new GottSeiDankLyricsAction());
        addAction(new OreRainAction());
        addAction(new BedrockAction());
        addAction(new ChooseAction());
        addAction(new StackAction());
    }

    public static void addAction(Action action) {
        actions.add(action);
    }

}

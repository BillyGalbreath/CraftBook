package com.sk89q.craftbook.util;

import com.sk89q.craftbook.mechanics.minecart.MoreRails;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.block.Container;

import java.util.ArrayList;
import java.util.List;

public final class RailUtil {

    public static List<Container> getNearbyChests(Block body) {

        int x = body.getX();
        int y = body.getY();
        int z = body.getZ();
        List<Container> containers = new ArrayList<>();
        Block block = body.getWorld().getBlockAt(x, y, z);
        Material type = block.getType();
        if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
            containers.add((Container) block.getState());
        }
        block = body.getWorld().getBlockAt(x - 1, y, z);
        type = block.getType();
        if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
            containers.add((Container) block.getState());
            block = body.getWorld().getBlockAt(x - 2, y, z);
            type = block.getType();
            if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
                containers.add((Container) block.getState());
            }
        }
        block = body.getWorld().getBlockAt(x + 1, y, z);
        type = block.getType();
        if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
            containers.add((Container) block.getState());
            block = body.getWorld().getBlockAt(x + 2, y, z);
            type = block.getType();
            if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
                containers.add((Container) block.getState());
            }
        }
        block = body.getWorld().getBlockAt(x, y, z - 1);
        type = block.getType();
        if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
            containers.add((Container) block.getState());
            block = body.getWorld().getBlockAt(x, y, z - 2);
            type = block.getType();
            if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
                containers.add((Container) block.getState());
            }
        }
        block = body.getWorld().getBlockAt(x, y, z + 1);
        type = block.getType();
        if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
            containers.add((Container) block.getState());
            block = body.getWorld().getBlockAt(x, y, z + 2);
            type = block.getType();
            if (type == Material.CHEST || type == Material.TRAPPED_CHEST || type == Material.BARREL) {
                containers.add((Container) block.getState());
            }
        }

        return containers;
    }

    public static boolean isTrack(Material id) {

        if (MoreRails.instance != null && MoreRails.instance.pressurePlate) {
            if (id == Material.STONE_PRESSURE_PLATE || Tag.WOODEN_PRESSURE_PLATES.isTagged(id) || id == Material.HEAVY_WEIGHTED_PRESSURE_PLATE || id == Material.LIGHT_WEIGHTED_PRESSURE_PLATE)
                return true;
        }
        if (MoreRails.instance != null && MoreRails.instance.ladder) {
            if (id == Material.LADDER || id == Material.VINE) {
                return true;
            }
        }

        return Tag.RAILS.isTagged(id);
    }
}
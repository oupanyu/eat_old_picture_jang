package top.eopj.common.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.common.items.food.NorsFood;
import top.eopj.common.items.food.PictureJangFood;

import static top.eopj.EatOldPictireJiang.MODID;

public class ItemRegistry {
    public static Item pictureJamFood = Registry.register(Registries.ITEM,new Identifier(MODID,"picture_jam_food"),new PictureJangFood(new Item.Settings()));

    public static Item norsFood = Registry.register(Registries.ITEM,new Identifier(MODID,"nors_food"),new NorsFood(new Item.Settings()));


    public static void register(){}
}

package top.eopj.common.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.ModEntities;
import top.eopj.common.block.BlockRegistry;
import top.eopj.common.items.food.GameWaterGu;
import top.eopj.common.items.food.NorsFood;
import top.eopj.common.items.food.PictureJangFood;
import top.eopj.common.items.food.ReservedFood;

import static top.eopj.EatOldPictireJiang.MODID;

public class ItemRegistry {
    public static final Item PICTURE_JAM_FOOD = Registry.register(Registries.ITEM,new Identifier(MODID,"picture_jang_food"),new PictureJangFood(new Item.Settings()));

    public static final Item NORS_FOOD = Registry.register(Registries.ITEM,new Identifier(MODID,"nors_food"),new NorsFood(new Item.Settings()));

    public static final Item RESERVED_FOOD = Registry.register(Registries.ITEM,new Identifier(MODID,"reserved_food"),new ReservedFood(new Item.Settings()));

    public static final Item GAME_WATER_GU = Registry.register(Registries.ITEM,new Identifier(MODID,"gamewater_gu"),new GameWaterGu(new Item.Settings()));

    public static final Item NORTHEAST_SHOVEL = Registry.register(Registries.ITEM,new Identifier(MODID,"northeast_shovel"),
            new NorthEastShovel(ToolMaterials.IRON,1.0f,-3.0f,new Item.Settings()));

    public static final Item TUJAM_BLOCK = Registry.register(Registries.ITEM,id("tujang_block"),new BlockItem(BlockRegistry.TU_JAM_BLOCK,new Item.Settings()));

    public static final Item TWISTED_TUJAM_BLOCK = Registry.register(Registries.ITEM,id("twisted_tujang_block"),new BlockItem(BlockRegistry.TWISTED_TU_BLOCK,new Item.Settings()));

    public static final Item ASTONISHED_TUJAM_BLOCK = Registry.register(Registries.ITEM,id("astonished_tujang_block"),new BlockItem(BlockRegistry.ASTONISHED_TU_BLOCK,new Item.Settings()));


    public static final Item FORTUNE_CAT_SPAWN_EGG = Registry.register(Registries.ITEM,id("fortune_cat_spawn_egg"),new SpawnEggItem(ModEntities.FORTUNE_CAT_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item TU_JANG_SPAWN_EGG = Registry.register(Registries.ITEM,id("tu_jang_spawn_egg"),new SpawnEggItem(ModEntities.TU_JANG_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item NOR_SPAWN_EGG = Registry.register(Registries.ITEM,id("nor_spawn_egg"),new SpawnEggItem(ModEntities.NOR_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item GW_SPAWN_EGG = Registry.register(Registries.ITEM,id("gw_spawn_egg"),new SpawnEggItem(ModEntities.GW_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));


    public static Identifier id(String name){
        return new Identifier(MODID,name);
    }

    public static void register(){}
}

package top.eopj.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.common.items.MrCreativesIndemnify;
import top.eopj.common.items.NorthEastShovel;
import top.eopj.common.items.TuJang;
import top.eopj.common.items.food.GameWaterGu;
import top.eopj.common.items.food.NorsFood;
import top.eopj.common.items.food.PictureJangFood;
import top.eopj.common.items.food.ReservedFood;

import static top.eopj.EatOldPictireJiang.MODID;

public class ModItems {
    public static final Item PICTURE_JAM_FOOD = register(new Identifier(MODID,"picture_jang_food"),new PictureJangFood(new Item.Settings()));

    public static final Item NORS_FOOD = register(new Identifier(MODID,"nors_food"),new NorsFood(new Item.Settings()));

    public static final Item RESERVED_FOOD = register(new Identifier(MODID,"reserved_food"),new ReservedFood(new Item.Settings()));

    public static final Item GAME_WATER_GU = register(new Identifier(MODID,"gamewater_gu"),new GameWaterGu(new Item.Settings()));

    public static final Item NORTHEAST_SHOVEL = register(new Identifier(MODID,"northeast_shovel"),
            new NorthEastShovel(ToolMaterials.IRON,10.0f,-3.0f,new Item.Settings()));

    public static final Item TUJAM_BLOCK = register(id("tujang_block"),new BlockItem(ModBlocks.TU_JAM_BLOCK,new Item.Settings()));

    public static final Item TWISTED_TUJAM_BLOCK = register(id("twisted_tujang_block"),new BlockItem(ModBlocks.TWISTED_TU_BLOCK,new Item.Settings()));

    public static final Item ASTONISHED_TUJAM_BLOCK = register(id("astonished_tujang_block"),new BlockItem(ModBlocks.ASTONISHED_TU_BLOCK,new Item.Settings()));


    public static final Item FORTUNE_CAT_SPAWN_EGG = register(id("fortune_cat_spawn_egg"),new SpawnEggItem(ModEntities.FORTUNE_CAT_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item TU_JANG_SPAWN_EGG = register(id("tu_jang_spawn_egg"),new SpawnEggItem(ModEntities.TU_JANG_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item NOR_SPAWN_EGG = register(id("nor_spawn_egg"),new SpawnEggItem(ModEntities.NOR_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));

    public static final Item GW_SPAWN_EGG = register(id("gw_spawn_egg"),new SpawnEggItem(ModEntities.GW_ENTITY_TYPE,0x39c5bb,0x66ccff,new Item.Settings()));



    public static final Item TUJANG_ORE = register(id("tujang_ore"),new BlockItem(ModBlocks.TUJANG_ORE,new Item.Settings()));

    public static final Item TUJANG_ITEM = register(id("tujang"),new TuJang());

    public static final Item TUJANG_TNT = register(id("tujang_tnt"),new BlockItem(ModBlocks.TUJANGS_COMPUTER_BLOCK,new Item.Settings()));

    public static final Item CREATIVE_INDEMNIFY = register(id("creative_indemnification"),new MrCreativesIndemnify());


    public static Identifier id(String name){
        return new Identifier(MODID,name);
    }

    private static Item register(Identifier id,Item item){ return Registry.register(Registries.ITEM,id,item);}

    public static void register(){}
}

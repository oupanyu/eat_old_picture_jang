package top.eopj.init;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.eopj.common.block.*;

import static top.eopj.EatOldPictireJiang.MODID;

public class ModBlocks {

    public static final Block TU_JAM_BLOCK = Registry.register(Registries.BLOCK,id("tujang_block"),new TuJamBlock());

    public static final Block TWISTED_TU_BLOCK = Registry.register(Registries.BLOCK,id("twisted_tujang_block"),new TwistedTuBlock());

    public static final Block ASTONISHED_TU_BLOCK = Registry.register(Registries.BLOCK,id("astonished_tujang_block"),new AstonishedTuBlock());

    public static final Block TUJANG_ORE = Registry.register(Registries.BLOCK,id("tujang_ore"),new TuJangOre());

    public static final Block TUJANGS_COMPUTER_BLOCK = Registry.register(Registries.BLOCK,id("tujang_tnt"),new TuJangTNTBlock());

    public static Identifier id(String name){
        return new Identifier(MODID,name);
    }

    public static void register(){

    }
}

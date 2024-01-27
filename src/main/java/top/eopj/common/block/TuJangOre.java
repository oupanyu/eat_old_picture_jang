package top.eopj.common.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;

public class TuJangOre extends Block {

    public TuJangOre() {
        super(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).mapColor(MapColor.BLUE));
    }


}

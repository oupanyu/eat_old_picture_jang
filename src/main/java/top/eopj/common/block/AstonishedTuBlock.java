package top.eopj.common.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class AstonishedTuBlock extends Block
{
    private AstonishedTuBlock(Settings settings) {
        super(settings);
    }
    public AstonishedTuBlock(){
        super(FabricBlockSettings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    }
}

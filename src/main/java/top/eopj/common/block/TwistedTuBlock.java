package top.eopj.common.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class TwistedTuBlock extends Block {
    private TwistedTuBlock(Settings settings) {
        super(settings);
    }
    public TwistedTuBlock(){
        super(FabricBlockSettings.copy(Blocks.EMERALD_ORE));
    }
}

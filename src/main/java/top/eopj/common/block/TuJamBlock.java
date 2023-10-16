package top.eopj.common.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class TuJamBlock extends Block {
    private TuJamBlock(Settings settings) {
        super(settings);
    }
    public TuJamBlock(){
        super(FabricBlockSettings.copy(Blocks.STONE));
    }
}

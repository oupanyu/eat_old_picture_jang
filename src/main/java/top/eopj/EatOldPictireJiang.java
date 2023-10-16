package top.eopj;

import net.fabricmc.api.ModInitializer;
import top.eopj.common.block.BlockRegistry;
import top.eopj.common.items.ItemRegistry;

public class EatOldPictireJiang implements ModInitializer {
    public static final String MODID = "eopj";

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        BlockRegistry.register();
        ModGroups.register();
        ModEntities.register();
    }


}

package top.eopj;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.eopj.init.*;

public class EatOldPictireJiang implements ModInitializer {
    public static final String MODID = "eopj";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
        ModGroups.register();
        ModEntities.register();
        ModEntitiesSpawn.addEntitySpawn();
        ModNetworkConstants.register();
        ModWorld.register();
        ModSoundEvent.register();
        ModScreenHandler.register();
    }


}

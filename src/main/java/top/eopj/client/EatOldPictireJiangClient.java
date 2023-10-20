package top.eopj.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import top.eopj.ModEntities;
import top.eopj.client.entity.render.*;

public class EatOldPictireJiangClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(ModEntities.FORTUNE_CAT_ENTITY_TYPE, FortuneCatRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.TU_JANG_ENTITY_TYPE, TuJangEntityRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.NOR_ENTITY_TYPE, NorEntityRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.GW_ENTITY_TYPE, GWEntityRender::new);

    }
}

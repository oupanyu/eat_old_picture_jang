package top.eopj.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import top.eopj.client.entity.render.FortuneCatRender;
import top.eopj.client.entity.render.GWEntityRender;
import top.eopj.client.entity.render.NorEntityRender;
import top.eopj.client.entity.render.TuJangEntityRender;
import top.eopj.init.ModEntities;


public class EatOldPictireJiangClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(ModEntities.FORTUNE_CAT_ENTITY_TYPE, FortuneCatRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.TU_JANG_ENTITY_TYPE, TuJangEntityRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.NOR_ENTITY_TYPE, NorEntityRender::new);
        EntityRendererRegistry.INSTANCE.register(ModEntities.GW_ENTITY_TYPE, GWEntityRender::new);
        ScreenRegister.register();
        ClientConfig.register();
    }
}

package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.client.entity.model.HumanEntityModel;
import top.eopj.common.entity.GameWaterEntity;

public class GWEntityRender extends MobEntityRenderer<GameWaterEntity, HumanEntityModel<GameWaterEntity>> {
    public GWEntityRender(EntityRendererFactory.Context context) {
        super(context, new HumanEntityModel<>(context.getPart(EntityModelLayers.PLAYER)), 0.5f);
        this.addFeature(new HeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));

    }

    @Override
    public Identifier getTexture(GameWaterEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/game_water.png");
    }
}

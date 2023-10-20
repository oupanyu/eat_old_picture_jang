package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.client.entity.model.HumanEntityModel;
import top.eopj.common.entity.TuJangEntity;

public class TuJangEntityRender extends MobEntityRenderer<TuJangEntity, HumanEntityModel<TuJangEntity>> {


    public TuJangEntityRender(EntityRendererFactory.Context ctx) {
        super(ctx, new HumanEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER)), 0.5f);
        this.addFeature(new HeldItemFeatureRenderer<>(this, ctx.getHeldItemRenderer()));

    }

    @Override
    public Identifier getTexture(TuJangEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/tu_jang.png");
    }

}

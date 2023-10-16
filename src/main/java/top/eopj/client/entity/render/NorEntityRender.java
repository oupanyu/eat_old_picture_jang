package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.client.entity.model.HumanEntityModel;
import top.eopj.common.entity.NorEntity;
import top.eopj.common.entity.TuJangEntity;

public class NorEntityRender extends MobEntityRenderer<NorEntity, HumanEntityModel<NorEntity>> {
    public NorEntityRender(EntityRendererFactory.Context ctx) {
        super(ctx, new HumanEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(NorEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/nor.png");
    }
}

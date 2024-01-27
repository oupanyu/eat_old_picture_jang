package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import top.eopj.client.entity.model.FortuneCatModel;
import top.eopj.common.entity.FortuneCat;

public class FortuneCatRender extends MobEntityRenderer<FortuneCat, CatEntityModel<FortuneCat>> {

    public FortuneCatRender(EntityRendererFactory.Context context) {
        super(context, new FortuneCatModel(context.getPart(EntityModelLayers.CAT)), 0.4f);

    }

    @Override
    public Identifier getTexture(FortuneCat entity) {
        return entity.getTexture();
    }
}

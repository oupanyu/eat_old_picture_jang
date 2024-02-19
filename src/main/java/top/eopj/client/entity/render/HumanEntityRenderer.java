package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;
import top.eopj.common.entity.AbstractModHumanEntity;

public abstract class HumanEntityRenderer<T extends AbstractModHumanEntity> extends MobEntityRenderer<T, PlayerEntityModel<T>> {

    public HumanEntityRenderer(EntityRendererFactory.Context context, float f) {
        super(context,new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER),false),f);
    }

    public abstract Identifier getTexture(T entity);




}

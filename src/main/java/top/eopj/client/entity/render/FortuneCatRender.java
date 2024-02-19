package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import top.eopj.client.entity.model.FortuneCatModel;
import top.eopj.common.entity.FortuneCat;

import java.util.List;

public class FortuneCatRender extends MobEntityRenderer<FortuneCat, CatEntityModel<FortuneCat>> {

    public FortuneCatRender(EntityRendererFactory.Context context) {
        super(context, new FortuneCatModel(context.getPart(EntityModelLayers.CAT)), 0.4f);
    }

    @Override
    public Identifier getTexture(FortuneCat entity) {
        return entity.getTexture();
    }

    @Override
    protected void scale(FortuneCat catEntity, MatrixStack matrixStack, float f) {
        super.scale(catEntity, matrixStack, f);
        matrixStack.scale(0.8f, 0.8f, 0.8f);
    }

    @Override
    protected void setupTransforms(FortuneCat catEntity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(catEntity, matrixStack, f, g, h);
        float i = catEntity.getSleepAnimation(h);
        if (i > 0.0f) {
            matrixStack.translate(0.4f * i, 0.15f * i, 0.1f * i);
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerpAngleDegrees(i, 0.0f, 90.0f)));
            BlockPos blockPos = catEntity.getBlockPos();
            List<PlayerEntity> list = catEntity.getWorld().getNonSpectatingEntities(PlayerEntity.class, new Box(blockPos).expand(2.0, 2.0, 2.0));
            for (PlayerEntity playerEntity : list) {
                if (!playerEntity.isSleeping()) continue;
                matrixStack.translate(0.15f * i, 0.0f, 0.0f);
                break;
            }
        }
    }
}

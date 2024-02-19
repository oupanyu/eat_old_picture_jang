package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.common.entity.GameWaterEntity;

public class GWEntityRender extends HumanEntityRenderer<GameWaterEntity> {
    public GWEntityRender(EntityRendererFactory.Context context) {
        super(context, 0.5f);
    }

    @Override
    public Identifier getTexture(GameWaterEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/game_water.png");
    }
}

package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.common.entity.TuJangEntity;

public class TuJangEntityRender extends HumanEntityRenderer<TuJangEntity> {


    public TuJangEntityRender(EntityRendererFactory.Context ctx) {
        super(ctx,0.5f);

    }

    @Override
    public Identifier getTexture(TuJangEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/tu_jang.png");
    }


}

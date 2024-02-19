package top.eopj.client.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;
import top.eopj.common.entity.NorEntity;

public class NorEntityRender extends HumanEntityRenderer<NorEntity> {
    public NorEntityRender(EntityRendererFactory.Context ctx) {
        super(ctx, 0.5f);
    }




    @Override
    public Identifier getTexture(NorEntity entity) {
        return new Identifier(EatOldPictireJiang.MODID, "textures/human/nor.png");
    }
}

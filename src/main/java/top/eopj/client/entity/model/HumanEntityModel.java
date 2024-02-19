package top.eopj.client.entity.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import top.eopj.common.entity.AbstractModHumanEntity;

public class HumanEntityModel<T extends AbstractModHumanEntity> extends PlayerEntityModel<T> {

    public HumanEntityModel(ModelPart root) {
        super(root, false);
    }
}

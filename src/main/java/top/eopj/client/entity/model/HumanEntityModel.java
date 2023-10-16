package top.eopj.client.entity.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.math.random.Random;
import top.eopj.common.entity.AbstractModHumanEntity;
import top.eopj.common.entity.TuJangEntity;

import java.util.List;

public class HumanEntityModel<T extends AbstractModHumanEntity> extends BipedEntityModel<T> {
    private static final String EAR = "ear";
    /**
     * The key of the cloak model part, whose value is {@value}.
     */
    private static final String CLOAK = "cloak";
    /**
     * The key of the left sleeve model part, whose value is {@value}.
     */
    private static final String LEFT_SLEEVE = "left_sleeve";
    /**
     * The key of the right sleeve model part, whose value is {@value}.
     */
    private static final String RIGHT_SLEEVE = "right_sleeve";
    /**
     * The key of the left pants model part, whose value is {@value}.
     */
    private static final String LEFT_PANTS = "left_pants";
    /**
     * The key of the right pants model part, whose value is {@value}.
     */
    private static final String RIGHT_PANTS = "right_pants";
    /**
     * All the parts. Used when picking a part to render stuck arrows.
     */
    private final List<ModelPart> parts;
    public final ModelPart leftSleeve;
    public final ModelPart rightSleeve;
    public final ModelPart leftPants;
    public final ModelPart rightPants;
    public final ModelPart jacket;
    private final ModelPart cloak;
    private final ModelPart ear;
    private final boolean thinArms;

    public HumanEntityModel(ModelPart root) {
        super(root, RenderLayer::getEntityTranslucent);
        this.thinArms = false;
        this.ear = root.getChild(EAR);
        this.cloak = root.getChild(CLOAK);
        this.leftSleeve = root.getChild(LEFT_SLEEVE);
        this.rightSleeve = root.getChild(RIGHT_SLEEVE);
        this.leftPants = root.getChild(LEFT_PANTS);
        this.rightPants = root.getChild(RIGHT_PANTS);
        this.jacket = root.getChild(EntityModelPartNames.JACKET);
        this.parts = root.traverse().filter(part -> !part.isEmpty()).collect(ImmutableList.toImmutableList());
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return Iterables.concat(super.getBodyParts(), ImmutableList.of(this.leftPants, this.rightPants, this.leftSleeve, this.rightSleeve, this.jacket));
    }

    @Override
    public void setAngles(T livingEntity, float f, float g, float h, float i, float j) {
        super.setAngles(livingEntity, f, g, h, i, j);
        this.leftPants.copyTransform(this.leftLeg);
        this.rightPants.copyTransform(this.rightLeg);
        this.leftSleeve.copyTransform(this.leftArm);
        this.rightSleeve.copyTransform(this.rightArm);
        this.jacket.copyTransform(this.body);
        if (((LivingEntity)livingEntity).getEquippedStack(EquipmentSlot.CHEST).isEmpty()) {
            if (((Entity)livingEntity).isInSneakingPose()) {
                this.cloak.pivotZ = 1.4f;
                this.cloak.pivotY = 1.85f;
            } else {
                this.cloak.pivotZ = 0.0f;
                this.cloak.pivotY = 0.0f;
            }
        } else if (((Entity)livingEntity).isInSneakingPose()) {
            this.cloak.pivotZ = 0.3f;
            this.cloak.pivotY = 0.8f;
        } else {
            this.cloak.pivotZ = -1.1f;
            this.cloak.pivotY = -0.85f;
        }
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        this.leftSleeve.visible = visible;
        this.rightSleeve.visible = visible;
        this.leftPants.visible = visible;
        this.rightPants.visible = visible;
        this.jacket.visible = visible;
        this.cloak.visible = visible;
        this.ear.visible = visible;
    }

    @Override
    public void setArmAngle(Arm arm, MatrixStack matrices) {
        ModelPart modelPart = this.getArm(arm);
        if (this.thinArms) {
            float f = 0.5f * (float)(arm == Arm.RIGHT ? 1 : -1);
            modelPart.pivotX += f;
            modelPart.rotate(matrices);
            modelPart.pivotX -= f;
        } else {
            modelPart.rotate(matrices);
        }
    }

}

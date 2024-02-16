package top.eopj.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import top.eopj.ModSoundEvent;

public class TuJangEntity extends AbstractModHumanEntity {

    public TuJangEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }


    @Override
    protected void initGoals() {
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(2, new AttackGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, NorEntity.class,6.0f, 1.0, 1.2));


        this.targetSelector.add(6, new ActiveTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, FortuneCat.class, true));
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = super.tryAttack(target);
        if (bl) {
            float f = this.getWorld().getLocalDifficulty(this.getBlockPos()).getLocalDifficulty();
            if (this.getMainHandStack().isEmpty() && this.isOnFire() && this.random.nextFloat() < f * 0.3f) {
                target.setOnFireFor(2 * (int)f);
            }
        }

        return bl;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSoundEvent.MOB_TUJANG_SAYING;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSoundEvent.MOB_TUJANG_DEATH;
    }
}

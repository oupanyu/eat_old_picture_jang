package top.eopj.utils;

import net.minecraft.util.Identifier;
import top.eopj.EatOldPictireJiang;

public class ModUtils {
    public static Identifier createId(String name){
        return new Identifier(EatOldPictireJiang.MODID,name);
    }
}

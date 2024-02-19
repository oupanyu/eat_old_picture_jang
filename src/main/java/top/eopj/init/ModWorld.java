package top.eopj.init;

import top.eopj.common.world.gen.CFRegister;
import top.eopj.common.world.gen.FeatureRegister;

public class ModWorld {

    public static void register(){
        CFRegister.register();
        FeatureRegister.register();
    }
}

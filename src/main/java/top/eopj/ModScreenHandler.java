package top.eopj;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import top.eopj.screen.handler.MrCreativesIndemnifySHandler;
import top.eopj.utils.ModUtils;

public class ModScreenHandler {

    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(Registries.SCREEN_HANDLER, ModUtils.createId(id), new ScreenHandlerType<T>(factory, FeatureFlags.VANILLA_FEATURES));
    }

    public static final ScreenHandlerType<MrCreativesIndemnifySHandler> MR_CREATIVES_INDEMNIFY_S_HANDLER_SCREEN_HANDLER_TYPE = register("creative_indemnify_screen_handler", MrCreativesIndemnifySHandler::new);
    public static void register(){

    }
}

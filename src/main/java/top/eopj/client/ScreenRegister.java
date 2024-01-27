package top.eopj.client;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import top.eopj.ModScreenHandler;
import top.eopj.client.screen.MrCreativesIndemnifyScreen;

public class ScreenRegister {
    public static void register() {
        ScreenRegistry.register(ModScreenHandler.MR_CREATIVES_INDEMNIFY_S_HANDLER_SCREEN_HANDLER_TYPE, MrCreativesIndemnifyScreen::new);
    }
}

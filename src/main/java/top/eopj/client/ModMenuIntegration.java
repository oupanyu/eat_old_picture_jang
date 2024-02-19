package top.eopj.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.Text;
import top.eopj.client.config.JSONParser;

public class ModMenuIntegration implements ModMenuApi {
    private ConfigBuilder builder;
    private ConfigCategory general;
    private ConfigEntryBuilder entryBuilder;
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            builder = ConfigBuilder.create()
                    .setParentScreen(parent)
                    .setTitle(Text.translatable("config.eopj"));
            general = builder.getOrCreateCategory(Text.translatable("category.config.eopj"));
            entryBuilder = builder.entryBuilder();
            builder.setSavingRunnable(JSONParser::writeToFile);
            initEntry();
            return builder.build();
        };
    }

    private void initEntry(){
        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.eopj.replace.background.enabled"),JSONParser.config.isReplaceBackgroundEnabled())
                .setDefaultValue(false)
                .requireRestart()
                .setTooltip(Text.translatable("config.eopj.tip.replace.background.enabled"))
                .setSaveConsumer(value -> JSONParser.config.setReplaceBackgroundEnabled(value))
                .build());
    }
}

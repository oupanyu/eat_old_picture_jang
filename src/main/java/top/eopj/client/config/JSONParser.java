package top.eopj.client.config;

import blue.endless.jankson.Jankson;
import top.eopj.EatOldPictireJiang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class JSONParser {

    public static final String WORKING_DIR = "config/eopj/";
    public static final String CONFIG_FILE = "clientConfig.json5";
    private static final File configFile = new File(WORKING_DIR+CONFIG_FILE);
    public static EOPJConfig config = new EOPJConfig();
    public static void init() {
        Jankson jankson = Jankson.builder().build();

        if (!configFile.exists()){
            new File(WORKING_DIR).mkdirs();
            try {
                File file = new File(WORKING_DIR+CONFIG_FILE);
                file.createNewFile();
                String content = jankson.toJson(config).toJson();
                FileOutputStream outputStream = new FileOutputStream(file);
                outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                outputStream.close();
            }catch (Exception e){
                e.printStackTrace();
                EatOldPictireJiang.LOGGER.error(e.getMessage());
            }
        }else {
            try {
                FileInputStream fis = new FileInputStream(configFile);
                int n=0;
                StringBuffer sBuffer=new StringBuffer();
                while (n!=-1)  //当n不等于-1,则代表未到末尾
                {
                    n=fis.read();
                    char by=(char) n;
                    sBuffer.append(by);
                }
                String configS = sBuffer.toString();
                config = jankson.fromJson(configS, EOPJConfig.class);
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
                EatOldPictireJiang.LOGGER.error(e.getMessage());
            }

        }


    }
    public static void writeToFile(){
        if (configFile.exists()){
            try {
                Jankson jankson = Jankson.builder().build();
                String content = jankson.toJson(config).toJson();
                FileOutputStream outputStream = new FileOutputStream(configFile,false);
                outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                outputStream.close();
            }catch (Exception e){
                e.printStackTrace();
                EatOldPictireJiang.LOGGER.error(e.getMessage());
            }
        }
    }
}

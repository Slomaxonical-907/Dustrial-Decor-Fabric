package com.slomaxonical.dustrial.decor.configs;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;


public class ConfigResourceCondition {
    public static final Identifier CONFIG = new Identifier("dustrial_decor:config_enabled");
    static {
        ResourceConditions.register(CONFIG, ConfigResourceCondition::configEnabled);
    }
//    public static ConditionJsonProvider config(ConditionJsonProvider config) {
//        return new ConditionJsonProvider() {
//            @Override
//            public void writeParameters(JsonObject object) {
//                object.add("config", config.toJson());
//            }
//
//            @Override
//            public Identifier getConditionId() {
//                return CONFIG;
//            }
//        };
//    }
    public static boolean configEnabled(JsonObject object) {
        String config = JsonHelper.getString(object, "config");
        if (config.equals("enableVerticalSlabs")){
            return AutoConfig.getConfigHolder(DustrialConfigs.class).getConfig().enableVerticalSlabs;
        }else {
        throw new JsonParseException("Invalid config: " + config);
        }
    }

    public static void init(){}
}

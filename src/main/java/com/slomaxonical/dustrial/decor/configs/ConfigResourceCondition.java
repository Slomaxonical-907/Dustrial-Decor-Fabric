package com.slomaxonical.dustrial.decor.configs;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;


public class ConfigResourceCondition {
    public static final Identifier CONFIG = new Identifier("dustrial_decor:config_enabled");
    static {
        ResourceConditions.register(CONFIG, ConfigResourceCondition::configCheck);
    }
    public static ConditionJsonProvider configEnabeled(String config) {
        return new ConditionJsonProvider() {
            @Override
            public void writeParameters(JsonObject object) {
                object.addProperty("config", config);
            }

            @Override
            public Identifier getConditionId() {
                return CONFIG;
            }
        };
    }

    public static boolean configCheck(JsonObject object) {
        String config = JsonHelper.getString(object, "config");
        if (config.equals("enableVerticalSlabs")){
            return AutoConfig.getConfigHolder(DustrialConfigs.class).getConfig().enableVerticalSlabs;
        }else {
            throw new JsonParseException("Invalid config: " + config);
        }
    }

    public static void init(){}
}

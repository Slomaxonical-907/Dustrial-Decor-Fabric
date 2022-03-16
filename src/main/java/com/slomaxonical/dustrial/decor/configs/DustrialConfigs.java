package com.slomaxonical.dustrial.decor.configs;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "dustrial_decor")
 public class DustrialConfigs implements ConfigData {
    String Villager_Comment = "Villagers that already sell AP items will continue to do so regardless of this setting.";
    public boolean enableVillagerTrades = true;
    String Vertical_Comment = "Adds vertical slabs for the OG builders out there";
    public boolean enableVerticalSlabs = false;
}
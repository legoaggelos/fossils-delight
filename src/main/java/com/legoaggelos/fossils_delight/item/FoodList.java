package com.legoaggelos.fossils_delight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodList {
    public static final FoodProperties Escamoles = new FoodProperties.Builder().nutrition(14).saturationMod(1.4F).alwaysEat().build();
    public static final FoodProperties TiktaalikMaki = new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).alwaysEat().build();
    public static final FoodProperties ProtoSukiyaki = new FoodProperties.Builder().nutrition(9).saturationMod(1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,15*20,0),1).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(),180*20,0),1).build();
    public static final FoodProperties CoelacanthSashimi = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties DodoScrambledEggs = new FoodProperties.Builder().nutrition(6).saturationMod(0.3F).build();
    public static final FoodProperties ThawedStew = new FoodProperties.Builder().nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties GingerMegalograptus = new FoodProperties.Builder().nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties RiceInLeave = new FoodProperties.Builder().nutrition(2).saturationMod(1.0F).build();
    public static final FoodProperties JurassicBrochette = new FoodProperties.Builder().nutrition(20).saturationMod(1.6F).build();
    public static final FoodProperties CitipatiWaffles = new FoodProperties.Builder().nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties TrilobiteBoil = new FoodProperties.Builder().nutrition(16).saturationMod(1.2F).build();
}

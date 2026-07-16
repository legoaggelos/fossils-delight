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
    public static final FoodProperties Waffles = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).build();
    public static final FoodProperties CitipatiWafflesExtras = new FoodProperties.Builder().nutrition(12).saturationMod(1.1F).build();
    public static final FoodProperties WafflesExtras = new FoodProperties.Builder().nutrition(7).saturationMod(0.7F).build();
    public static final FoodProperties TrilobiteBoil = new FoodProperties.Builder().nutrition(16).saturationMod(1.2F).build();
    public static final FoodProperties MeganeuraOnAStick = new FoodProperties.Builder().nutrition(16).saturationMod(0.8F).build();
    public static final FoodProperties Psitaco = new FoodProperties.Builder().nutrition(10).saturationMod(0.6F).build();
    public static final FoodProperties Xocolatl = new FoodProperties.Builder().nutrition(6).saturationMod(0.3F).build();
    public static final FoodProperties HotXocolatl = new FoodProperties.Builder().nutrition(6).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,36000/15,0),1).build();
    public static final FoodProperties RawStegoPierogi = new FoodProperties.Builder().nutrition(2).saturationMod(0.0F).build();
    public static final FoodProperties StegoPierogi = new FoodProperties.Builder().nutrition(6).saturationMod(0.2F).build();
    public static final FoodProperties SarcoStirFry = new FoodProperties.Builder().nutrition(10).saturationMod(0.9F).build();
    public static final FoodProperties BrighamTea = new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties QueenOfHearts = new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties VacNMelon = new FoodProperties.Builder().nutrition(7).saturationMod(0.5F).build();
    public static final FoodProperties DryoPunch = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).build();
    public static final FoodProperties PteraFlow = new FoodProperties.Builder().nutrition(9).saturationMod(0.5F).build();
    public static final FoodProperties TyrantBlood = new FoodProperties.Builder().nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties MammothFrost = new FoodProperties.Builder().nutrition(6).saturationMod(0.4F).build();
    public static final FoodProperties DodoDew = new FoodProperties.Builder().nutrition(10).saturationMod(0.5F).build();
    public static final FoodProperties CretaceousCalamitea = new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties BioGooJello = new FoodProperties.Builder().nutrition(8).saturationMod(0.6F).build();
}

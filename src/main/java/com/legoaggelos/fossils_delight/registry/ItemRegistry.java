package com.legoaggelos.fossils_delight.registry;

import com.legoaggelos.fossils_delight.FossilsDelight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.function.Supplier;

import static com.legoaggelos.fossils_delight.registry.RegUtils.regItem;

public class ItemRegistry {
    public static Supplier<Item> Escamoles;
    public static Supplier<Item> TiktaalikMaki;
    public static Supplier<Item> ProtoSukiyaki;
    public static Supplier<Item> CoelacanthSashimi;
    public static Supplier<Item> DodoScrambledEggs;
    public static Supplier<Item> ThawedStew;
    public static Supplier<Item> GingerMegalograptus;
    public static Supplier<Item> RiceInLeave;
    public static Supplier<Item> JurassicBrochette;
    public static Supplier<Item> CitipatiWaffles;
    public static Supplier<Item> WafflesWithExtras;
    public static Supplier<Item> CitipatiWafflesWithExtras;
    public static Supplier<Item> Waffles;
    public static Supplier<Item> TrilobiteBoil;
    public static Supplier<Item> MeganeuraOnAStick;
    public static void register() {
        Escamoles = registerWithTab("escamoles", ()->new ConsumableItem(foodItem(14, 1.4f, Items.BOWL)));
        TiktaalikMaki = registerWithTab("tiktaalik_maki", ()->new ConsumableItem(foodItem(2, 0.2f)));
        ProtoSukiyaki = registerWithTab("proto_sukiyaki", ()->new ConsumableItem(foodItemWithEffects(9, 1.0f, Items.BOWL, new MobEffectInstance[]{
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 15 * 20, 0),
                new MobEffectInstance(ModEffects.NOURISHMENT.get(),180*20,0)
        }), true));
        CoelacanthSashimi = registerWithTab("coelacanth_sashimi", ()->new ConsumableItem(foodItem(3, 0.3f)));
        DodoScrambledEggs = registerWithTab("dodo_scrambled_eggs", ()->new ConsumableItem(foodItem(6, 0.3f, Items.BOWL)));
        ThawedStew = registerWithTab("thawed_stew", ()->new ConsumableItem(foodItem(10, 1.0f, Items.BOWL)));
        GingerMegalograptus = registerWithTab("ginger_megalograptus", ()->new ConsumableItem(foodItem(16, 1.4f, Items.BOWL)));
        RiceInLeave = registerWithTab("rice_in_leave", ()->new ConsumableItem(foodItem(2, 0.1f)));
        JurassicBrochette = registerWithTab("brochette", ()->new ConsumableItem(foodItem(20, 1.6f, Items.STICK)));
        CitipatiWaffles = registerWithTab("citipati_waffles", ()->new ConsumableItem(foodItem(10, 1.0f, Items.BOWL)));
        CitipatiWafflesWithExtras = registerWithTab("citipati_waffles_extra", ()->new ConsumableItem(foodItem(12, 1.1f, Items.BOWL)));
        Waffles = registerWithTab("waffles", ()->new ConsumableItem(foodItem(5, 0.5f)));
        WafflesWithExtras = registerWithTab("waffles_extra", ()->new ConsumableItem(foodItem(7, 0.6f)));
        TrilobiteBoil = registerWithTab("trilobite_boil", ()->new ConsumableItem(foodItem(16, 1.2f, Items.BUCKET)));
        MeganeuraOnAStick = registerWithTab("meganeura_stick", ()->new ConsumableItem(foodItem(16, 0.8f, Items.STICK)));
    }
    public static Item.Properties foodItem(int nutrition, float saturation) {
        return (new Item.Properties().food(new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation).build()));
    }
    public static Item.Properties foodItem(int nutrition, float saturation, Item craftRemainder) {
        return (new Item.Properties().craftRemainder(craftRemainder).food(new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation).build()));
    }
    public static Item.Properties foodItemWithEffects(int nutrition, float saturation, MobEffectInstance[] effects) {
        FoodProperties.Builder item_builder = (new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation));
        for (MobEffectInstance effect: effects){
            item_builder.effect(effect,1);
        }
        return new Item.Properties().food(item_builder.build());
    }
    public static Item.Properties foodItemWithEffects(int nutrition, float saturation, Item craftRemainder, MobEffectInstance[] effects) {
        FoodProperties.Builder item_builder = (new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation));
        for (MobEffectInstance effect: effects){
            item_builder.effect(effect,1);
        }
        return new Item.Properties().craftRemainder(craftRemainder).food(item_builder.build());
    }
    public static Supplier<Item> registerWithTab(String name, Supplier<Item> supplier) {
        Supplier<Item> item = RegUtils.regItem(name, supplier);
        ItemGroupEvents.modifyEntriesEvent(TabRegistry.FOSSILS_DELIGHT_TAB_KEY).register(entries -> entries.accept(item.get()));
        return item;
    }
}
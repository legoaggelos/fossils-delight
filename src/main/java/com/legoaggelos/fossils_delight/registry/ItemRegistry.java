package com.legoaggelos.fossils_delight.registry;

import com.legoaggelos.fossils_delight.FossilsDelight;
import com.legoaggelos.fossils_delight.item.FoodList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FossilsDelight.MODID);
    public static final RegistryObject<Item> Escamoles = ITEMS.register("escamoles",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.Escamoles), true));
    public static final RegistryObject<Item> TiktaalikMaki = ITEMS.register("tiktaalik_maki",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.TiktaalikMaki), true));
    public static final RegistryObject<Item> ProtoSukiyaki = ITEMS.register("proto_sukiyaki",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.ProtoSukiyaki), true));
    public static final RegistryObject<Item> CoelacanthSashimi = ITEMS.register("coelacanth_sashimi",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.CoelacanthSashimi), true));
    public static final RegistryObject<Item> DodoScrambledEggs = ITEMS.register("dodo_scrambled_eggs",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.DodoScrambledEggs), true));
    public static final RegistryObject<Item> ThawedStew = ITEMS.register("thawed_stew",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.ThawedStew), true));
    public static final RegistryObject<Item> GingerMegalograptus = ITEMS.register("ginger_megalograptus",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.GingerMegalograptus), true));
    public static final RegistryObject<Item> RiceInLeave = ITEMS.register("rice_in_leave",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RiceInLeave), true));
    public static final RegistryObject<Item> JurassicBrochette = ITEMS.register("brochette",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.STICK).food(FoodList.JurassicBrochette), true));
    public static final RegistryObject<Item> CitipatiWaffles = ITEMS.register("citipati_waffles",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.CitipatiWaffles), true));
    public static final RegistryObject<Item> Waffles = ITEMS.register("waffles",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.Waffles), true));
    public static final RegistryObject<Item> CitipatiWafflesExtras = ITEMS.register("citipati_waffles_extra",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BOWL).food(FoodList.CitipatiWafflesExtras), true));
    public static final RegistryObject<Item> WafflesExtras = ITEMS.register("waffles_extra",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.WafflesExtras), true));
    public static final RegistryObject<Item> TrilobiteBoil = ITEMS.register("trilobite_boil",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.BUCKET).food(FoodList.TrilobiteBoil), true));
    public static final RegistryObject<Item> MeganeuraOnAStick = ITEMS.register("meganeura_stick",
            () -> new ConsumableItem(new Item.Properties().craftRemainder(Items.STICK).food(FoodList.MeganeuraOnAStick), true));
}

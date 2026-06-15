package com.legoaggelos.fossils_delight.registry;

import com.legoaggelos.fossils_delight.FossilsDelight;
import com.legoaggelos.fossils_delight.item.FoodList;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FossilsDelight.MODID);
    public static final RegistryObject<Item> Escamoles = ITEMS.register("escamoles",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.Escamoles), true));
    public static final RegistryObject<Item> TiktaalikMaki = ITEMS.register("tiktaalik_maki",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.TiktaalikMaki), true));
    public static final RegistryObject<Item> ProtoSukiyaki = ITEMS.register("proto_sukiyaki",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ProtoSukiyaki), true));
    public static final RegistryObject<Item> CoelacanthSashimi = ITEMS.register("coelacanth_sashimi",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.CoelacanthSashimi), true));
    public static final RegistryObject<Item> DodoScrambledEggs = ITEMS.register("dodo_scrambled_eggs",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.DodoScrambledEggs), true));
    public static final RegistryObject<Item> ThawedStew = ITEMS.register("thawed_stew",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ThawedStew), true));
}

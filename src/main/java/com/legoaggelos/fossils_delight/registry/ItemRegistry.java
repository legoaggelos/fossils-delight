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
}

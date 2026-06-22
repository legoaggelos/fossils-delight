package com.legoaggelos.fossils_delight.registry;

import com.legoaggelos.fossils_delight.FossilsDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class TabRegistry {
    public static final ResourceKey<CreativeModeTab> FOSSILS_DELIGHT_TAB_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.tryBuild(FossilsDelight.MOD_ID, "group"));
    public static Supplier<CreativeModeTab> FOSSILS_DELIGHT_TAB;

    public static void register() {
        FOSSILS_DELIGHT_TAB = RegUtils.regTab("group", () -> FabricItemGroup.builder()
                .icon(() -> new ItemStack(ItemRegistry.Escamoles.get()))
                .title(Component.translatable("itemGroup." + FossilsDelight.MOD_ID))
                .build());
    }
}

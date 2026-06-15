package com.legoaggelos.fossils_delight;

import com.github.teamfossilsarcheology.fossil.food.FoodMappingsManager;
import com.legoaggelos.fossils_delight.compat.FossilsArcheologyFeeder;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static com.legoaggelos.fossils_delight.registry.ItemRegistry.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FossilsDelight.MODID)
public class FossilsDelight
{
    public static final String MODID = "fossils_delight";
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("fossils_delight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.fossils_delight_tab"))
            .icon(() -> Escamoles.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(Escamoles.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(TiktaalikMaki.get());
                output.accept(ProtoSukiyaki.get());
                output.accept(CoelacanthSashimi.get());
                output.accept(DodoScrambledEggs.get());
                output.accept(ThawedStew.get());
            }).build());

    public FossilsDelight(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::setup);

        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);
        ITEMS.register(modEventBus);

        FoodMappingsManager.INSTANCE.listen(FossilsArcheologyFeeder::registerFoodMappings);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event)
    {

    }
}

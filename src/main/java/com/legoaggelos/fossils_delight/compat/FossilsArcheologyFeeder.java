package com.legoaggelos.fossils_delight.compat;

import com.github.teamfossilsarcheology.fossil.food.FoodMappingsManager;

import static com.legoaggelos.fossils_delight.registry.ItemRegistry.*;

public class FossilsArcheologyFeeder {
    public static void registerFoodMappings(FoodMappingsManager manager) {
        manager.addFish(CoelacanthSashimi.get());
        manager.addFish(TiktaalikMaki.get());

        manager.addMeat(Escamoles.get());
        manager.addMeat(ProtoSukiyaki.get());

        manager.addEgg(DodoScrambledEggs.get());
    }
}

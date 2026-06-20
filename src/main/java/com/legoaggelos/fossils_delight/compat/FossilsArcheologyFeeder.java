package com.legoaggelos.fossils_delight.compat;

import com.github.teamfossilsarcheology.fossil.food.FoodMappingsManager;

import static com.legoaggelos.fossils_delight.registry.ItemRegistry.*;

public class FossilsArcheologyFeeder {
    public static void registerFoodMappings(FoodMappingsManager manager) {
        manager.addFish(CoelacanthSashimi.get());
        manager.addFish(TiktaalikMaki.get());
        manager.addFish(TrilobiteBoil.get());

        manager.addMeat(Escamoles.get());
        manager.addMeat(ProtoSukiyaki.get());
        manager.addMeat(ThawedStew.get());
        manager.addMeat(GingerMegalograptus.get());
        manager.addMeat(JurassicBrochette.get());
        manager.addMeat(CitipatiWaffles.get());
        manager.addMeat(CitipatiWafflesExtras.get());
        manager.addMeat(MeganeuraOnAStick.get());

        manager.addEgg(DodoScrambledEggs.get());

        manager.addPlant(RiceInLeave.get());
        manager.addPlant(Waffles.get());
        manager.addPlant(WafflesExtras.get());
    }
}

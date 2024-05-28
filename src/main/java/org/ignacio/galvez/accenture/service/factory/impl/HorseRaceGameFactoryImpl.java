package org.ignacio.galvez.accenture.service.factory.impl;

import lombok.Builder;
import org.ignacio.galvez.accenture.domain.Horse;
import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.service.HorseRaceGame;
import org.ignacio.galvez.accenture.service.factory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Builder
public class HorseRaceGameFactoryImpl implements HorseRaceGameFactory {

    private final RaceManagerFactory raceManagerFactory;

    private final HorseLaneFactory horseLaneFactory;

    private final PowerEnhancerFactory powerEnhancerFactory;

    private final HorseFactory horseFactory;

    private  final PitsFactory pitsFactory;

    private static final int MAX_HORSES = 999999999;

    private static final int LENGTH = 100000;
    private static final int MAX_PITS = 40;
    private static final int MAX_ENHANCERS = 20;

    @Override
    public HorseRaceGame create() {

        Random random = new Random();

        int horseCount = random.nextInt() % MAX_HORSES;
        List<HorseLane> horseLanes = new ArrayList<>();
        for (int i = 0; i < horseCount; ++i) {
            Horse horse = horseFactory.createHorse(
                    random.nextInt() % 150,
                    random.nextInt() % 150
            );
            horseLanes.add(HorseLane.builder().horse(horse).length(LENGTH).pits(
                            pitsFactory.createPits(random.nextInt() % MAX_PITS, LENGTH))
                    .enhancers(powerEnhancerFactory.create(random.nextInt() % MAX_ENHANCERS, LENGTH)
                    ).length(LENGTH)
                    .build());
        }


        return null;
    }
}

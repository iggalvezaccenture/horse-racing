package org.ignacio.galvez.accenture.service.impl;

import lombok.Builder;
import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.service.HorseRaceGame;
import org.ignacio.galvez.accenture.service.RaceManager;
import org.ignacio.galvez.accenture.service.factory.RaceManagerFactory;
import org.ignacio.galvez.accenture.threads.HorseLaneThread;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public class HorseRaceGameImpl implements HorseRaceGame {

    private Integer horseCount;
    private RaceManagerFactory raceManagerFactory;
    private List<HorseLane> horseLanes;
    @Override
    public void play() {


        RaceManager raceManager = this.raceManagerFactory.createRaceManager(this.horseCount
        ,horseLanes);
        raceManager.initializeRace();
        raceManager.startRace();

    }

    @Override
    public Integer horseCount() {
        return horseCount;
    }
}

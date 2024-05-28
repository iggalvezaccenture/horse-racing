package org.ignacio.galvez.accenture.service.impl;

import lombok.experimental.SuperBuilder;
import org.ignacio.galvez.accenture.service.RaceManager;

import java.util.concurrent.ExecutorService;

@SuperBuilder
public class VirtualThreadRaceManager extends RaceManager {

    private ExecutorService executorService;


    @Override
    public void initializeRace() {

    }

    @Override
    public void startRace() {

    }

    @Override
    public void endRace() {

    }
}

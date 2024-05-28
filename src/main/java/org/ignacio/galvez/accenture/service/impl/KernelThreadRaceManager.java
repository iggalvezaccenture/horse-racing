package org.ignacio.galvez.accenture.service.impl;

import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.ignacio.galvez.accenture.service.RaceManager;
import org.ignacio.galvez.accenture.threads.HorseLaneThread;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@SuperBuilder
public class KernelThreadRaceManager extends RaceManager {



    private ThreadPoolExecutor threadPoolExecutor;

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

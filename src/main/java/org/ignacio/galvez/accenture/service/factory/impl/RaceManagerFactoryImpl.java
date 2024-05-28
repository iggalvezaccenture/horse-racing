package org.ignacio.galvez.accenture.service.factory.impl;

import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.threads.lockObjects.RaceStatus;
import org.ignacio.galvez.accenture.service.RaceManager;
import org.ignacio.galvez.accenture.service.factory.RaceManagerFactory;
import org.ignacio.galvez.accenture.service.impl.KernelThreadRaceManager;
import org.ignacio.galvez.accenture.service.impl.VirtualThreadRaceManager;
import org.ignacio.galvez.accenture.threads.GoalThread;
import org.ignacio.galvez.accenture.threads.HorseLaneThread;

import java.util.List;
import java.util.stream.Collectors;

public class RaceManagerFactoryImpl implements RaceManagerFactory {
    @Override
    public RaceManager createRaceManager(Integer horseCount, List<HorseLane> horseLanes) {
        RaceStatus raceStatus = new RaceStatus();
        return (Runtime.getRuntime().availableProcessors() >= (horseCount + 1)) ?
                KernelThreadRaceManager.builder()
                        .horseLaneThreads(createHorseLaneThreads(horseLanes,raceStatus))
                        .horseCount(horseCount)
                        .goalThread(new GoalThread(horseCount,raceStatus))
                        .build() :
                VirtualThreadRaceManager.builder()
                        .horseCount(horseCount)
                        .goalThread(new GoalThread(horseCount, raceStatus))
                        .horseLaneThreads(createHorseLaneThreads(horseLanes,raceStatus))
                        .build();
    }

    private static List<HorseLaneThread> createHorseLaneThreads(List<HorseLane> horseLanes,RaceStatus raceStatus) {

        return horseLanes.stream().map(horseLane ->
                HorseLaneThread.builder().horseLane(horseLane).raceStatus(raceStatus).build()).collect(Collectors.toList());
    }
}

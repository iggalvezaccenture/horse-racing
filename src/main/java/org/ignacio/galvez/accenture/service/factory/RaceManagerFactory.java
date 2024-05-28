package org.ignacio.galvez.accenture.service.factory;

import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.service.RaceManager;
import org.ignacio.galvez.accenture.threads.HorseLaneThread;

import java.util.List;

public interface RaceManagerFactory {


    RaceManager createRaceManager(Integer horseCount, List<HorseLane> horseLanes);

}

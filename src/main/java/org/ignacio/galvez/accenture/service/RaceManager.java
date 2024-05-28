package org.ignacio.galvez.accenture.service;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.ignacio.galvez.accenture.threads.GoalThread;
import org.ignacio.galvez.accenture.threads.HorseLaneThread;

import java.util.List;
import java.util.concurrent.ExecutorService;

@SuperBuilder
@Getter
public abstract class RaceManager {

    private Integer horseCount;

    private ExecutorService executorService;
    private List<HorseLaneThread> horseLaneThreads;

    private GoalThread goalThread;

    public abstract void initializeRace();

    public void startRace() {
        this.executorService.submit(this.goalThread);
        for (HorseLaneThread horseLaneThread:horseLaneThreads) {
            this.executorService.submit(horseLaneThread);
        }
    }

    public void endRace() {
        if (executorService.isTerminated()) {
            executorService.close();
        }
    }


}

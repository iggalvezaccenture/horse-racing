package org.ignacio.galvez.accenture.threads;


import lombok.extern.slf4j.Slf4j;
import org.ignacio.galvez.accenture.threads.lockObjects.RaceStatus;
@Slf4j
public class GoalThread extends Thread {

    private final Integer horseCount;
    private final RaceStatus raceStatus;


    private Integer horseOnGoalCount;
    public GoalThread(Integer horseCount, RaceStatus raceStatus) {
        this.horseCount = horseCount;
        this.raceStatus = raceStatus;
        this.horseOnGoalCount = 0;
    }


    public void start(){
        raceStatus.start();
    }

    public void GoalReached(){
        if (horseOnGoalCount.equals(horseCount)){
            raceStatus.end();
        };
    }

    public void horseReachedGoal(){
        horseOnGoalCount += 1;
    }

    @Override
    public void run() {

    }
}

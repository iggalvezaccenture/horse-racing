package org.ignacio.galvez.accenture.threads;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.ignacio.galvez.accenture.domain.Horse;
import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.threads.lockObjects.RaceStatus;

@Builder
@Getter
@Slf4j
public class HorseLaneThread extends Thread {

    private RaceStatus raceStatus;
    private HorseLane horseLane;

    @Override
    public void run() {
        await();
        while (!raceStatus.getFinished()) {
            Horse horse = horseLane.getHorse();
            if (horse.isUp()) {

            }
        }
    }

    private void await() {
        do {
            System.out.print("");
        } while (!raceStatus.getRunning());
    }

}

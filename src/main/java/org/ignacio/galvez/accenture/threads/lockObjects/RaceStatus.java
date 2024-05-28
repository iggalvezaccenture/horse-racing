package org.ignacio.galvez.accenture.threads.lockObjects;

import lombok.Getter;

@Getter
public class RaceStatus {

    private Boolean running;
    private Boolean finished;

    public RaceStatus(){
        running = false;
        finished = false;
    }
    public void start(){
        finished = false;
        running = true;
    }

    public void end(){
        running = false;
        finished = true;
    }
}

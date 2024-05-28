package org.ignacio.galvez.accenture.service.factory.impl;

import org.ignacio.galvez.accenture.domain.Horse;
import org.ignacio.galvez.accenture.service.factory.HorseFactory;

public class SimpleHorseFactory implements HorseFactory {
    @Override
    public Horse createHorse(Integer speed, Integer resistance) {
        return new Horse(speed,resistance);
    }
}

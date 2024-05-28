package org.ignacio.galvez.accenture.service.factory.impl;

import org.ignacio.galvez.accenture.domain.Horse;
import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.domain.Pit;
import org.ignacio.galvez.accenture.domain.PowerEnhancer;
import org.ignacio.galvez.accenture.service.factory.HorseLaneFactory;

import java.util.List;

public class SimpleHorseLaneFactory implements HorseLaneFactory {
    @Override
    public HorseLane create(Integer length, Horse horse, List<Pit> pits, List<PowerEnhancer> enhancers) {
        return HorseLane.builder()
                .horse(horse)
                .length(length)
                .pits(pits)
                .enhancers(enhancers)
                .build();
    }
}

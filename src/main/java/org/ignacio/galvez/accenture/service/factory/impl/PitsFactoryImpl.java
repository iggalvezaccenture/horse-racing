package org.ignacio.galvez.accenture.service.factory.impl;

import org.ignacio.galvez.accenture.domain.Pit;
import org.ignacio.galvez.accenture.service.factory.PitsFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PitsFactoryImpl implements PitsFactory {
    @Override
    public List<Pit> createPits(Integer count, int length) {
        Random random = new Random();
        List<Pit> pits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            pits.add(Pit.builder().position(random.nextInt() % length).build());
        }
        return pits;
    }
}

package org.ignacio.galvez.accenture.service.factory.impl;

import org.ignacio.galvez.accenture.domain.PowerEnhancer;
import org.ignacio.galvez.accenture.service.factory.PowerEnhancerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PowerEnhancerFactoryImpl implements PowerEnhancerFactory {
    @Override
    public List<PowerEnhancer> create(Integer count, int length) {
        Random random = new Random();
        List<PowerEnhancer> enhancers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            enhancers.add(PowerEnhancer.builder()
                    .position(random.nextInt() % length)
                    .build());
        }
        return enhancers;
    }
}

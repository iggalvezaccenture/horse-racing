package org.ignacio.galvez.accenture.service.factory;

import org.ignacio.galvez.accenture.domain.Horse;
import org.ignacio.galvez.accenture.domain.HorseLane;
import org.ignacio.galvez.accenture.domain.Pit;
import org.ignacio.galvez.accenture.domain.PowerEnhancer;

import java.util.List;

public interface HorseLaneFactory {

    HorseLane create(Integer length, Horse horse, List<Pit> pits, List<PowerEnhancer> enhancers);
}

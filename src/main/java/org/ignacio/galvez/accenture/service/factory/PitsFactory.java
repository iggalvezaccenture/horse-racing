package org.ignacio.galvez.accenture.service.factory;

import org.ignacio.galvez.accenture.domain.Pit;

import java.util.List;

public interface PitsFactory {

    List<Pit> createPits(Integer count, int length);
}

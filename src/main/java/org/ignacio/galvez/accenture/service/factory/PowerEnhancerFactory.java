package org.ignacio.galvez.accenture.service.factory;

import org.ignacio.galvez.accenture.domain.PowerEnhancer;

import java.util.List;

public interface PowerEnhancerFactory {

    List<PowerEnhancer> create(Integer size, int length);
}

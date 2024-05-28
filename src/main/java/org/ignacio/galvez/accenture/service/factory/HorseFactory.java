package org.ignacio.galvez.accenture.service.factory;

import org.ignacio.galvez.accenture.domain.Horse;

public interface HorseFactory
{

    Horse createHorse(Integer speed,Integer resistance);
}

package org.ignacio.galvez.accenture.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class HorseLane {
    private Horse horse;
    private Integer length;
    private List<Pit> pits;
    private List<PowerEnhancer> enhancers;
}

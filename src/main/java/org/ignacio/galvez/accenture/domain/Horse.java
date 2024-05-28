package org.ignacio.galvez.accenture.domain;

import lombok.*;


@Data
@EqualsAndHashCode
public class Horse {

    public Horse(Integer speed,Integer resistance){
        this.isUp = true;
        this.position = 0;
        this.speed = speed;
        this.resistance = resistance;
    }


    private boolean isUp;
    private Integer speed;
    private Integer resistance;
    private Integer position;

}

package org.lwx.design.creational.product;

import lombok.Data;

@Data
public class Car {
    private String color;
    private String engine;
    private String wheel;
    public String toString(){
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}

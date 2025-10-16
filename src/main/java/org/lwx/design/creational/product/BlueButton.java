package org.lwx.design.creational.product;

public class BlueButton extends Button {
    public BlueButton(){
        super("Blue");
    }

    @Override
    public void click() {
        System.out.println("blue button click");
    }
}

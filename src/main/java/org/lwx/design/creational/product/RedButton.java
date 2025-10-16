package org.lwx.design.creational.product;

public class RedButton extends Button{
    public RedButton(){
        super("RED");
    }

    @Override
    public void click() {
        System.out.println("red button click");
    }
}

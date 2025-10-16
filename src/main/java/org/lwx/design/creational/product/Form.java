package org.lwx.design.creational.product;

public abstract class Form {
    private final String type;
    protected Form(String appearance) {
        this.type = appearance;
    }
    public void show(){
        System.out.println("You get a :"+ type +" from!");
    }
    public abstract void fill();
}

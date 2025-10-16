package org.lwx.design.creational.product;

public abstract class Button {
    private String type;
    private final String appearance;

    protected Button(String appearance) {
        this.appearance = appearance;
    }

    public void show(){
        System.out.println("You get a :"+appearance+" button!");
    }
    public abstract void click();
}

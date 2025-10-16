package org.lwx.design.creational.product;


public class SimpleForm extends Form {
    public SimpleForm() {
        super("simple");
    }

    @Override
    public void fill() {
        System.out.println("You fill the simple form!");
    }
}

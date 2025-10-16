package org.lwx.design.creational.product;

public class AdvancedForm extends Form {
    public AdvancedForm() {
        super("advanced");
    }

    @Override
    public void fill() {
        System.out.println("You fill the advanced form!");
    }
}

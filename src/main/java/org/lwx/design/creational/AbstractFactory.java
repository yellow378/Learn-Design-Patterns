package org.lwx.design.creational;
import org.lwx.design.creational.product.*;

public abstract class AbstractFactory {
    public abstract Button createButton();
    public abstract Form createForm();

    static class Menu1Factory extends AbstractFactory {
        @Override
        public Button createButton() {
            return new RedButton();
        }

        @Override
        public Form createForm() {
            return new SimpleForm();
        }
    }
    static class Menu2Factory extends AbstractFactory {
        @Override
        public Button createButton() {
            return new BlueButton();
        }

        @Override
        public Form createForm() {
            return new AdvancedForm();
        }
    }


    public static void main(String[] args){
        System.out.println("Menu1:");
        AbstractFactory factory = new Menu1Factory();
        Button button1 = factory.createButton();
        button1.show();
        button1.click();
        Form form1 = factory.createForm();
        form1.show();
        form1.fill();

        System.out.println("Menu2:");
        AbstractFactory factory2 = new Menu2Factory();
        Button button2 = factory2.createButton();
        button2.show();
        button2.click();
        Form form2 = factory2.createForm();
        form2.show();
        form2.fill();
    }
}

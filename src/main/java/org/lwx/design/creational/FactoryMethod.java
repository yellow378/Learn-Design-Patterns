package org.lwx.design.creational;
import org.lwx.design.creational.product.*;

public abstract class FactoryMethod {

    public abstract Button createButton();

    static class RedButtonFactory extends FactoryMethod{
        @Override
        public Button createButton() {
            return new RedButton();
        }
    }
    static class BlueButtonFactory extends FactoryMethod{
        @Override
        public Button createButton() {
            return new BlueButton();
        }
    }


    public static void main(String[] args){
        FactoryMethod redButtonFactory = new RedButtonFactory();
        Button redButton = redButtonFactory.createButton();
        redButton.show();
        redButton.click();
        FactoryMethod blueButtonFactory = new BlueButtonFactory();
        Button blueButton = blueButtonFactory.createButton();
        blueButton.show();
        blueButton.click();


    }
}

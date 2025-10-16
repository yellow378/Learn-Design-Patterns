package org.lwx.design.creational;
import org.lwx.design.creational.product.*;

public class NoFactory {
    public static void main(String[] args){
        Button redButton = new RedButton();
        Button blueButton = new BlueButton();

        redButton.click();
        blueButton.click();
    }


}

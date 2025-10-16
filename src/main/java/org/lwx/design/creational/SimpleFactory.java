package org.lwx.design.creational;
import org.lwx.design.creational.product.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleFactory {
    public static Button createButton(String appearance){
        if(appearance.equals("red")){
            return new RedButton();
        }else if(appearance.equals("blue")){
            return new BlueButton();
        }
        return null;
    }

    public static void main(String[] args) {
        Button redButton = SimpleFactory.createButton("red");
        assert redButton != null;
        redButton.show();
        redButton.click();
        Button blueButton = SimpleFactory.createButton("blue");
        assert blueButton != null;
        blueButton.show();
        blueButton.click();
    }
}

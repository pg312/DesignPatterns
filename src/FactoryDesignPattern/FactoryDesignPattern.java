package FactoryDesignPattern;

import model.Currency;
import model.Euro;
import model.INR;
import model.USD;

/*Problem Statement: Provided we have model.INR currency convert it into model.USD/EURO*/
public class FactoryDesignPattern {

    public void factoryDesignPatternExample(){

        Currency inr = new INR(100.0);
        Currency convertedValue;

        //If needs to convert to model.USD
        convertedValue = new USD(inr.getUnits() * 0.012);
        System.out.println(convertedValue.getUnits());

        //If needs to convert to model.Euro
        convertedValue = new Euro(inr.getUnits() * 0.011);
        System.out.printf("%.2f\n",convertedValue.getUnits());

    }

}

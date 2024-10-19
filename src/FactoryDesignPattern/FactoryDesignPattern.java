package FactoryDesignPattern;

/*Problem Statement: Provided we have FactoryDesignPattern.INR currency convert it into FactoryDesignPattern.USD/EURO*/
public class FactoryDesignPattern {

    public void factoryDesignPatternExample(){

        Currency inr = new INR(100.0);
        Convertor convertor;
        Currency convertedValue;

        //If needs to convert to FactoryDesignPattern.USD
        convertor = new USDConvertor();
        convertedValue = convertor.getConvertedCurrency(inr);
        System.out.println(convertedValue.getUnits());

        //If needs to convert to FactoryDesignPattern.Euro
        convertor = new EuroConverter();
        convertedValue = convertor.getConvertedCurrency(inr);
        System.out.printf("%.2f",convertedValue.getUnits());

    }

}

package AbstractFactoryDesignPattern;

import model.Convertor;
import model.Currency;
import model.INR;
/*Problem Statement:Extending the previous example, instead of factory method doing the
 conversions, we will let the convertors do the conversion*/

public class AbstractFactoryDesignPattern {

    public void abstractFactoryDesignPatternExample() {
        Currency inr = new INR(100.0);
        Convertor convertor;
        Currency convertedValue;

        //If needs to convert to model.USD
        convertor = new USDConvertor();
        convertedValue = convertor.getConvertedCurrency(inr);
        System.out.println(convertedValue.getUnits());

        //If needs to convert to model.Euro
        convertor = new EuroConverter();
        convertedValue = convertor.getConvertedCurrency(inr);
        System.out.printf("%.2f\n",convertedValue.getUnits());
    }
}

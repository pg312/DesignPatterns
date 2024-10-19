package AbstractFactoryDesignPattern;

import model.Convertor;
import model.Currency;
import model.Euro;

public class EuroConverter implements Convertor {
    @Override
    public Currency getConvertedCurrency(Currency currency) {
        return new Euro(currency.getUnits() * 0.011);
    }
}

package AbstractFactoryDesignPattern;

import model.Convertor;
import model.Currency;
import model.USD;

public class USDConvertor implements Convertor {
    @Override
    public Currency getConvertedCurrency(Currency currency) {
        return new USD(currency.getUnits() * 0.012);
    }
}

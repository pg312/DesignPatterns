package FactoryDesignPattern;

public class EuroConverter implements Convertor {
    @Override
    public Currency getConvertedCurrency(Currency currency) {
        return new Euro(currency.getUnits() * 0.011);
    }
}

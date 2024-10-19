package FactoryDesignPattern;

public class USDConvertor implements Convertor {
    @Override
    public Currency getConvertedCurrency(Currency currency) {
        return new USD(currency.getUnits() * 0.012);
    }
}

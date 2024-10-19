package FactoryDesignPattern;

public class USD implements Currency {
    private double units;

    USD(double units){
        this.units = units;
    }

    @Override
    public double getUnits() {
        return units;
    }
}

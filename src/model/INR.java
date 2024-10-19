package model;

public class INR implements Currency {

    private double units;

    public INR(double units) {
        this.units = units;
    }

    @Override
    public double getUnits() {
        return units;
    }
}

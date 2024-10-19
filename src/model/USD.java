package model;

public class USD implements Currency {
    private double units;

    public USD(double units){
        this.units = units;
    }

    @Override
    public double getUnits() {
        return units;
    }
}

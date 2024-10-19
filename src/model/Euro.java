package model;

public class Euro implements Currency {
    private  double units;

    public Euro(double units) {
        this.units = units;
    }


    @Override
    public double getUnits() {
        return units;
    }
}

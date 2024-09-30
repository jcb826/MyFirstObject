package model;


public class Airplane extends Vehicle  {
    private String brand;
    private String shape;
    private Float fuelTankCapacity;
    private Boolean yoke;

    public Airplane() {
    }

    public Airplane(String brand, String shape, Float fuelTankCapacity, Boolean yoke) {
        this.brand = brand;
        this.shape = shape;
        this.fuelTankCapacity = fuelTankCapacity;
        this.yoke = yoke;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(Float fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Boolean getYoke() {
        return yoke;
    }

    public void setYoke(Boolean yoke) {
        this.yoke = yoke;
    }
}

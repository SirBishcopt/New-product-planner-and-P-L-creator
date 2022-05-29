package domain;

public class Ingredient {

    private String name;
    private double pricePerKg;
    private double amountInKgUsedPer1000Units;

    public Ingredient(String name, double pricePerKg, double amountInKgUsedPer1000Units) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.amountInKgUsedPer1000Units = amountInKgUsedPer1000Units;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getAmountInKgUsedPer1000Units() {
        return amountInKgUsedPer1000Units;
    }

}
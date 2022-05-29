package domain;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private List<Ingredient> ingredients;

    public Product(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public double getPricePerOneUnit() {
        double pricePerOneUnit = 0;
        for (Ingredient ingredient : ingredients) {
            pricePerOneUnit += ingredient.getPricePerKg() * ingredient.getAmountInKgUsedPer1000Units() / 1000;
        }
        return pricePerOneUnit;
    }

}
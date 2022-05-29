package services;

import domain.Ingredient;
import domain.Product;

import java.util.List;

public class ProductService {

    public Product createProduct(String name, List<Ingredient> ingredients) {
        return new Product(name, ingredients);
    }

    public Ingredient createIngredient(String name, double pricePerKg, double amountUsedPer1000Units) {
        return new Ingredient(name, pricePerKg, amountUsedPer1000Units);
    }

}
package controllers;

import domain.Ingredient;
import domain.Product;
import services.ProductService;
import user_input.UserInputProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private UserInputProduct userInputProduct;

    public ProductController(UserInputProduct userInputProduct) {
        this.userInputProduct = userInputProduct;
    }

    public Product createProduct() {
        String name = addName();
        List<Ingredient> ingredients = addIngredients();
        ProductService productService = new ProductService();
        Product product = productService.createProduct(name, ingredients);
        return product;

    }

    private String addName() {
        String name = userInputProduct.collectProductsName();
        return name;
    }

    private ArrayList<Ingredient> addIngredients() {
        ProductService productService = new ProductService();
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        boolean addAnotherIngredient = true;

        while (addAnotherIngredient) {
            String name = userInputProduct.collectIngredientsName();
            double pricePerKg = userInputProduct.collectPricePerKg();
            double amountUsedPer1000Units = userInputProduct.collectAmountInKgUsedPer1000Units();
            ingredients.add(productService.createIngredient(name, pricePerKg, amountUsedPer1000Units));
            addAnotherIngredient = userInputProduct.askIfUserWantsToAddAnotherIngredient();
        }
        return ingredients;
    }

}
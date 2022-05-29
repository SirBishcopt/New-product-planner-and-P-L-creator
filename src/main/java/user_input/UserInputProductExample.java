package user_input;

public class UserInputProductExample implements UserInputProduct {

    @Override
    public String collectProductsName() {
        return "Product";
    }

    @Override
    public String collectIngredientsName() {
        return "Ingredient";
    }

    @Override
    public double collectPricePerKg() {
        return 25;
    }

    @Override
    public double collectAmountInKgUsedPer1000Units() {
        return 4;
    }

    @Override
    public boolean askIfUserWantsToAddAnotherIngredient() {
        return false;
    }

}

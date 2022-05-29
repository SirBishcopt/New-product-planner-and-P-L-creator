package user_input;

public interface UserInputProduct {

    String collectProductsName();

    String collectIngredientsName();

    double collectPricePerKg();

    double collectAmountInKgUsedPer1000Units();

    boolean askIfUserWantsToAddAnotherIngredient();

}
package controllers;

import domain.MarketingPlan;
import domain.Product;
import domain.SalesPlan;
import user_input.UserInputMarketingExample;
import user_input.UserInputProductExample;

import java.util.ArrayList;
import java.util.List;

public class BasicController {

    public void start() {

        ProductController productController = new ProductController(new UserInputProductExample());
        Product product = productController.createProduct();

        MarketingController marketingController = new MarketingController(new UserInputMarketingExample());
        MarketingPlan marketingPlan = marketingController.createMarketingPlan();

        SalesController salesController = new SalesController();
        SalesPlan salesPlan = salesController.createSalesPlan();

        PAndLController pAndLController = new PAndLController(product,marketingPlan,salesPlan);
        List <String> pAndLResults = new ArrayList<>();
        pAndLResults = pAndLController.printPAndL();

    }
}
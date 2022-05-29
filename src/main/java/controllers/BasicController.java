package controllers;

import domain.MarketingPlan;
import domain.Product;
import domain.SalesPlan;
import user_input.UserInputProductExample;

import java.util.ArrayList;
import java.util.List;

public class BasicController {

    public void start() {

        System.out.println("First step, create product:");

        ProductController productController = new ProductController(new UserInputProductExample());
        Product product = productController.createProduct();

        System.out.println("Second step, plan your marketing investment:");

        MarketingController marketingController = new MarketingController();
        MarketingPlan marketingPlan = marketingController.createMarketingPlan();

        System.out.println("Third step, plan your sales:");

        SalesController salesController = new SalesController();
        SalesPlan salesPlan = salesController.createSalesPlan();

        System.out.println("Below you will find your Profit and Loss Statement:");

        PAndLController pAndLController = new PAndLController(product,marketingPlan,salesPlan);
        List <String> pAndLResults = new ArrayList<>();
        pAndLResults = pAndLController.printPAndL();

    }
}
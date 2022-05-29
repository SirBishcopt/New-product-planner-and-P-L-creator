package controllers;

import domain.MarketingPlan;
import domain.PAndLResults;
import domain.Product;
import domain.SalesPlan;
import services.PAndLService;

public class PAndLController {

    private Product product;
    private MarketingPlan marketingPlan;
    private SalesPlan salesPlan;

    public PAndLController(Product product, MarketingPlan marketingPlan, SalesPlan salesPlan) {
        this.product = product;
        this.marketingPlan = marketingPlan;
        this.salesPlan = salesPlan;
    }

    public PAndLResults createPAndL() {
        PAndLService pAndLService = new PAndLService();
        return pAndLService.getPAndLResults(product, marketingPlan, salesPlan);
    }

}
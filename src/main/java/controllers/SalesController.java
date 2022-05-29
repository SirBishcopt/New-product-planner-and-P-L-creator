package controllers;

import domain.SalesPlan;
import repositories.Configurator;
import services.SalesService;
import user_input.UserInputSales;

public class SalesController {

    private UserInputSales userInputSales;

    public SalesController(UserInputSales userInputSales) {
        this.userInputSales = userInputSales;
    }

    public SalesPlan createSalesPlan() {
        int[] yearlySalesForEveryPlannedYear = new int[Configurator.getNumberOfYearsPlanned()];
        for (int i = 0; i < yearlySalesForEveryPlannedYear.length; i++) {
            yearlySalesForEveryPlannedYear[i] = userInputSales.collectSales();
        }
        SalesService salesService = new SalesService();
        SalesPlan salesPlan = salesService.createSalesPlan(yearlySalesForEveryPlannedYear);
        return salesPlan;
    }

}
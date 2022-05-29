package services;

import domain.SalesPlan;

public class SalesService {

    public SalesPlan createSalesPlan(int[] yearlySalesForEveryPlannedYear) {
        return new SalesPlan(yearlySalesForEveryPlannedYear);
    }

}

package services;

import domain.MarketingPlan;
import domain.PAndLResults;
import domain.Product;
import domain.SalesPlan;
import repositories.Configurator;

public class PAndLService {

    public PAndLResults getPAndLResults(Product product, MarketingPlan marketingPlan, SalesPlan salesPlan) {
        double[] yearlyPAndLForEveryPlannedYear = new double[Configurator.getNumberOfYearsPlanned()];
        for (int i = 0; i < yearlyPAndLForEveryPlannedYear.length; i++) {
            yearlyPAndLForEveryPlannedYear[i] = product.getPricePerOneUnit() * salesPlan.getYearlySalesForEveryPlannedYear()[i]
                    - marketingPlan.getTotalSpendingsForEveryYear()[i];
        }
        return new PAndLResults(yearlyPAndLForEveryPlannedYear);
    }

}
package domain;

import repositories.Configurator;

import java.util.List;

public class MarketingPlan {

    private List<Investment> investments;

    public MarketingPlan(List<Investment> investments) {
        this.investments = investments;
    }

    public int[] getTotalSpendingsForEveryYear() {
        int[] totalSpendingsForEveryYear = new int[Configurator.getNumberOfYearsPlanned()];
        for (Investment investment : investments) {
            for (int i = 0; i < totalSpendingsForEveryYear.length; i++) {
                totalSpendingsForEveryYear[i] += investment.getYearlySpendingsForEveryPlannedYear()[i];
            }
        }
        return totalSpendingsForEveryYear;
    }

}
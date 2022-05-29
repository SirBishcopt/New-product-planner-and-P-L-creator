package services;

import domain.Investment;
import domain.MarketingPlan;

import java.util.List;

public class MarketingService {

    public MarketingPlan createMarketingPlan(List<Investment> investments) {
        return new MarketingPlan(investments);
    }

    public Investment createInvestment(String name, int[] yearlySpendingsForEveryPlannedYear){
        return new Investment(name, yearlySpendingsForEveryPlannedYear);
    }

}
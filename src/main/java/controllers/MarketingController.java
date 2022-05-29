package controllers;

import domain.Investment;
import domain.MarketingPlan;
import repositories.Configurator;
import services.MarketingService;
import user_input.UserInputMarketing;

import java.util.ArrayList;
import java.util.List;

public class MarketingController {

    private UserInputMarketing userInputMarketing;

    public MarketingController(UserInputMarketing userInputMarketing) {
        this.userInputMarketing = userInputMarketing;
    }

    public MarketingPlan createMarketingPlan() {
        List<Investment> investments = addInvestments();
        MarketingService marketingService = new MarketingService();
        MarketingPlan marketingPlan = marketingService.createMarketingPlan(investments);
        return marketingPlan;
    }

    private ArrayList<Investment> addInvestments() {
        MarketingService marketingService = new MarketingService();
        ArrayList<Investment> investments = new ArrayList<>();

        boolean addAnotherInvestment = true;

        while (addAnotherInvestment) {
            String name = userInputMarketing.collectInvestmentsName();
            int[] yearlySpendingsForEveryPlannedYear = new int[Configurator.getNumberOfYearsPlanned()];
            for (int i = 0; i < yearlySpendingsForEveryPlannedYear.length; i++) {
                yearlySpendingsForEveryPlannedYear[i] = userInputMarketing.collectSpending();
            }
            investments.add(marketingService.createInvestment(name, yearlySpendingsForEveryPlannedYear));
            addAnotherInvestment = userInputMarketing.askIfUserWantsToAddAnotherInvestment();
        }
        return investments;
    }

}
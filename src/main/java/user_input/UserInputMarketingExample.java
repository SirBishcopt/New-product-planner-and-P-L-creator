package user_input;

public class UserInputMarketingExample implements UserInputMarketing {

    @Override
    public String collectInvestmentsName() {
        return "TV advertising";
    }

    @Override
    public int collectSpending() {
        return 500000;
    }

    @Override
    public boolean askIfUserWantsToAddAnotherInvestment() {
        return false;
    }

}

package domain;

public class SalesPlan {

    private int[] yearlySalesForEveryPlannedYear;

    public SalesPlan(int[] yearlySalesForEveryPlannedYear) {
        this.yearlySalesForEveryPlannedYear = yearlySalesForEveryPlannedYear;
    }

    public int[] getYearlySalesForEveryPlannedYear() {
        return yearlySalesForEveryPlannedYear;
    }

}
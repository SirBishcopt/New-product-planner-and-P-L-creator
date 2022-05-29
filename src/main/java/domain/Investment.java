package domain;

public class Investment {

    private String name;
    private int[] yearlySpendingsForEveryPlannedYear;

    public Investment(String name, int[] yearlySpendingsForEveryPlannedYear) {
        this.name = name;
        this.yearlySpendingsForEveryPlannedYear = yearlySpendingsForEveryPlannedYear;
    }

    public int[] getYearlySpendingsForEveryPlannedYear() {
        return yearlySpendingsForEveryPlannedYear;
    }

}
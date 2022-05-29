package domain;

public class PAndLResults {

    private double[] yearlyPAndLForEveryPlannedYear;

    public PAndLResults(double[] yearlyPAndLForEveryPlannedYear) {
        this.yearlyPAndLForEveryPlannedYear = yearlyPAndLForEveryPlannedYear;
    }

    public double[] getYearlyPAndLForEveryPlannedYear() {
        return yearlyPAndLForEveryPlannedYear;
    }

}
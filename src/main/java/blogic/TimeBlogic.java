package blogic;

public class TimeBlogic {
    public double secondsToMinutes(double num1) {
        return num1 / 60;
    }

    public double secondsToHours(double num1) {
        return num1 / 3600;
    }

    public double secondsToDays(double num1) {
        return num1 / 86400;
    }

    public double secondsToWeek(double num1) {
        return num1 / 604800;
    }

    public double secondsToMonth(double num1) {
        return num1 / 2.628e+6;
    }

    public double secondsToYear(double num1) {
        return num1 / 3.154e+7;
    }
}

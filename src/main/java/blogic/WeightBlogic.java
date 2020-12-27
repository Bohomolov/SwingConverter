package blogic;

public class WeightBlogic {
    public double kgToG(double num1) {
        return num1 * 1000;
    }

    public double kgToCarats(double num1) {
        return num1 * 5000;
    }

    public double kgToEngPounds(double num1) {
        return num1 / 0.45359237;

    }

    public double kgToPounds(double num1) {
        return num1 * 2.2;
    }

    public double kgToStone(double num1) {
        return num1 / 6.35;
    }

    public double kgToRusPounds(double num1) {
        return num1 / 16.38;
    }
}

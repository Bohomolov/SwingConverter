package blogic;

public class TemperatureBlogic {
    public double cToK(double c) {
        return c + 273.15;
    }

    public double kToC(double k) {
        return k - 273.15;
    }

    public double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public double reToC(double re) {
        return re / 0.8;
    }

    public double cToRe(double c) {
        return c * 0.8;
    }

    public double raToC(double ra) {
        return (ra - 459.67 - 32) / 1.8;
    }

    public double cToRa(double c) {
        return c * 1.8 + 32 + 459.67;
    }

    public double roToC(double ro) {
        return ((ro - 7.5) / 21 * 40);
    }

    public double cToRo(double c) {
        return c * 21 / 40 + 7.5;
    }

    public double nToC(double n) {
        return n / 0.33000;
    }

    public double cToN(double c) {
        return c * 0.33000;
    }

    public double cToD(double c) {
        return (100 - c) * 3 / 2;
    }

    public double dToC(double d) {
        return (d / 3 * 2) - 100;
    }
}

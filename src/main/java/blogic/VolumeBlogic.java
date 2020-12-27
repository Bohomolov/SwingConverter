package blogic;

public class VolumeBlogic {
    public double lToM3(double l) {
        return l / 1000;
    }

    public double lToGallon(double l) {
        return l / 3.785;
    }

    public double lToPint(double l) {
        return l * 2.113;
    }

    public double lToQuart(double l) {
        return l * 1.057;
    }

    public double lToBarrel(double l) {
        return l / 117;
    }

    public double lToCubicFoot(double l) {
        return l / 28.317;
    }

    public double lToCubicInch(double l) {
        return l * 61.024;
    }
}

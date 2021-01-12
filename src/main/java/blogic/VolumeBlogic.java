package blogic;

public class VolumeBlogic {
    public double lToM3(double l) {
        return l / 1000;
    }

    public double m3Tol(double m3) {
        return m3 * 1000;
    }

    public double lToGallon(double l) {
        return l / 3.785;
    }

    public double gallonToL(double gallon) {
        return gallon * 3.785;
    }

    public double lToPint(double l) {
        return l * 2.113;
    }

    public double pintToL(double pint) {
        return pint / 2.113;
    }

    public double lToQuart(double l) {
        return l * 1.057;
    }

    public double quartToL(double quart) {
        return quart * 1.057;
    }

    public double lToBarrel(double l) {
        return l / 117;
    }

    public double barrelToL(double barrel) {
        return barrel * 117;
    }

    public double lToCubicFoot(double l) {
        return l / 28.317;
    }

    public double cubicFootToL(double foot) {
        return foot * 28.317;
    }

    public double lToCubicInch(double l) {
        return l * 61.024;
    }

    public double cubicInchToL(double inch) {
        return inch / 61.024;
    }
}

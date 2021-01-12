package blogic;

public class LengthBlogic {
    public double mToKm(double m) {
        return m / 1000;
    }
    public double kmToM(double km) {
        return km * 1000;
    }

    public double mToMile(double m) {
        return m / 1609;
    }
    public double mileToM(double mile) {
        return mile * 1609;
    }

    public double mToNauticalMile(double m) {
        return m / 1852;
    }
    public double nauticalMileToM(double nauticalMile) {
        return nauticalMile * 1852;
    }

    public double mToCable(double m) {
        return m * 0.00539956803455724;
    }
    public double cableToM(double cable) {
        return cable / 0.00539956803455724;
    }

    public double mToLeague(double m) {
        return m / 5556;
    }
    public double leagueToM(double league) {
        return league * 5556;
    }

    public double mToFoot(double m) {
        return m * 3.281;
    }
    public double footToM(double foot) {
        return foot / 3.281;
    }

    public double mToYard(double m) {
        return m * 1.094;
    }
    public double yardToM(double yard) {
        return yard * 1.094;
    }


}

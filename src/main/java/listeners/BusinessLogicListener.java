package listeners;


import blogic.*;
import viev.Converter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusinessLogicListener implements ActionListener {
    private final TextField firstCategoriesValue;
    private final TextField secondCategoriesValue;
    private final TextField firstValue;
    private final TextField secondValue;
    private final Converter converter;
    private final TimeBlogic timeBlogic;
    private final WeightBlogic weightBlogic;
    private final TemperatureBlogic temperatureBlogic;
    private final LengthBlogic lengthBlogic;
    private final VolumeBlogic volumeBlogic;


    public BusinessLogicListener( TextField firstCategoriesValue, TextField secondCategoriesValue, TextField firstValue, TextField secondValue, Converter converter) {

        this.firstCategoriesValue = firstCategoriesValue;
        this.secondCategoriesValue = secondCategoriesValue;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.converter = converter;
        timeBlogic = new TimeBlogic();
        weightBlogic = new WeightBlogic();
        temperatureBlogic = new TemperatureBlogic();
        lengthBlogic = new LengthBlogic();
        volumeBlogic = new VolumeBlogic();
    }
    private String output;
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(firstValue.getText());
        double result = 0;
        if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("min")) {
            result = timeBlogic.secondsToMinutes(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("hour")){
            result = timeBlogic.secondsToHours(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("Day")){
            result = timeBlogic.secondsToDays(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("Week")){
            result = timeBlogic.secondsToWeek(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("Month")){
            result = timeBlogic.secondsToMonth(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("S") && secondCategoriesValue.getText().equalsIgnoreCase("Year")){
            result = timeBlogic.secondsToYear(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("g")){
            result = weightBlogic.kgToG(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("carat")){
            result = weightBlogic.kgToCarats(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("eng pound")){
            result = weightBlogic.kgToEngPounds(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("pound")){
            result = weightBlogic.kgToPounds(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("stone")){
            result = weightBlogic.kgToStone(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("kg") && secondCategoriesValue.getText().equalsIgnoreCase("rus pound")){
            result = weightBlogic.kgToRusPounds(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("k")){
            result = temperatureBlogic.cToK(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("f")){
            result = temperatureBlogic.cToF(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("Ro")){
            result = temperatureBlogic.cToRo(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("Re")){
            result = temperatureBlogic.cToRe(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("Ra")){
            result = temperatureBlogic.cToRa(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("N")){
            result = temperatureBlogic.cToN(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("c") && secondCategoriesValue.getText().equalsIgnoreCase("D")){
            result = temperatureBlogic.cToD(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("km")){
            result = lengthBlogic.mToKm(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("mile")){
            result = lengthBlogic.mToMile(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("nautical mile")){
            result = lengthBlogic.mToNauticalMile(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("cable")){
            result = lengthBlogic.mToCable(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("league")){
            result = lengthBlogic.mToLeague(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("foot")){
            result = lengthBlogic.mToFoot(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("m") && secondCategoriesValue.getText().equalsIgnoreCase("yard")){
            result = lengthBlogic.mToYard(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("m^3")){
            result = volumeBlogic.lToM3(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("gallon")){
            result = volumeBlogic.lToGallon(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("pint")){
            result = volumeBlogic.lToPint(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("quart")){
            result = volumeBlogic.lToQuart(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("barrel")){
            result = volumeBlogic.lToBarrel(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("cubic foot")){
            result = volumeBlogic.lToCubicFoot(num1);
        }else if (firstCategoriesValue.getText().equalsIgnoreCase("l") && secondCategoriesValue.getText().equalsIgnoreCase("cubic inch")){
            result = volumeBlogic.lToCubicInch(num1);
        }
        secondValue.setText(String.valueOf(result));
    }

}


package utils.tmp;

import viev.Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ViveListener implements ItemListener {
    private final JComboBox categories;
    private final JComboBox firstCategoriesValue;
    private final TextField firstValue;
    private final TextField secondValue;
    private final JComboBox secondCategoriesValue;
    private final Converter converter;


    public ViveListener(JComboBox categories, JComboBox firstCategoriesValue, JComboBox secondCategoriesValue, TextField firstValue, TextField secondValue,Converter converter) {
        this.categories = categories;
        this.firstCategoriesValue = firstCategoriesValue;
        this.secondCategoriesValue = secondCategoriesValue;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.converter = converter;
    }

    public void itemStateChanged(ItemEvent e) {
        String[] categoriesItems = {
                "Time",
                "Weight",
                "Temperature",
                "Volume",
                "Length"
        };
        if (categories.getSelectedItem() == "Time") {
            String[] timeArray = {
                    "Sec",
                    "Min",
                    "Hour",
                    "Day",
                    "Week",
                    "Month",
                    "Astronomical Year"};
            firstCategoriesValue.removeAllItems();
            secondCategoriesValue.removeAllItems();
            for (int i = 0; i < timeArray.length; i++) {
                firstCategoriesValue.addItem(timeArray[i]);
                secondCategoriesValue.addItem(timeArray[i]);
            }
        } else if (categories.getSelectedItem() == "Weight") {
            String[] weightArray = {
                    "kg",
                    "g",
                    "carat",
                    "eng pound",
                    "pound",
                    "stone",
                    "rus pound"
            };

            firstCategoriesValue.removeAllItems();
            secondCategoriesValue.removeAllItems();
            for (int i = 0; i < weightArray.length; i++) {
                firstCategoriesValue.addItem(weightArray[i]);
                secondCategoriesValue.addItem(weightArray[i]);
            }

        } else if (categories.getSelectedItem() == "Temperature") {
            String[] temperatureArray = {
                    "C",
                    "K",
                    "F",
                    "Re",
                    "Ro",
                    "Ra",
                    "N",
                    "D"
            };
            firstCategoriesValue.removeAllItems();
            secondCategoriesValue.removeAllItems();
            for (int i = 0; i < temperatureArray.length; i++) {
                firstCategoriesValue.addItem(temperatureArray[i]);
                secondCategoriesValue.addItem(temperatureArray[i]);
            }
        } else if (categories.getSelectedItem() == "Volume") {
            String[] volumeArray = {
                    "l",
                    "m^3",
                    "gallon",
                    "pint",
                    "quart",
                    "barrel",
                    "cubic foot",
                    "cubic inch"
            };
            firstCategoriesValue.removeAllItems();
            secondCategoriesValue.removeAllItems();
            for (int i = 0; i < volumeArray.length; i++) {
                firstCategoriesValue.addItem(volumeArray[i]);
                secondCategoriesValue.addItem(volumeArray[i]);
            }
        } else if (categories.getSelectedItem() == "Length") {
            String[] lengthArray = {
                    "m",
                    "km",
                    "mile",
                    "nautical mile",
                    "cable",
                    "league",
                    "foot",
                    "yard"
            };
            firstCategoriesValue.removeAllItems();
            secondCategoriesValue.removeAllItems();
            for (int i = 0; i < lengthArray.length; i++) {
                firstCategoriesValue.addItem(lengthArray[i]);
                secondCategoriesValue.addItem(lengthArray[i]);
            }
        }
       double num1  = Double.parseDouble(firstValue.getText());
    }

}

package listeners;


import viev.Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusinessLogicListener implements ActionListener {
    private final JComboBox categories;
    private final JComboBox firstCategories;
    private final JComboBox secondCategories;
    private final TextField firstValue;
    private final TextField secondValue;
    private final Converter converter;


    public BusinessLogicListener(JComboBox categories, JComboBox firstCategories, JComboBox secondCategories, TextField firstValue, TextField secondValue, Converter converter) {
        this.categories = categories;
        this.firstCategories = firstCategories;
        this.secondCategories = secondCategories;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.converter = converter;
    }
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(firstValue.getText());
        double result = 0;
        if (firstCategories.getSelectedItem() == "Sec"&&secondCategories.getSelectedItem() == "min"){
            result = num1 * 60;
        }
        secondValue.setText(String.valueOf(result));
    }

}

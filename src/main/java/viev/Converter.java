package viev;

import listeners.BusinessLogicListener;
import utils.Constants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Converter extends JFrame {
    private final JLabel firstCategoriesValueLabel;
    private final TextField firstCategoriesValue;
    private final JLabel secondCategoriesValueLabel;
    private final TextField secondCategoriesValue;
    private final TextField firstValue;
    private final TextField secondValue;
    private final JLabel helper;
    private final JLabel setValue;
    private final JLabel resultValueLabel;
    private final JLabel helper1;
    private final JLabel helperTime;
    private final JLabel helperWeight;
    private final JLabel helperTemperature;
    private final JLabel helperVolume;
    private final JLabel helperLength;
    private final JButton result;
    private Converter converter;

    public Converter(String name) {
        super(name);

        firstCategoriesValueLabel = new JLabel(Constants.FIRST_PARAMETER);
        firstCategoriesValue = new TextField();

        secondCategoriesValueLabel = new JLabel(Constants.SECOND_PARAMETER);
        secondCategoriesValue = new TextField();

        firstValue = new TextField();
        secondValue = new TextField();
        helper = new JLabel(Constants.HELPER_TEXT_1);
        setValue = new JLabel(Constants.SET_VALUE);
        resultValueLabel = new JLabel(Constants.RESULT_VALUE);
        helper1 = new JLabel(Constants.HELPER_TEXT_2);
        helperTime = new JLabel(Constants.HELPER_TEXT_TIME);
        helperWeight = new JLabel(Constants.HELPER_TEXT_WEIGHT);
        helperTemperature = new JLabel(Constants.HELPER_TEXT_TEMPERATURE);
        helperVolume = new JLabel(Constants.HELPER_TEXT_VOLUME);
        helperLength = new JLabel(Constants.HELPER_TEXT_LENGTH);
        result = new JButton(Constants.CONVERT);

        ActionListener listener = new BusinessLogicListener(firstCategoriesValue, secondCategoriesValue, firstValue, secondValue, this);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 550, 360);
        setTitle(Constants.CONVERTER);

        setVisible(true);
        setResizable(false);
        setLayout(null);
        setFocusable(true);


        add(firstCategoriesValueLabel);
        firstCategoriesValueLabel.setBounds(95, 5, 200, 20);
        add(firstCategoriesValue);
        firstCategoriesValue.addActionListener(listener);
        firstCategoriesValue.setBounds(95, 30, 170, 20);

        add(secondCategoriesValueLabel);
        secondCategoriesValueLabel.setBounds(285, 5, 200, 20);
        add(secondCategoriesValue);
        secondCategoriesValue.addActionListener(listener);
        secondCategoriesValue.setBounds(285, 30, 170, 20);

        add(setValue);
        setValue.setBounds(95,60, 170 , 20);
        add(resultValueLabel);
        resultValueLabel.setBounds(285,60, 170 , 20);

        add(firstValue);
        firstValue.addActionListener(listener);
        firstValue.setBounds(95, 85, 170, 20);

        add(secondValue);
        secondValue.addActionListener(listener);
        secondValue.setBounds(285, 85, 170, 20);
        secondValue.setEditable(false);

        add(result);
        result.addActionListener(listener);
        result.setBounds(95, 125, 360, 30);

        add(helper);
        helper.setBounds(10, 165, 360,30);
        add(helper1);
        helper1.setBounds(10, 185, 480,30);
        add(helperTime);
        helperTime.setBounds(10, 205, 480,30);
        add(helperTemperature);
        helperTemperature.setBounds(10, 225, 480,30);
        add(helperWeight);
        helperWeight.setBounds(10, 245, 500,30);
        add(helperVolume);
        helperVolume.setBounds(10, 265, 540,30);
        add(helperLength);
        helperLength.setBounds(10, 285, 540,30);
    }
}
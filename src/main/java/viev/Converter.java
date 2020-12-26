package viev;

import listeners.BusinessLogicListener;
import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Converter extends JFrame {
    private final JLabel categoriesLabel;
    private final JComboBox categories;
    private final JLabel firstCategoriesValueLabel;
    private final JComboBox firstCategoriesValue;
    private final JLabel secondCategoriesValueLabel;
    private final JComboBox secondCategoriesValue;
    private final TextField firstValue;
    private final TextField secondValue;
    private final JButton result;
    private final ViveListener viveListener;
    private Converter converter;

    public Converter(String name) {
        super(name);
        String[] categoriesItems = {
                "Time",
                "Weight",
                "Temperature",
                "Volume",
                "Length"
        };

        categoriesLabel = new JLabel(Constants.CATEGORIES);
        categories = new JComboBox(categoriesItems);

        firstCategoriesValueLabel = new JLabel(Constants.FIRST_PARAMETER);
        firstCategoriesValue = new JComboBox();

        secondCategoriesValueLabel = new JLabel(Constants.SECOND_PARAMETER);
        secondCategoriesValue = new JComboBox();

        firstValue = new TextField();
        secondValue = new TextField();

        result = new JButton(Constants.CONVERT);

        viveListener = new ViveListener(categories,firstCategoriesValue,secondCategoriesValue,firstValue,secondValue);
        ActionListener listener = new BusinessLogicListener(categories, firstCategoriesValue, secondCategoriesValue, firstValue, secondValue, this.converter);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 350);
        setTitle(Constants.CONVERTER);

        setVisible(true);
        setResizable(false);
        setLayout(null);
        setFocusable(true);

        add(categoriesLabel);
        categoriesLabel.setBounds(200, 5, 200, 30);
        add(categories);
        categories.addItemListener(viveListener);
//        categories.addActionListener(listener);
        categories.setBounds(70, 40, 360, 30);

        add(firstCategoriesValueLabel);
        firstCategoriesValueLabel.setBounds(70, 75, 200, 30);
        add(firstCategoriesValue);
//        firstCategoriesValue.addItemListener(viveListener);
//        firstCategoriesValue.addActionListener(listener);
        firstCategoriesValue.setBounds(70, 100, 170, 30);

        add(secondCategoriesValueLabel);
        secondCategoriesValueLabel.setBounds(260, 75, 200, 30);
        add(secondCategoriesValue);
//        secondCategoriesValue.addItemListener(viveListener);
//        secondCategoriesValue.addActionListener(listener);
        secondCategoriesValue.setBounds(260, 100, 170, 30);

        add(firstValue);
//        firstValue.add;
        firstValue.addActionListener(listener);
        firstValue.setBounds(70, 160, 170, 20);

        add(secondValue);
//        secondValue.addActionListener(listener);
        secondValue.setBounds(260, 160, 170, 20);
        secondValue.setEditable(false);

        add(result);
//        result.addActionListener(listener);
        result.setBounds(70, 220, 360, 40);
    }
}
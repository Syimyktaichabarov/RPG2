package com.company;

import javax.swing.*;
import java.awt.*;

public class Viewer {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    Viewer() {
        Controller controller = new Controller(this);


        JLabel label1 = new JLabel("Litres:");
        label1.setFont(new Font("Italic", Font.BOLD, 20));
        label1.setBounds(25, 25, 150, 30);
        label1.setOpaque(true);

        JLabel label2 = new JLabel("KM:");
        label2.setFont(new Font("Italic", Font.BOLD, 20));
        label2.setBounds(25, 85, 150, 30);
        label2.setOpaque(true);

        JLabel label3 = new JLabel("Result:");
        label3.setFont(new Font("Italic", Font.BOLD, 20));
        label3.setBounds(25, 205, 150, 30);
        label3.setOpaque(true);

        textField1 = new JTextField();
        textField1.setBounds(150, 20, 260, 40);

        textField2 = new JTextField();
        textField2.setBounds(150, 80, 260, 40);

        textField3 = new JTextField();
        textField3.setBounds(150, 200, 260, 40);
        textField3.setEditable(false);

        JButton buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(150, 140, 260, 40);
        buttonCalculate.addActionListener(controller);

        JFrame frame = new JFrame("RPG");
        frame.setSize(500, 300);
        frame.setLocation(800, 200);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(buttonCalculate);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public String getValueOne() {
        String value1 = textField1.getText();
        return value1;
    }

    public String getValueTwo() {
        String value2 = textField2.getText();
        return value2;
    }

    public void update(String text) {
        textField3.setText(text);
    }
}


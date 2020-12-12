package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass implements ActionListener {

    JFrame frame;
    JTextField textField;
    JPanel panel;

    //Font
    Font textFont = new Font("Ink Free", Font.BOLD, 30);
    //Font

    //-----------------Buttons array-------------//

    JButton[] numbersButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];

    //-----------------Buttons array-------------//

    //-----------------Signs Buttons-------------//
    //(4)
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;

    //-----------------Signs Buttons-------------//


    //-----------------Some other Buttons-------------//
    //(4)
    JButton decButton;
    JButton equButton;
    JButton delButton;
    JButton clrButton;
    JButton negButton;

    //-----------------Some other Buttons-------------//

    //Variable
    double num1, num2, result;
    char operator;

    MainClass() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(3);

        frame.setSize(420, 550);
        frame.setLayout(null);

        //textField
        textField = new JTextField(67);
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(textFont);
        textField.setEditable(false);

        //Button
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(textFont);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numbersButtons[i] = new JButton(String.valueOf(i));
            numbersButtons[i].addActionListener(this);
            numbersButtons[i].setFont(textFont);
            numbersButtons[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        //panel.setBackground(Color.GRAY);
        panel.add(numbersButtons[1]);
        panel.add(numbersButtons[2]);
        panel.add(numbersButtons[3]);
        panel.add(addButton);

        panel.add(numbersButtons[4]);
        panel.add(numbersButtons[5]);
        panel.add(numbersButtons[6]);
        panel.add(subButton);

        panel.add(numbersButtons[7]);
        panel.add(numbersButtons[8]);
        panel.add(numbersButtons[9]);

        panel.add(mulButton);

        panel.add(decButton);
        panel.add(numbersButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        MainClass man = new MainClass();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numbersButtons[i])
                textField.setText(textField.getText().concat(String.valueOf(i)));
        }

        if (e.getSource() == decButton)
            textField.setText(textField.getText().concat("."));
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }

        if (e.getSource() == delButton) {
            String str = textField.getText();
            textField.setText("");

            for (int i = 0; i < str.length() - 1; i++) {
                textField.setText(textField.getText() + str.charAt(i));
            }
        }

        if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            textField.setText(String.valueOf(temp));
        }

    }
}
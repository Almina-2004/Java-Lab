import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    TextField input1, input2;
    Label resultLabel;
    Button addBtn, subBtn, mulBtn, divBtn;

    public SimpleCalculatorAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Input fields
        input1 = new TextField(10);
        input2 = new TextField(10);

        // Buttons
        addBtn = new Button("+");
        subBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");

        // Result label
        resultLabel = new Label("Result will appear here");

        // Add components to frame
        add(new Label("First Number:")); add(input1);
        add(new Label("Second Number:")); add(input2);

        add(addBtn); add(subBtn); add(mulBtn); add(divBtn);
        add(resultLabel);

        // Add action listeners
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setTitle("Simple Calculator");
        setVisible(true);

        // Window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = 0;

            if (e.getSource() == addBtn) {
                result = num1 + num2;
            } else if (e.getSource() == subBtn) {
                result = num1 - num2;
            } else if (e.getSource() == mulBtn) {
                result = num1 * num2;
            } else if (e.getSource() == divBtn) {
                if (num2 == 0) {
                    resultLabel.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
            }

            resultLabel.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}
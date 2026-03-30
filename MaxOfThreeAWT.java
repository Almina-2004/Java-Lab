import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeAWT extends Frame implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button btn;

    public MaxOfThreeAWT() {
        // Set layout
        setLayout(new FlowLayout());

        // Create components
        l1 = new Label("Enter First Number:");
        t1 = new TextField(10);

        l2 = new Label("Enter Second Number:");
        t2 = new TextField(10);

        l3 = new Label("Enter Third Number:");
        t3 = new TextField(10);

        btn = new Button("Find Maximum");

        result = new Label("Result will be shown here");

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(btn);
        add(result);

        // Add action listener
        btn.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setTitle("Maximum of Three Numbers");
        setVisible(true);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Action performed on button click
    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());

            int max = a;

            if (b > max) max = b;
            if (c > max) max = c;

            result.setText("Maximum: " + max);

        } catch (NumberFormatException ex) {
            result.setText("Please enter valid integers");
        }
    }

    public static void main(String[] args) {
        new MaxOfThreeAWT();
    }
}
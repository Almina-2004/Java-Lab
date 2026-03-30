import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Applet class
public class MaxOfThree extends Applet implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button btn;

    public void init() {
        // Create components
        l1 = new Label("Enter Number 1:");
        l2 = new Label("Enter Number 2:");
        l3 = new Label("Enter Number 3:");
        result = new Label("");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        btn = new Button("Find Maximum");

        // Add components to applet
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(btn);
        add(result);

        // Register action
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = n1;

            if (n2 > max)
                max = n2;
            if (n3 > max)
                max = n3;

            result.setText("Maximum: " + max);

        } catch (Exception ex) {
            result.setText("Invalid Input!");
        }
    }
}
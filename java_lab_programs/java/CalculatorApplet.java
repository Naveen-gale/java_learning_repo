import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    TextField first, second, result;
    Button add, subtract, multiply, divide;

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));
        first = new TextField();
        second = new TextField();
        result = new TextField();
        result.setEditable(false);

        add(new Label("First number:"));
        add(first);
        add(new Label("Second number:"));
        add(second);
        add(new Label("Result:"));
        add(result);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");

        add(add);
        add(subtract);
        add(multiply);
        add(divide);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(first.getText());
            double b = Double.parseDouble(second.getText());
            double answer;

            if (e.getSource() == add) answer = a + b;
            else if (e.getSource() == subtract) answer = a - b;
            else if (e.getSource() == multiply) answer = a * b;
            else {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                answer = a / b;
            }

            result.setText(String.valueOf(answer));
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }
}

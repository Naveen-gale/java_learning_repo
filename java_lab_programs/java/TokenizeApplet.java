import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class TokenizeApplet extends Applet implements ActionListener {
    TextField input;
    Button button;
    Label output;

    public void init() {
        setLayout(new FlowLayout());
        input = new TextField(25);
        button = new Button("Tokenize");
        output = new Label("Enter words separated by spaces.");
        add(input);
        add(button);
        add(output);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        StringTokenizer tokenizer = new StringTokenizer(input.getText());
        StringBuilder result = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            result.append(tokenizer.nextToken()).append(" | ");
        }
        output.setText(result.length() == 0 ? "No tokens." : result.toString());
    }
}

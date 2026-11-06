import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingApplet extends Applet implements ActionListener {
    Button button;
    Label label;
    int count = 0;

    public void init() {
        setLayout(new FlowLayout());
        button = new Button("Click Me");
        label = new Label("Button not clicked.");
        add(button);
        add(label);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Button clicked " + count + " times.");
    }
}

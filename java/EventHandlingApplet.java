import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingApplet extends Applet implements ActionListener {
    Button button;
    String message = ""; // Holds the text to display

    public void init() {
        setLayout(new FlowLayout());
        button = new Button("Click Me");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Button clicked!"; // Set the message
        repaint(); // Refresh the applet screen to call paint()
    }

    public void paint(Graphics g) {
        // Draw the message at x=100, y=100 inside the applet
        g.drawString(message, 100, 100);
    }
}

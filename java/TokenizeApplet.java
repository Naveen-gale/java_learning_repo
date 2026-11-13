import java.applet.Applet;
import java.awt.Graphics;

public class TokenizeApplet extends Applet {

    public void paint(Graphics g) {
        String text = "pen, pencil";
        String[] tokens = text.split(",");

        int y = 40;

        for (int i = 0; i < tokens.length; i++) {
            g.drawString(tokens[i], 20, y);
            y += 20;
        }
    }
}



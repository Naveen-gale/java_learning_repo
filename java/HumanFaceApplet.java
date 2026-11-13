import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class HumanFaceApplet extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillOval(80, 40, 180, 200);
        g.setColor(Color.black);
        g.drawOval(80, 40, 180, 200);
        g.fillOval(125, 105, 18, 25);
        g.fillOval(195, 105, 18, 25);
        g.drawArc(125, 145, 90, 55, 190, 160);
        g.drawLine(170, 120, 160, 155);
    }
}

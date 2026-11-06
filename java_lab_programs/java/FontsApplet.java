import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;

public class FontsApplet extends Applet {
    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Serif - Plain", 30, 40);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString("SansSerif - Bold", 30, 80);
        g.setFont(new Font("Monospaced", Font.ITALIC, 20));
        g.drawString("Monospaced - Italic", 30, 120);
        g.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Dialog - Bold Italic", 30, 160);
    }
}

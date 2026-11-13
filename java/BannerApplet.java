import java.applet.Applet;
import java.awt.*;

public class BannerApplet extends Applet implements Runnable {
    int x = 300;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        try {
            while (true) {
                x = (x < -180) ? getWidth() : x - 5;
                repaint();
                Thread.sleep(100);
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("WELCOME TO JAVA APPLET", x, 80);
    }
}

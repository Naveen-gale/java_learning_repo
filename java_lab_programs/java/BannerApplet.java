import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class BannerApplet extends Applet implements Runnable {
    String message = "WELCOME TO JAVA APPLET";
    int x = 300;
    Thread bannerThread;

    public void init() {
        setBackground(Color.white);
        bannerThread = new Thread(this);
        bannerThread.start();
    }

    public void run() {
        while (true) {
            x -= 5;
            if (x < -180) x = getWidth();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString(message, x, 80);
    }
}

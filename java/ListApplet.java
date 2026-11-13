import java.applet.Applet;
import java.awt.List;

public class ListApplet extends Applet {
    List items;

    public void init() {
        items = new List(4, false);
        items.add("Java");
        items.add("Python");
        items.add("C");
        items.add("C++");

        add(items);
    }
}

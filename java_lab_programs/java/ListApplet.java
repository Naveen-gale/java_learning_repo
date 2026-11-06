import java.applet.Applet;
import java.awt.List;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListApplet extends Applet implements ActionListener {
    List items;
    Button showButton;
    Label result;

    public void init() {
        setLayout(new FlowLayout());
        items = new List(4, false);
        items.add("Java");
        items.add("Python");
        items.add("C");
        items.add("C++");
        showButton = new Button("Show selected item");
        result = new Label("Select an item.");
        add(items);
        add(showButton);
        add(result);
        showButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String selected = items.getSelectedItem();
        result.setText(selected == null ? "No item selected." : "Selected: " + selected);
    }
}

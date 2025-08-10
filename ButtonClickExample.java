import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample extends Frame implements ActionListener {

    Button b;

    ButtonClickExample() {
        // Create Button
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 50);

        // Register listener (this object handles the click)
        b.addActionListener(this);

        // Add button to frame
        add(b);

        // Frame settings
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // Close window on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // This method is called when button is clicked
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}

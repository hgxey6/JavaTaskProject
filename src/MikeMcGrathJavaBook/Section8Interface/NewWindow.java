package MikeMcGrathJavaBook.Section8Interface;

import javax.swing.*;

public class NewWindow extends JFrame {
    JPanel panel = new JPanel();

    public static void main(String[] args) {
        NewWindow gui = new NewWindow();
    }

    public NewWindow() {
        super("Окно");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}

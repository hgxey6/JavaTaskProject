package MikeMcGrathJavaBook.Section8Interface;

import javax.swing.*;

public class Window extends JFrame {
    JPanel panel = new JPanel();

    public static void main(String[] args) {
        Window gui = new Window();
    }

    public Window() {
        super("Окно");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

    }
}

package MikeMcGrathJavaBook.Section8Interface;

import javax.swing.*;

public class Buttons extends JFrame {
    JPanel panel = new JPanel();

    public static void main(String[] args) {
        Window gui = new Window();
    }

    ImageIcon tick = new ImageIcon("tick.png");
    ImageIcon cross = new ImageIcon("cross.png");

    JButton btn = new JButton("Нажми меня");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("СТОП", cross);

    public Buttons() {
        super("Окно");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);

        panel.add(btn);
        panel.add(tickBtn);
        panel.add(crossBtn);
        setVisible(true);
    }
}

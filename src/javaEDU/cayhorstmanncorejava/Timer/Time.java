package javaEDU.cayhorstmanncorejava.Timer;

import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.*;

public class Time {
    public static void main(String[] args) {
        TimePrinter time = new TimePrinter();
        Timer t = new Timer(1000, time);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date(); // Текущее время
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

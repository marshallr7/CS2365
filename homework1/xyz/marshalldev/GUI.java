package xyz.marshalldev;

import javax.swing.*;

public class GUI {
    public static String dialogTemplate(String message, String title) {
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}

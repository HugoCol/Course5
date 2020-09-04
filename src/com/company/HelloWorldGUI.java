package com.company;
// Hugo Colenbrander 2/9/2020
// Hello World as a GUI pop-up
import javax.swing.*;

public class HelloWorldGUI {

    public static void main(String args[]) {
        JFrame frame = new JFrame("My First GUI");
        JOptionPane.showMessageDialog(frame,
                "Hello World!");
    }
}

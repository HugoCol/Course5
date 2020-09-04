package com.company;
import javax.swing.*;
// This is program accepts a name as user input and creates a pop-up with a greeting
public class HelloInputGUI {

    public static void main(String args[]) {
    JFrame frame = new JFrame("My First GUI");
        JOptionPane.showMessageDialog(frame,
                "Hello " + args[0]);


}
}

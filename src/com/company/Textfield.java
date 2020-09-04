package com.company;
import javax.swing.*;
import java.awt.*;


public class Textfield {
    public static void main(String args[]) {


        JFrame frame = new JFrame("TextFieldGUI");
        frame.setSize(500,300);

        JLabel INPUT1 = new JLabel("Text invoer");

        JTextField editTextArea = new JTextField("Type Here!");
        frame.getContentPane().add(INPUT1);
        frame.getContentPane().add(editTextArea);
        frame.setVisible(true);


    }


}


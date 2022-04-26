package com.pratice;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);

    private JPanel mainPanel;
    private JLabel nameLabel, passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1, button2;
    //constructor
    public MyWindow()
    {
        super.setTitle("My First Form");

        // set size of the Window Frame
        super.setSize(600,600);

        //Set Location of the Window on the Scree
        super.setLocation(400, 100);
        //visible we used to show window on the screen
        super.setVisible(true);
//        System.out.print("testing");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
    }
    public void createGUI()
    {
        //this method create our gui
        //set our layout
        this.setLayout(new BorderLayout());
        //Creating our label
        heading = new JLabel("My Second Java Project");
        //set our font size on the heading
        heading.setFont(font);

        heading.setHorizontalAlignment(JLabel.CENTER);
        //Make heading will show on the North side of the window screen
        this.add(heading,BorderLayout.NORTH);

        //............... Working with Jpanel ...............

        mainPanel = new JPanel();

        // setting layout of main panel
        mainPanel.setLayout(new GridLayout(3,2));


        nameLabel = new JLabel("Enter name :");
        nameLabel.setFont(font);

        passwordLabel = new JLabel("Enter Password :");
        passwordLabel.setFont(font);

        nameTextField = new JTextField();
        nameTextField.setFont(font);

        passwordField = new JPasswordField();
        passwordField.setFont(font);

        button1 = new JButton("Submit");
        button1.setFont(font);

        button2 = new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLabel);

        mainPanel.add(nameTextField);

        mainPanel.add(passwordLabel);

        mainPanel.add(passwordField);

        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel, BorderLayout.CENTER);

    }
}

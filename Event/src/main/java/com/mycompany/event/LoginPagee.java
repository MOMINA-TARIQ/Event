/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;


import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Momina
 */
public class LoginPagee implements ActionListener {

    /**
     *
     * @author Momina
     */
    JFrame f;                                                               //reference variables
    JPanel p;
    JLabel l, l1, l2, l3, l4;
    JTextField t, t1;
    JButton b, b1;

    LoginPagee() {                                                          //No Argument Constructor       
        try {                                                               //Exception Handling with try-catch clause
            f = new JFrame();                                               // JFrame Object
            f.setVisible(true);                                             // Display JFrame window                        
            f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      // Close JFrame window
            f.setBounds(270, 250, 525, 380);                                // Size Of JFrame
            f.setTitle("LOGIN");                                            // JFrame Title

            Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");
            f.setIconImage(i);

            p = new JPanel();                                                //Panel Object
            f.add(p);                                                        // Add Panel to Frame
            p.setBackground(Color.blue);                                       // Blue Background of Panel
            p.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 10));       // Panel Layout

            l = new JLabel("Login");                                         //Label Object
            p.add(l);                                                        //Label add to Panel
            l.setForeground(Color.white);                                     // White Foreground of Label
            l.setFont(new Font("Calibri", Font.CENTER_BASELINE, 27));        //Label font properties 

            l1 = new JLabel("Let's get started");                              //Label Object
            p.add(l1);                                                       //Label add to Panel
            l1.setForeground(Color.white);                                  // White Foreground of Label

            l2 = new JLabel("User Name:");                                   //Label Object
            p.add(l2);                                                      //Label add to Panel
            l2.setForeground(Color.white);                                 // White Foreground of Label

            t = new JTextField();
            p.add(t);
            t.setBounds(100, 100, 300, 20);

            l3 = new JLabel("Password:");                                    //Label Object
            p.add(l3);                                                     //Label add to Panel
            l3.setForeground(Color.white);                                   // White Foreground of Label
            l3.setBounds(227, 140, 300, 20);                                //Size of Label

            t1 = new JPasswordField();
            p.add(t1);
            t1.setBounds(100, 160, 300, 20);

            b = new JButton("LOGIN");
            p.add(b);
            b.setBounds(80, 220, 340, 30);
            b.setForeground(Color.blue);
            b.setBackground(Color.white);
            b.addActionListener((ActionListener) this);

            l4 = new JLabel("Don't you have account?");                       //Label Object
            p.add(l4);                                                        //Label add to Panel
            l4.setForeground(Color.white);                                  // White Foreground of Label
            l4.setBounds(190, 260, 300, 20);                                //Size of Label

            b1 = new JButton("Sign up");                                      //Button Object
            p.add(b1);
            b1.setBounds(220, 280, 90, 20);
            b1.setForeground(Color.white);
            b1.setBackground(Color.blue);
            b1.addActionListener((ActionListener) this);

            l4 = new JLabel("");                                             //Label Object
            p.add(l4);                                                     //Label add to Panel
            l4.setForeground(Color.white);                                 // White Foreground of Label
            l4.setBounds(227, 300, 300, 20);                               //Size of Label
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Error:"
                    + " You must enter an integer");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(f, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(f, """
                                             Something went wrong! 
                                             Exception occurs """);

        }

    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            boolean matched = false;
            try {
                FileReader r = new FileReader("C:\\Users\\Momina\\Desktop\\Passwords");
                BufferedReader b = new BufferedReader(r);
                String a = t.getText();
                String bb = t1.getText();
                String line;
                while ((line = b.readLine()) != null) {

                    if (line.equals(a + "\t" + bb)) {

                        matched = true;
                        break;
                    }
                }
                b.close();
                r.close();

                FileWriter w = new FileWriter("C:\\Users\\Momina\\Desktop\\Wedding Details", true);
                w.write("\nClient Name:\t" + a + "\n\n");
                w.close();
              
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {
                Logger.getLogger(Event.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (matched == true) {
                f.dispose();
                new EventManagement();
            } else {
                l1.setText("Invalid Username or Password !");
                l1.setForeground(Color.red);
            }

        }

        if (e.getSource() == b1) {
            new SignUpPage();
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new LoginPagee();
    }
}

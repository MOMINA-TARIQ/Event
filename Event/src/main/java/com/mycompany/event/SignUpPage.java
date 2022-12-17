/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author Momina
 */
public class SignUpPage implements ActionListener {

    //reference variables
    JFrame fr;
    JPanel pn;
    JLabel la, l1a, l2a, l3a, l4a, l5a;
    JTextField ta, t1b, t2b, t3b, t4b;
    JButton bu, ba;

    SignUpPage() {                                                          //No Argument Constructor                           
        try {                                                               //Exception Handling with try-catch clause
            fr = new JFrame();                                              // JFrame Object
            fr.setVisible(true);                                            // Display JFrame window
            fr.setDefaultCloseOperation(EXIT_ON_CLOSE);                     // Close JFrame window
            fr.setBounds(270, 250, 525, 450);                               // Size Of JFrame
            fr.setTitle("Sgin Up");                                         // JFrame Title

            Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");
            fr.setIconImage(i);

            pn = new JPanel();                                              //Panel Object
            fr.add(pn);                                                     // Add Panel to Frame
            pn.setBackground(Color.blue);                                   // Blue Background of Panel
            pn.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 10));       // Panel Layout

            la = new JLabel("Sign Up");                                     //First Label Object
            pn.add(la);                                                     //Label add to Panel
            la.setForeground(Color.white);                                  // White Foreground of Label
            la.setFont(new Font("Calibri", Font.CENTER_BASELINE, 27));      //Label font properties 

            l1a = new JLabel("First Name : ");                              //Second Label Object
            pn.add(l1a);                                                    //Label add to Panel
            l1a.setForeground(Color.white);                                 // White Foreground of Label

            ta = new JTextField();                                          //First TextArea Object
            pn.add(ta);                                                     //TextArea add to Panel
            ta.setBounds(100, 75, 300, 20);                                 // Size Of TextArea

            l2a = new JLabel("Last Name : ");                               //Third Label Object
            pn.add(l2a);                                                    //Label add to Panel
            l2a.setForeground(Color.white);                                 // White Foreground of Label
            l2a.setBounds(222, 100, 300, 20);                               //Size of Label

            t1b = new JTextField();                                         //Second TextArea Object
            pn.add(t1b);                                                    //TextArea add to Panel
            t1b.setBounds(100, 125, 300, 20);                               //Size Of TextArea

            l5a = new JLabel("Email : ");                                   //Fourth Label Object
            pn.add(l5a);                                                    //Label add to Panel             
            l5a.setForeground(Color.white);                                 // White Foreground of Label
            l5a.setBounds(222, 150, 300, 20);                               //Size of Label

            t4b = new JTextField();                                         //Third TextArea Object
            pn.add(t4b);                                                    //TextArea add to Panel
            t4b.setBounds(100, 175, 300, 20);                               // Size Of TextArea

            l3a = new JLabel("Enter Password : ");                          //Fifth Label Object
            pn.add(l3a);                                                    //Label add to Panel      
            l3a.setForeground(Color.white);                                 // White Foreground of Label
            l3a.setBounds(220, 200, 300, 20);                               //Size of Label

            t2b = new JPasswordField();                                     //PasswordField Object
            pn.add(t2b);                                                    //PasswordField add to Panel
            t2b.setBounds(100, 225, 300, 20);                               // Size Of PasswordField

            l4a = new JLabel("Re-Type Password : ");                        //Sixth Label Object
            pn.add(l4a);                                                    //Label add to Panel 
            l4a.setForeground(Color.white);                                 // White Foreground of Label
            l4a.setBounds(220, 255, 300, 20);                               //Size of Label

            t3b = new JPasswordField();                                     //PasswordField Object
            pn.add(t3b);                                                    //PasswordField add to Panel
            t3b.setBounds(100, 275, 300, 20);                               // Size Of PasswordField

            bu = new JButton("Submit");                                     //Button Object
            pn.add(bu);                                                     //Button add to Panel 
            bu.setBounds(205, 300, 100, 20);                                //Size of Button
            bu.setBackground(Color.blue);                                   // Blue Background of Button
            bu.setForeground(Color.white);                                  // White Foreground of Button
            bu.addActionListener((ActionListener) this);                    //Button add to ActionListener Class

            l5a = new JLabel("Do you want to Log-in again? ");              //Seventh Label Object
            pn.add(l5a);                                                    //Label add to Panel 
            l5a.setForeground(Color.white);                                 // White Foreground of Label
            l5a.setBounds(160, 325, 300, 20);                               //Size of Label

            ba = new JButton("Login");                                      //Button Object
            pn.add(ba);                                                     //Button add to Panel 
            ba.setBounds(205, 350, 100, 20);                                //Size of Button
            ba.setBackground(Color.blue);                                   // Blue Background of Button
            ba.setForeground(Color.white);                                  //Button add to ActionListener Class
            ba.addActionListener((ActionListener) this);
        } catch (NumberFormatException e) {                                 //Exception Handling through catch clause
            JOptionPane.showMessageDialog(fr, "Error: You must "
                    + "enter an integer");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(fr, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(fr, """
                                          Something went wrong! 
                                          Exception occurs """);

        }

    }

    @Override                                                               //Polymorphism
    public void actionPerformed(ActionEvent e) {                            //abstract method
        if (e.getSource() == bu) {
            if (ta.getText().isBlank() && t1b.getText().isBlank() //throw Exception
                    && t2b.getText().isBlank()) {
                throw new HeadlessException("Please fill"
                        + " all text area");
            } 
            else {
                try {
                    FileWriter w = new FileWriter("C:\\Users\\" //File Handling Through File Write Class
                            + "Momina\\Desktop\\Passwords", true);

                    w.write(ta.getText() + "\t" + t2b.getText() + "\n");
                    w.close();
                    JOptionPane.showMessageDialog(fr, "Registration"
                            + " completed");

                    FileWriter ww = new FileWriter("C:\\Users\\" //File Handling Through File Write Class
                            + "Momina\\Desktop\\Client Details", true);
                    ww.write("First Name:  " + ta.getText() + "\nLast Name:  " + t1b.getText()
                            + "\nEmail: " + t2b.getText()
                            + "\nPassword: " + t3b.getText() + "\n");
                    ww.write("_______________________________________\n");
                    ww.close();

                } catch (IOException ex) {                                  //Exception Handling through catch clause
                    JOptionPane.showMessageDialog(fr, ex);
                } catch (HeadlessException ex) {                            //Exception Handling through catch clause
                    JOptionPane.showMessageDialog(fr, ex);
                }
            }
        }
        if (e.getSource() == ba) {
            LoginPagee loginPagee = new LoginPagee();                       //LoginPagee Object  
            fr.dispose();                                                   //Close the Frame window
        }
    }

    public static void main(String[] args) {                                //main method
        SignUpPage signUpPage = new SignUpPage();                           //SignUpPage Object
    }
}

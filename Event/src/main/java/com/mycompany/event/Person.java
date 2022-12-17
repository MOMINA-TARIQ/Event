/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Momina
 */
public class Person implements ActionListener {

    JFrame frame;
    JPanel p, p1;
    JLabel l, l1, l2, l3, l4, l5;
    JTextField t, t1, t2, t3, t4, t5;
    JButton b;

    Person() {
        try {
            frame = new JFrame();
            frame.setBounds(70, 200, 550, 480);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(new BorderLayout(8, 8));
            frame.setTitle("Client Details");

            Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");
            frame.setIconImage(i);

            p1 = new JPanel();
            p1.setPreferredSize(new Dimension(140, 60));
            frame.add(p1, BorderLayout.WEST);
            p1.setBackground(Color.blue);

            p = new JPanel();
            frame.add(p, BorderLayout.EAST);
            p.setPreferredSize(new Dimension(400, 100));
            p.setBackground(Color.white);
            p.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 30));

            l5 = new JLabel("Register Yourself Now!");
            p.add(l5);
            l5.setFont(new Font("Calibri", Font.BOLD, 20));
            l5.setForeground(Color.blue);

            l = new JLabel("Enter your name : ");
            p.add(l);
            l.setForeground(Color.blue);
            l.setBounds(130, 30, 250, 16);

            t = new JTextField();
            p.add(t);
            t.setBounds(80, 110, 250, 25);

            l1 = new JLabel("Enter you Father name : ");
            p.add(l1);
            l1.setForeground(Color.blue);
            l1.setBounds(130, 135, 250, 25);

            t1 = new JTextField();
            p.add(t1);
            t1.setBounds(80, 158, 250, 25);

            l2 = new JLabel("Enter your Email Adress : ");
            p.add(l2);
            l2.setForeground(Color.blue);
            l2.setBounds(128, 185, 250, 25);

            t2 = new JTextField();
            p.add(t2);
            t2.setBounds(80, 208, 250, 25);

            l3 = new JLabel("Enter your Date of Birth : ");
            p.add(l3);
            l3.setForeground(Color.blue);
            l3.setBounds(128, 236, 250, 25);

            t3 = new JTextField();
            p.add(t3);
            t3.setBounds(80, 258, 250, 25);

            l4 = new JLabel("Enter your Contact Number : ");
            p.add(l4);
            l4.setForeground(Color.blue);
            l4.setBounds(120, 283, 250, 25);

            t4 = new JTextField();
            p.add(t4);
            t4.setBounds(80, 305, 250, 25);

            l5 = new JLabel("Enter your CNIC Number : ");
            p.add(l5);
            l5.setForeground(Color.blue);
            l5.setBounds(120, 335, 250, 25);

            t5 = new JTextField();
            p.add(t5);
            t5.setBounds(80, 357, 250, 25);

            b = new JButton("Submit");
            p.add(b);
            b.setBounds(160, 400, 90, 25);
            b.setBackground(Color.white);
            b.setForeground(Color.blue);
            b.addActionListener(this);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Error: You must enter an integer");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(frame, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Something went wrong! \nException occurs ");

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                FileWriter w = new FileWriter("C:\\Users\\Momina\\Desktop\\Client Detials", true);
                w.write("Name: " + t.getText() + "\nFather Name: " + t1.getText() + "\nEmail: " + t2.getText() 
                        + "\nDate-of-Birth: " + t3.getText()
                        + "\nContact: " + t4.getText() + "\nCNIC: " + t5.getText() + "\n");

                w.close();

                JOptionPane.showMessageDialog(frame, "Registration completed");

            } catch (IOException ex) {
                System.out.println(ex);
            }
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new Person();
    }

}

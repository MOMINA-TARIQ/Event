/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author binary computers
 */

public class Business_Events extends JFrame implements ActionListener {

    JFrame f;
    JButton b2, b3, b4;
    JLabel l, l1, l2, l3, l4, l5, l6, l7, l8;

    Business_Events() {

        f = new JFrame();
        f.setBackground(Color.WHITE);
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 6000, 20));
        p.setBackground(Color.WHITE);

        f.add(p);
        f.setBounds(300, 300, 700, 600);
        f.setVisible(true);
        f.setTitle("Business_Events");

        ////////////////////////////////////////////////////////////////////
        l = new JLabel("Business Event Planner");
        Font fn = new Font("bold", Font.HANGING_BASELINE, 40);
        l.setFont(fn);                                                       //FIRST LABEL
        l.setForeground(Color.BLACK);
        p.add(l);
        ////////////////////////////////////////////////////////////////////      

        b2 = new JButton("SELECT YOUR VENUE");
        p.add(b2);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);///////////////////////////////  VENUE

        Font tn = new Font("bold", Font.BOLD, 25);
        b2.setFont(tn);
        b2.addActionListener((ActionListener) this);

        b3 = new JButton("SELECT YOUR THEME");
        p.add(b3);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);///////////////////////////////  THEME

        Font JH = new Font("bold", Font.BOLD, 26);
        b3.setFont(JH);
        b3.addActionListener((ActionListener) this);

        b4 = new JButton("FOOD VARIETY");
        p.add(b4);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);///////////////////////////////  FOOD_VARIETY

        Font XY = new Font("bold", Font.BOLD, 25);
        b4.setFont(XY);
        b4.addActionListener((ActionListener) this);

    }

    String string;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b2) {
            string = "Venue:";
            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(string + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            new Venue();
        }

        if (e.getSource() == b3) {
            string = "Theme:";
            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(string + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            new Theme();
        }

        if (e.getSource() == b4) {
            string = ("Food Items:"+"\n");

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(string + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            new FoodItems();
        }
 
    }

    /*
    
Receipt:

-----------------------Date:12-Dec-2022

Description:
________________________________________________

ITEMS:-----------------------------AMOUNT

------------------------------------------



     */
  
    public static void main(String[] args) {
            System.out.print("Kindly go check it out the txt file named SAADIA "+
                    "\n"+"for further details and total expense");
        new Business_Events();
    }

}

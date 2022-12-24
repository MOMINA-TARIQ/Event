/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author binary computers
 */
public class Venue implements ActionListener {

    JFrame f;
    JLabel la, label_venue;
    JButton b;
    JRadioButton Vr, Vr1, Vr2;
    public double cost = 50000; // For Booking
    String str_venue;
    String str_venuee = "          ";

    Venue() {
        f = new JFrame();
        f.setVisible(true);
        f.setBounds(200, 250, 450, 350);

        f.setBackground(Color.white);

        f.setVisible(true);
        f.setTitle("Venue");

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 6000, 6));
        p.setBackground(Color.white);
        f.add(p);

        ////////////////////////////////////////////////////////////////////////////////////
        la = new JLabel("Select which VENUE you want");
        Font fn1 = new Font("roman", Font.CENTER_BASELINE, 25);
        la.setFont(fn1);
        la.setForeground(Color.black);

        la.setVisible(true);
        p.add(la);

        Vr = new JRadioButton("PC Hotel     ");
        Font ca = new Font("roman", Font.CENTER_BASELINE, 20);
        Vr.setFont(ca);                                                // PC HOTEL
        Vr.setForeground(Color.blue);
        Vr.setBounds(100, 20, 40, 110);
        p.add(Vr);

        Vr1 = new JRadioButton("The Excellence ");
        Font cb = new Font("roman", Font.CENTER_BASELINE, 20);
        Vr1.setFont(cb);                                                // EXCELLENCE
        Vr1.setForeground(Color.blue);
        Vr1.setBounds(100, 20, 40, 110);
        p.add(Vr1);

        Vr2 = new JRadioButton("City Hotel     ");
        Font cc = new Font("roman", Font.CENTER_BASELINE, 20);
        Vr2.setFont(cc);                                                // PC HOTEL
        Vr2.setForeground(Color.blue);
        Vr2.setBounds(100, 20, 40, 110);
        p.add(Vr2);

        ButtonGroup bg = new ButtonGroup();

        bg.add(Vr);
        bg.add(Vr1);
        bg.add(Vr2);

        Vr.addActionListener((ActionListener) this);
        Vr1.addActionListener((ActionListener) this);
        Vr2.addActionListener((ActionListener) this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Override Method

        // If condition to check if r1 is selected.
        if (Vr.isSelected()) {

            try {

                str_venue = (str_venuee + "The PC Hotel is selected  ----------   " + cost + " Rs  Only");

                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_venue + "\n" + "");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        if (Vr1.isSelected()) {

            try {

                str_venue = (str_venuee + "The Excellence is selected  ---------  " + cost + " Rs  Only");

                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_venue + "\n" + "");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (Vr2.isSelected()) {

            try {

                str_venue = (str_venuee + "City Hotel is selected  ----------       " + cost + " Rs  Only");

                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_venue + "\n" + "");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
        /*
                        else {

                        str_venue=("None of the Venue is selected");

                            try {
                                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                                ww.write(str_venue);
                                ww.close();

                    } 
                        catch(UnsupportedOperationException ex){
                           System.out.println(ex);

                       }    catch (IOException ex) {
                                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
         */
    }

    public static void main(String[] args) {
        new Venue();
    }
}

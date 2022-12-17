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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Theme implements ActionListener {

    JFrame f;
    JLabel la;
    JRadioButton rt, r1t, r2t;
    double cost_theme = 8500;
    String str_theme;
    String str_themee = "          ";

    Theme() {
        f = new JFrame();
        f.setVisible(true);
        f.setBounds(200, 250, 450, 350);

        f.setBackground(Color.white);

        f.setVisible(true);
        f.setTitle("Theme");

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 6000, 6));
        p.setBackground(Color.white);
        f.add(p);

        ////////////////////////////////////////////////////////////////////////////////////
        la = new JLabel("Select which THEME you want");
        Font fn1 = new Font("roman", Font.CENTER_BASELINE, 25);
        la.setFont(fn1);
        la.setForeground(Color.black);

        la.setVisible(true);
        p.add(la);

        rt = new JRadioButton("     Royal Blue  ");
        Font ca = new Font("roman", Font.CENTER_BASELINE, 20);
        rt.setFont(ca);                                                // classic
        rt.setForeground(Color.blue);
        rt.setBounds(100, 20, 40, 110);
        p.add(rt);

        r1t = new JRadioButton("Peace & White ");
        Font cb = new Font("roman", Font.CENTER_BASELINE, 20);
        r1t.setFont(cb);                                                // peace and white
        r1t.setForeground(Color.blue);
        r1t.setBounds(100, 20, 40, 110);
        p.add(r1t);

        r2t = new JRadioButton("Coral  ");
        Font cc = new Font("roman", Font.CENTER_BASELINE, 20);
        r2t.setFont(cc);                                                // premium
        r2t.setForeground(Color.blue);
        r2t.setBounds(100, 20, 40, 110);
        p.add(r2t);

        ButtonGroup bg = new ButtonGroup();

        bg.add(rt);
        bg.add(r1t);
        bg.add(r2t);

        rt.addActionListener((ActionListener) this);
        r1t.addActionListener((ActionListener) this);
        r2t.addActionListener((ActionListener) this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Override Method

        // If condition to check if r1 is selected.
        if (rt.isSelected()) {

            str_theme = (str_themee + "Royal Blue is selected ----------         " + cost_theme + "  Rs");

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_theme + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (r1t.isSelected()) {

            str_theme = (str_themee + "Peace & White is selected ----------   " + cost_theme + "  Rs");
  
            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_theme + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (r2t.isSelected()) {

            str_theme = (str_themee + "Coral Theme is selected ----------     " + cost_theme + "  Rs");

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_theme + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
        
        
     /*   else {

            str_theme = ("None of the Theme is selected ");

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_theme + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        */

    }

    public static void main(String[] args) {
        new Theme();

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Momina
 */
public class Weddings implements ActionListener {

    JFrame f;
    JPanel p, p1;
    JButton b1, b2, b3;
    JLabel l, l1;

    Weddings() {

        try {
            f = new JFrame();
            f.setVisible(true);
            f.setDefaultCloseOperation(EXIT_ON_CLOSE);
            f.setBounds(720, 250, 500, 270);
            f.setTitle("Wedding");
            f.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

            Image i6 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");
            f.setIconImage(i6);

            p1 = new JPanel();
            f.add(p1);
            p1.setPreferredSize(new Dimension(170, 400));
            p1.setBackground(Color.white);

            p = new JPanel();
            f.add(p);
            p.setPreferredSize(new Dimension(310, 400));
            p.setBackground(Color.white);
            p.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 10));

            ImageIcon m = new ImageIcon("C:\\Users\\Momina\\Downloads\\mmm.jpg");
            l1 = new JLabel();
            l1.setIcon(m);
            p1.add(l1);
            l1.setPreferredSize(new Dimension(200, 230));

            l = new JLabel("PICK YOUR OCCASION !");
            p.add(l);
            l.setForeground(Color.blue);
            l.setFont(new Font("Calibri", Font.BOLD, 22));

            b1 = new JButton("Mehndi");
            p.add(b1);
            b1.setPreferredSize(new Dimension(270, 50));
            b1.setBackground(Color.BLUE);  //new Color(255,243,109)
            b1.setForeground(Color.white);
            b1.setFont(new Font("Calibri", Font.BOLD, 30));
            b1.addActionListener(this);

            b2 = new JButton("Barat");
            b2.setPreferredSize(new Dimension(270, 50));
            p.add(b2);
            b2.setBackground(Color.BLUE);  //new Color(252 , 127 , 156)
            b2.setForeground(Color.white);  //new Color(177,254,244)
            b2.setFont(new Font("Calibri", Font.BOLD, 30));
            b2.addActionListener(this);

            b3 = new JButton("Valima");
            p.add(b3);
            b3.setPreferredSize(new Dimension(270, 50));
            b3.setBackground(Color.BLUE);  //new Color(177,254,244)
            b3.setForeground(Color.white);
            b3.setFont(new Font("Calibri", Font.BOLD, 30));
            b3.addActionListener(this);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Error: You must enter an integer");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(f, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(f, "Something went wrong! \nException occurs ");

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            new Mehndi();
            f.dispose();
        }
        if (e.getSource() == b2) {
            new Barat();
            f.dispose();
        }

        if (e.getSource() == b3) {
            new Walima();
            f.dispose();
        }

    }

    public static void main(String[] args) {

        Weddings weddings = new Weddings();

    }
}

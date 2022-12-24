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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodItems implements ActionListener {

    JLabel l2, l3, l4, l5, l6, label_food;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    JButton b1;
    JFrame f;
    String str_foodd = "";
    double  tot_food,
            Fried_Rice = 800,
            Chow_Mein = 750,
            Pasta = 700,
            Pizza = 750,
            Biryani = 700,
            Seekh_Kabab = 700,
            Choco_Lava_Cake = 650,
            Red_Velvet_Cake = 500,
            //////////// quantity 20 each item means 20*8 = 160 plate
            noOfPlate = 20,
            ThemeEXP = 8500,
            VenueEXP = 50000,
            FoodEXP,
            EXPENSE;

    String str_food;

    public FoodItems() {
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

        l2 = new JLabel("\n" + "Food Variety:                                                                                      ");
        Font ob = new Font("roman", Font.CENTER_BASELINE, 25);
        l2.setFont(ob);
        l2.setForeground(Color.BLACK);
        l2.setBounds(100, 20, 40, 110);
        p.add(l2);

        l3 = new JLabel("\n" + "Chinese:                                                                        ");
        Font ob1 = new Font("roman", Font.CENTER_BASELINE, 20);
        l3.setFont(ob1);
        l3.setForeground(Color.BLACK);
        l3.setBounds(100, 20, 40, 110);
        p.add(l3);

        c1 = new JCheckBox("Fried Rice ");
        Font y = new Font("roman", Font.CENTER_BASELINE, 15);
        c1.setFont(y);                                                   // checkbox                                                   
        c1.setForeground(Color.BLUE);
        c1.setBounds(100, 20, 40, 110);
        p.add(c1);

        c2 = new JCheckBox("Chow Mein ");
        Font h = new Font("roman", Font.CENTER_BASELINE, 15);
        c2.setFont(h);                                                   // checkbox                                                  
        c2.setForeground(Color.BLUE);
        c2.setBounds(100, 20, 40, 110);
        p.add(c2);

        l4 = new JLabel("\n" + "Italian:                                                                        ");
        Font i = new Font("roman", Font.CENTER_BASELINE, 20);
        l4.setFont(i);
        l4.setForeground(Color.BLACK);
        l4.setBounds(100, 20, 40, 110);
        p.add(l4);

        c3 = new JCheckBox("Pasta ");
        Font x = new Font("roman", Font.CENTER_BASELINE, 15);
        c3.setFont(x);                                                  // checkbox                                            
        c3.setForeground(Color.BLUE);
        c3.setBounds(100, 20, 40, 110);
        p.add(c3);

        c4 = new JCheckBox("Pizza ");
        Font j = new Font("roman", Font.CENTER_BASELINE, 15);
        c4.setFont(j);                                                  // checkbox                                                       
        c4.setForeground(Color.BLUE);
        c4.setBounds(100, 20, 40, 110);
        p.add(c4);

        l5 = new JLabel("\n" + "Desi:                                                                        ");
        Font k = new Font("roman", Font.CENTER_BASELINE, 20);
        l5.setFont(k);
        l5.setForeground(Color.BLACK);
        l5.setBounds(100, 20, 40, 110);
        p.add(l5);

        c5 = new JCheckBox("Biryani ");
        Font z = new Font("roman", Font.CENTER_BASELINE, 15);
        c5.setFont(z);                                                    // checkbox                                                 
        c5.setForeground(Color.BLUE);
        c5.setBounds(100, 20, 40, 110);
        p.add(c5);

        c6 = new JCheckBox("Seekh Kabab ");
        Font n = new Font("roman", Font.CENTER_BASELINE, 15);
        c6.setFont(n);                                                    // checkbox                                                
        c6.setForeground(Color.BLUE);
        c6.setBounds(100, 20, 40, 110);
        p.add(c6);

        l6 = new JLabel("\n" + "Desert:                                                                        ");
        Font mn = new Font("roman", Font.CENTER_BASELINE, 20);
        l6.setFont(mn);
        l6.setForeground(Color.BLACK);
        l6.setBounds(100, 20, 40, 110);
        p.add(l6);

        c7 = new JCheckBox("Choco Lava Cake");
        Font y1 = new Font("roman", Font.CENTER_BASELINE, 15);
        c7.setFont(y1);                                                    // checkbox                                                     
        c7.setForeground(Color.BLUE);
        c7.setBounds(100, 20, 40, 110);
        p.add(c7);

        c8 = new JCheckBox("Red Velvet Cake ");
        Font z1 = new Font("roman", Font.CENTER_BASELINE, 15);
        c8.setFont(z1);                                                  // checkbox                                                     
        c8.setForeground(Color.BLUE);
        c8.setBounds(100, 20, 40, 110);
        p.add(c8);

        b1 = new JButton("DONE");
        p.add(b1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);

        Font FNT = new Font("bold", Font.BOLD, 12);
        b1.setFont(FNT);
        b1.addActionListener((ActionListener) this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Override Method

        //Chinese    
        if (c1.isSelected()) {
            str_foodd = "Chinese-----";

            str_food = str_foodd + "Fried Rice                  --------   " + Fried_Rice + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Fried_Rice;

        }

        if (c2.isSelected()) {
            str_foodd = "Chinese-----";

            str_food = str_foodd + "Chow Mein                --------   " + Chow_Mein + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Chow_Mein;

        }

        //Italian                  
        if (c3.isSelected()) {
            str_foodd = "Italian------ ";

            str_food = str_foodd + "Pasta                         -------    " + Pasta + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Pasta;

        }

        if (c4.isSelected()) {
            str_foodd = "Italian------ ";

            str_food = str_foodd + "Pizza                         -------    " + Pizza + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Pizza;

        }

        //Desi                  
        if (c5.isSelected()) {
            str_foodd = "Desi ------- ";

            str_food = str_foodd + "Biryani                      -------    " + Biryani + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Biryani;

        }

        if (c6.isSelected()) {
            str_foodd = "Desi ------- ";

            str_food = str_foodd + "Seekh Kabab	        -------    " + Seekh_Kabab + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Seekh_Kabab;

        }

        //Desert                   
        if (c7.isSelected()) {
            str_foodd = "Desert ------";

            str_food = str_foodd + "Choco Lava Cake      -------     " + Choco_Lava_Cake + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Choco_Lava_Cake;

        }

        if (c8.isSelected()) {
            str_foodd = "Desert ------";

            str_food = str_foodd + "Red Velvet Cake       -------     " + Red_Velvet_Cake + "  Rs";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

            tot_food += Red_Velvet_Cake;

        }

        if (e.getSource() == b1) {
            FoodEXP = tot_food * noOfPlate;
            EXPENSE = (FoodEXP +ThemeEXP+VenueEXP);

           
    
            // EXPENSE = (FoodEXP+ThemeEXP+VenueEXP);
            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write("\n" + "______________________________________________________"+"\n"+
                        "Your Total Amount is :  -----------------   " + EXPENSE);
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            str_food = "None of the Food is selected";

            try {
                FileWriter ww = new FileWriter("C:\\Users\\binary computers\\Desktop\\SAADIA.txt", true);
                ww.write(str_food + "\n");
                ww.close();

            } catch (UnsupportedOperationException ex) {
                System.out.println(ex);

            } catch (IOException ex) {
                Logger.getLogger(Theme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {
        new FoodItems();

    }

}

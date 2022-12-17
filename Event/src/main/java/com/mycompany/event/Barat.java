/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;


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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Momina
 */
public class Barat extends Wedding implements ActionListener{
    
    
    double popcorn = 2500;
    float Biryani = 4000;
    float FriedChicken = 6000;
    float Tacos = 2300;
    float Spaghetti = 2200;
    float Fajitas = 2300;
    double total;
    double discount;
   
    
    
     JFrame f;
     JPanel p , p1 , p2 , p3 , p4 , p5;
     JCheckBox c , c1 , c2 , c3 , c4 , c5 , c6 , c7 , c8 , c9;
     JLabel l , l1, l4 ,l5, l6 , l7 , l8 ,l9 , l10 ,l11 , l12 ,l13 ,l14 ,l15, l16 , l17, l18 , l19;
     JButton b;
     
     
     Barat(){
       try{  
        f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(250,30,590,685);
        f.setTitle("BARAT"); 
        f.setLayout(new FlowLayout(FlowLayout.CENTER,400,0));
        
        
            Image  i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");    
            f.setIconImage(i);
        
        
        p2 = new JPanel();
        f.add(p2);
        p2.setBackground(Color.BLUE);
        p2.setPreferredSize(new Dimension(700,37));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 15));
        
        
        p = new JPanel();
        f.add(p);
        p.setBackground(Color.BLUE);
        p.setPreferredSize(new Dimension(700,90));
        p.setLayout(new FlowLayout(FlowLayout.CENTER , 35, 18));
        
        p1 = new JPanel();
        f.add(p1);
        p1.setBackground(Color.BLUE);
        p1.setPreferredSize(new Dimension(700,30));
        
        p3 = new JPanel();
        f.add(p3);
        p3.setBackground(Color.BLUE);
        p3.setPreferredSize(new Dimension(630,100));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER , 35 , 14));
        
        p4 = new JPanel();
        f.add(p4);
        p4.setBackground(Color.BLUE);
        p4.setPreferredSize(new Dimension(700,40));
        p4.setLayout(new FlowLayout(FlowLayout.CENTER , 35 , 4 ));
         
        p5 = new JPanel();
        f.add(p5);
        p5.setBackground(Color.white);
        p5.setPreferredSize(new Dimension(700,400));
        p5.setLayout(new FlowLayout(FlowLayout.CENTER ,500 , 5 ));
        
        c = new JCheckBox("Hall Booking_305000 Rs.");
        p.add(c);
        c.setForeground(Color.white);
        c.setBackground(Color.BLUE);
        //c.addActionListener((ActionListener)this);
        
        c1 = new JCheckBox("Decoration_25000 Rs.");
        p.add(c1);
        c1.setForeground(Color.white);
        c1.setBackground(Color.BLUE);
        //c1.addActionListener(this);
        
        c2 = new JCheckBox("Special Entry_15000 Rs.");
        p.add(c2);
        c2.setForeground(Color.white);
        c2.setBackground(Color.BLUE);
        //c2.addActionListener(this);
        
        c3 = new JCheckBox("Bridal Dress_99000");
        p.add(c3);
        c3.setForeground(Color.white);
        c3.setBackground(Color.BLUE);
       // c3.addActionListener(this);
        
        l = new JLabel("Select the activities for your Barat Event");
        p2.add(l);
        l.setFont(new Font("Calibri" , Font.CENTER_BASELINE , 25));
        l.setForeground(Color.white);
        
        
        l1 = new JLabel("SELECT THE FOOD ITEMS YOU WANT");
        p1.add(l1);   
        l1.setFont(new Font("Calibri" , Font.BOLD , 18));
        l1.setForeground(Color.white);
        
        
       c4 = new JCheckBox("Popcorn Table_3500 Rs.");
       p3.add(c4);
       c4.setForeground(Color.white);
       c4.setBackground(Color.BLUE);
       //c4.addActionListener(this);
       
       c5 = new JCheckBox("Biryani_7800 Rs.");
       p3.add(c5);
       c5.setForeground(Color.white);
       c5.setBackground(Color.BLUE);
       //c5.addActionListener(this);
       
       c6 = new JCheckBox("Fried Chicken and Gravy_6000 Rs.");
       p3.add(c6);
       c6.setForeground(Color.white);
       c6.setBackground(Color.BLUE);
      // c6.addActionListener(this);
       
       c7 = new JCheckBox("Tacos_2300 Rs.");
       p3.add(c7);
       c7.setForeground(Color.white);
       c7.setBackground(Color.BLUE);
      // c7.addActionListener(this);
       
       c8 = new JCheckBox("Spaghetti_3200 Rs.");
       p3.add(c8);
       c8.setForeground(Color.white);
       c8.setBackground(Color.BLUE);
       //c8.addActionListener(this);
       
       c9 = new JCheckBox("Fajitas_3500 Rs.");
       p3.add(c9);
       c9.setForeground(Color.white);
       c9.setBackground(Color.BLUE);
      // c9.addActionListener(this);
     
      
       
       
       
       b = new JButton("OK");
       p4.add(b);
       b.setBackground(Color.BLUE);
       b.setForeground(Color.white);
       b.setFont(new Font("Calibri" , Font.BOLD , 15));
       b.addActionListener(this);
       
       
       l15 = new JLabel("RECEIPT");
       p5.add(l15);
       l15.setForeground(new Color(0,0,139));
       l15.setFont(new Font("Calibri", Font.BOLD +Font.ITALIC , 24));
       l15.setBorder((BorderFactory.createMatteBorder(0 , 0 , 5 , 0 , new Color(0,0,139))));
       
       
       l5 = new JLabel("Hall Price: Rs. 0");
       p5.add(l5);
       l5.setForeground(Color.blue);
       
       l6 = new JLabel("Decoration Price: Rs. 0");
       p5.add(l6);
       l6.setForeground(Color.blue);
       
       l7 = new JLabel("Special Entry Price: Rs. 0");
       p5.add(l7);
       l7.setForeground(Color.blue);
       
       l8 = new JLabel("Bridal Dress Price: Rs. 0");
       p5.add(l8);
       l8.setForeground(Color.blue);
       
       l9= new JLabel("Popcorn Table Price: Rs. 0");
       p5.add(l9);
       l9.setForeground(Color.blue);
       
       l10 = new JLabel("Biryani Price: Rs. 0");
       p5.add(l10);
       l10.setForeground(Color.blue);
       
       l11 = new JLabel("Fried Chicken and Gravy Price: Rs. 0");
       p5.add(l11);
       l11.setForeground(Color.blue);
       
       l12 = new JLabel("Tacos Pirce: Rs. 0");
       p5.add(l12);
       l12.setForeground(Color.blue);
       
       l13 = new JLabel("Spaghetti Price: Rs. 0");
       p5.add(l13);
       l13.setForeground(Color.blue);
       
       l14 = new JLabel("Fajitas Price: Rs. 0");
       p5.add(l14);
       l14.setForeground(Color.blue);
       
       l16 = new JLabel("Total Amount:  Rs. 0");
       p5.add(l16);
       l16.setForeground(new Color(0,0,139));
       l16.setFont(new Font("calibri", Font.BOLD, 15));
       l16.setBorder((BorderFactory.createMatteBorder(0 , 0 , 3 , 0 , new Color(0,0,139))));
       
       l17 = new JLabel("");
       p5.add(l17);
       l17.setForeground(Color.blue);
       
       l18 = new JLabel("");
       p5.add(l18);
       l18.setForeground(Color.blue);
       
       l19 = new JLabel("");
       p5.add(l19);
       l19.setForeground(Color.blue);
       
       f.setVisible(true);
       }
             catch(NumberFormatException e){
        JOptionPane.showMessageDialog(f, "Error: You must enter an integer");
    }
    catch(HeadlessException e){
         JOptionPane.showMessageDialog(f, e);
    }
     catch(Exception e){
           JOptionPane.showMessageDialog(f, "Something went wrong! \nException occurs ");
      
    }
        
     }
     @Override
      public void actionPerformed(ActionEvent e){
   
          double price;
       if(e.getSource()==b){
              try {
                  FileWriter w = new FileWriter("C:\\Users\\Momina\\Desktop\\Wedding Details", true);
                  w.write("Barat details:\n");
           if(c.isSelected()){
               price = 305000;
               total+= price;
               l5.setText("Hall Price: Rs. "+String.valueOf(price));
                w.write("Hall Price: Rs. "+String.valueOf(price)+"\n");
               
       }
            if(c1.isSelected()){
               price = 25000;
               total+= price;
                l6.setText("Decoration Price: Rs. "+String.valueOf(price));
                w.write("Decoration Price: Rs. "+String.valueOf(price)+"\n") ;
       }
            if(c2.isSelected()){
               price = 15000;
               total+= price;     
               l7.setText("Special Entry Price: Rs. "+String.valueOf(price));
               w.write("Special Entry Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c3.isSelected()){
               price = 99000;
               total+= price;     
               l8.setText("Bridal Dress Price:  Rs. "+String.valueOf(price));
               w.write("Bridal Dress Price:  Rs. "+String.valueOf(price)+"\n");
       }
            if(c4.isSelected()){
               price = this.popcorn;
               total+= price;  
               l9.setText("Popcorn Table Price: Rs. "+String.valueOf(price));
               w.write("Popcorn Table Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c5.isSelected()){
               price = this.Biryani;
               total+= price; 
               l10.setText("Biryani Price: Rs. "+String.valueOf(price));
               w.write("Biryani Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c6.isSelected()){
               price = this.FriedChicken;
               total+= price;     
               l11.setText("Fried Chicken and Gravy Price: Rs. "+String.valueOf(price));
               w.write("Fried Chicken and Gravy Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c7.isSelected()){
               price = this.Tacos;
               total+= price;  
               l12.setText("Tacos Pirce: Rs. "+String.valueOf(price));
                w.write("Tacos Pirce: Rs. "+String.valueOf(price)+"\n");
       }
            if(c8.isSelected()){
               price = this.Spaghetti;
               total+= price;  
               l13.setText("Spaghetti Price: Rs. "+String.valueOf(price));
               w.write("Spaghetti Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c9.isSelected()){
               price = this.Fajitas;
               total+= price;      
               l14.setText("Fajitas Price: Rs. "+String.valueOf(price));
                w.write("Fajitas Price: Rs. "+String.valueOf(price)+"\n");
       }
            l16.setText("Total Amount: Rs. "+String.valueOf(total));
             w.write("Total Amount: Rs. "+String.valueOf(total)+"\n");
            discount();
            w.write("Total amount after 20% discount : Rs.  "
                        +String.valueOf(discount)+"\n\n");
            w.close();
             new Weddings();
       }
              catch (IOException ex) {
                  Logger.getLogger(Mehndi.class.getName()).log(Level.SEVERE, null, ex);    
        }
        
              }     
        }
 
    @Override
      public void discount(){
          try{  
             double sum = total*  0.2;
             discount = total-sum;
           l17.setText("Congratulations!");
           l18.setText ("You got 20% discount on Barat.");
           l19.setText ("Your total amount after discount is: Rs.  "
                        +String.valueOf(discount));
                      
        }    
      

        catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
              JOptionPane.showMessageDialog(f, ex);
          }
      }
      
      
    @Override
      public void setPriceHall(double priceHall) {
        this.priceHall = priceHall;
    }

    public void setPopcorn(double popcorn) {
        this.popcorn = popcorn;
    }

    public void setBiryani(float iceCreamBar) {
        this.Biryani = iceCreamBar;
    }

    public void setFriedChicken(float FriedChicken) {
        this.FriedChicken = FriedChicken;
    }

    public void setTacos(float Tacos) {
        this.Tacos = Tacos;
    }

    public void setSpaghetti(float Spaghetti) {
        this.Spaghetti = Spaghetti;
    }

    public void setFajitas(float Fajitas) {
        this.Fajitas = Fajitas;
    }

    public void setTotal(double total) {
        this.total = total;
    }
      
      @Override
    public void hallBooking() {
      if(c.isSelected()){
          l4.setText(hallName);
      }
    } 
    
    @Override
    public void setDecorationPrice(double d) {
        this.decorationPrice = d;
    }
    @Override
    public void setEntryPrice(double e) {
        this.entryPrice = e;
        
    }
    @Override
    public void setDanceFloorAmount(double f) {
        this.danceFloorAmount = f;
        
    }
   
     
     public static void main(String args[]){
         Barat mehndi = new Barat();
           mehndi.setPopcorn(3500);
         mehndi.setBiryani(7800);
         mehndi.setSpaghetti(3200);
         mehndi.setFajitas(3500);


     }   
}


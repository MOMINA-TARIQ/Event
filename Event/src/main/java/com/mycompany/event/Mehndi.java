/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;



/**
 *
 * @author Momina
 */

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Mehndi extends Wedding implements ActionListener {
    
  
    double popcorn = 3500;
    float iceCreamBar = 4000;
    float FriedChicken = 6000;
    float Tacos = 2300;
    float Spaghetti = 3200;
    float Fajitas = 3500;
    
    
    
     
     JFrame f;
     JPanel p , p1 , p2 , p3 , p4 , p5 ;
     JCheckBox c , c1 , c2 , c3 , c4 , c5 , c6 , c7 , c8 , c9 ;
     JLabel l , l1, l4 ,l5 , l6 , l7 , l8 ,l9 , l10 ,l11 , l12 ,l13 ,l14 ,l15, l16 , l18;
     JButton b;
     
     
     Mehndi(){
       try{  
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(250,50,570,650);
        f.setTitle("MEHNDI"); 
        f.setLayout(new FlowLayout(FlowLayout.CENTER,400,0));
        
        
        Image  i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");    
        f.setIconImage(i);
        
        p2 = new JPanel();
        f.add(p2);
        p2.setBackground(Color.blue);
        p2.setPreferredSize(new Dimension(700,50));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 120, 20));
        
        
        p = new JPanel();
        f.add(p);
        p.setBackground(Color.blue);
        p.setPreferredSize(new Dimension(700,90));
        p.setLayout(new FlowLayout(FlowLayout.CENTER , 35, 18));
        
        p1 = new JPanel();
        f.add(p1);
        p1.setBackground(Color.blue);
        p1.setPreferredSize(new Dimension(700,30));
        
        p3 = new JPanel();
        f.add(p3);
        p3.setBackground(Color.blue);
        p3.setPreferredSize(new Dimension(630,120));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER , 35 , 14));
        
        p4 = new JPanel();
        f.add(p4);
        p4.setBackground(Color.blue);
        p4.setPreferredSize(new Dimension(700,40));
        p4.setLayout(new FlowLayout(FlowLayout.CENTER , 35 , 4 ));
         
        p5 = new JPanel();
        f.add(p5);
        p5.setBackground(Color.white);
        p5.setPreferredSize(new Dimension(700,400));
        p5.setLayout(new FlowLayout(FlowLayout.CENTER ,1100 , 5 ));
        
        c = new JCheckBox("Hall Booking_305000 Rs.");
        p.add(c);
        c.setForeground(Color.white);
        c.setBackground(Color.blue);
        //c.addActionListener((ActionListener)this);
        
        c1 = new JCheckBox("Decoration_25000 Rs.");
        p.add(c1);
        c1.setForeground(Color.white);
        c1.setBackground(Color.blue);
        //c1.addActionListener(this);
        
        c2 = new JCheckBox("Special Entry_15000 Rs.");
        p.add(c2);
        c2.setForeground(Color.white);
        c2.setBackground(Color.blue);
        //c2.addActionListener(this);
        
        c3 = new JCheckBox("Dance Floor_17000 Rs.");
        p.add(c3);
        c3.setForeground(Color.white);
        c3.setBackground(Color.blue);
       // c3.addActionListener(this);
        
        l = new JLabel("Select the activities for your Mehndi Event");
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
       c4.setBackground(Color.blue);
       //c4.addActionListener(this);
       
       c5 = new JCheckBox("Ice Cream Bar_4000 Rs.");
       p3.add(c5);
       c5.setForeground(Color.white);
       c5.setBackground(Color.blue);
       //c5.addActionListener(this);
       
       c6 = new JCheckBox("Fried Chicken and Gravy_6000 Rs.");
       p3.add(c6);
       c6.setForeground(Color.white);
       c6.setBackground(Color.blue);
      // c6.addActionListener(this);
       
       c7 = new JCheckBox("Tacos_2300 Rs.");
       p3.add(c7);
       c7.setForeground(Color.white);
       c7.setBackground(Color.blue);
      // c7.addActionListener(this);
       
       c8 = new JCheckBox("Spaghetti_3200 Rs.");
       p3.add(c8);
       c8.setForeground(Color.white);
       c8.setBackground(Color.blue);
       //c8.addActionListener(this);
       
       c9 = new JCheckBox("Fajitas_3500 Rs.");
       p3.add(c9);
       c9.setForeground(Color.white);
       c9.setBackground(Color.blue);
      // c9.addActionListener(this);
     
      
       
       b = new JButton("OK");
       p4.add(b);
       b.setBackground(Color.blue);
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
       
       l8 = new JLabel("Dance Floor Price: Rs. 0");
       p5.add(l8);
       l8.setForeground(Color.blue);
       
       l9= new JLabel("Popcorn Table Price: Rs. 0");
       p5.add(l9);
       l9.setForeground(Color.blue);
       
       l10 = new JLabel("IceCreamBar Price: Rs. 0");
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
          double total=0;
          double price;
       if(e.getSource()==b){
           try {
                  FileWriter w = new FileWriter("C:\\Users\\Momina\\Desktop\\Wedding Details", true);
                  w.write("Mehndi details:\n");
                
             
 
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
                w.write("Decoration Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c2.isSelected()){
               price = 15000;
               total+= price;     
               l7.setText("Special Entry Price: Rs. "+String.valueOf(price));
               w.write("Special Entry Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c3.isSelected()){
               price = 17000;
               total+= price;     
               l8.setText("Dance Floor Price:  Rs. "+String.valueOf(price));
               w.write("Dance Floor Price:  Rs. "+String.valueOf(price)+"\n");
               
       }
            if(c4.isSelected()){
               price = this.popcorn;
               total+= price;  
               l9.setText("Popcorn Table Price: Rs. "+String.valueOf(price));
               w.write("Popcorn Table Price: Rs. "+String.valueOf(price)+"\n");
       }
            if(c5.isSelected()){
               price = this.iceCreamBar;
               total+= price; 
               l10.setText("IceCreamBar Price: Rs. "+String.valueOf(price));
               w.write("IceCreamBar Price: Rs. "+String.valueOf(price)+"\n");
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
            w.write("Total Amount: Rs. "+String.valueOf(total)+"\n\n");
            w.close();
            new Weddings();
            
         } 
              catch (IOException ex) {
                  Logger.getLogger(Mehndi.class.getName()).log(Level.SEVERE, null, ex);
              }   
            
       }
            
           
      }
      /*  if(e.getSource()==b){
           
           calulateTotal();
           l5.setText("ok");
    
    }
       new Weddings();
         double[] amount ={priceHall,decorationPrice, entryPrice, danceFloorAmount, popcorn, iceCreamBar
                          , FriedChicken, Tacos, Spaghetti , Fajitas};
       JCheckBox[] C= {c , c1, c2, c3 , c4 , c5 ,c6,c7,c8 ,c9 };
       String[] n ={"Hall price","decoration Price", "entry Price", "danceFloor Amount", "popcorn", "iceCreamBar"
                      , "FriedChicken", "Tacos", "Spaghetti" , "Fajitas"};
       
        try {
            FileWriter w = new FileWriter("C:\\Users\\Momina\\Desktop\\Client Detials",true);
             for(int i=0; i<10 ; i++){
          
            if (C[i].isSelected()){
                
                nn = n[i];
                ttl =amount[i];
                w.write(nn+"= "+ttl+"\n");
                  
                }
                 
       
        }
            
        w.write("Total Amount: "+total+"\n");
             w.close();   
             
        } 
        
         catch(ArrayIndexOutOfBoundsException ex){
              JOptionPane.showMessageDialog(f, ex);
            
        }
        catch (IOException ex) {
            Logger.getLogger(Mehndi.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      } 
      
  
      int total=0;
   
      //String[] a= new String[11];
      //double[] o= new double[11];*/
 
   /* @Override
      public void calulateTotal(){
           double[] amount ={priceHall,decorationPrice, entryPrice, danceFloorAmount, popcorn, iceCreamBar
                          , FriedChicken, Tacos, Spaghetti , Fajitas};
             //String[] amountt ={"Hall price","decoration Price", "entry Price", "danceFloor Amount", "popcorn", "iceCreamBar"
             //             , "FriedChicken", "Tacos", "Spaghetti" , "Fajitas"};
        JCheckBox[] C= {c , c1, c2, c3 , c4 , c5 ,c6,c7,c8 ,c9 };
        try{
         for(int i=0; i<10 ; i++){
          
            if (C[i].isSelected()){
                
               // o[i]=amount[i];
                //a[i] = amountt[i]; 
                total+=amount[i];
               
                }
       
        }
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
              JOptionPane.showMessageDialog(f, ex);
          }
       
      
         String t= String.valueOf(total);
         JOptionPane.showMessageDialog(f ,"Receipt\nTotal amount= "+t);       
         f.dispose();
        
      }*/
      
      public void setPriceHall(double priceHall) {
        this.priceHall = priceHall;
    }

    public void setPopcorn(double popcorn) {
        this.popcorn = popcorn;
    }

    public void setIceCreamBar(float iceCreamBar) {
        this.iceCreamBar = iceCreamBar;
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
         Mehndi mehndi = new Mehndi();
         mehndi.setPopcorn(3500);
         mehndi.setIceCreamBar(4000);
         mehndi.setSpaghetti(3200);
         mehndi.setFajitas(3500);

       
         
     }

    @Override
    public void discount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
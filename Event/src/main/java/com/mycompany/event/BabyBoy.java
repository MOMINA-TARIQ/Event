/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;

/**
 *
 * @author Momina
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author COMPLAP
 */
public class BabyBoy extends KID implements ActionListener {
    JButton b1,b2,b3,b4,b5;
    JTextField t;
    JRadioButton r,r1,r2,r3,r4,r5,r6;
   
    
    BabyBoy()
    {
        
        JLabel label=new JLabel("PACKAGES OPTIONS FOR BABYBOYS");
        label.setForeground(Color.BLACK);
        JLabel L3=new JLabel("OUR POLICIES :  1)   We only serve dinner packages upto 200 guests if you want more or less then contact us at our gmail(ummehanibaig.02@gmail.com) before selecting any package ");
                       L3.setForeground(Color.WHITE);

        JLabel L5=new JLabel(" 2)   if you select any of our theme package then it's necessary to select one of our dinner package");
                    L5.setForeground(Color.WHITE);
        
        JFrame f=new JFrame();
        f.setSize(300, 300); 
       f.setVisible(true);
       f.setTitle("BabyBOY");
       JPanel p=new JPanel();
       p.add(L3);
       p.add(L5);
       p.add(label);
       
       f.add(p);
       p.setBackground(Color.BLUE);
       p.setLayout(new FlowLayout(FlowLayout.CENTER,6000,20));
        r4 =new JRadioButton ("SPIDER MAN 70,000");
        r4.setBackground(Color.WHITE);
      r4.setForeground(Color.BLUE);
       p.add(r4);
        r5=new JRadioButton ("JACK AND JILL 60,000");
r5.setBackground(Color.WHITE);
      r5.setForeground(Color.BLUE);
       p.add(r5);
       r6=new JRadioButton ("DOREMON 45,000 ");
       r6.setBackground(Color.WHITE);
      r6.setForeground(Color.BLUE);

       p.add(r6);
       ButtonGroup bg=new ButtonGroup();
        bg.add(r4);
        bg.add(r5);
        bg.add(r6);
        
       
      JLabel Ll=new JLabel("SO, HERE'S OUR UNIQUE  DINNER PACKAGES");
            Ll.setForeground(Color.BLACK);

      p.add(Ll);
          r=new JRadioButton   (" Manchorian Rice ,Chowmein : 20,000");
          r.setBackground(Color.WHITE);
          r.setForeground(Color.BLUE);
        r1=new  JRadioButton ("Chineese rice and   cake   :   10,000 ");
        r1.setBackground(Color.WHITE);
                  r1.setForeground(Color.BLUE);
           r2=new  JRadioButton  ("Cotton Candy stall and Cake: 15,00");
           r2.setBackground(Color.WHITE);
                  r2.setForeground(Color.BLUE);
         r3=new  JRadioButton ("Singaporean Rice and Coffe :    16,000");
         r3.setBackground(Color.WHITE);
                  r3.setForeground(Color.BLUE);
         ButtonGroup g=new ButtonGroup();
        g.add(r);
        g.add(r1);
        g.add(r2);
        g.add(r3);
        
     p.add(r);
     p.add(r1);
     p.add(r2);
     p.add(r3);
      b4=new JButton("CALCULATE TOTAL COST");
      b4.setBackground(Color.WHITE);
       b4.setForeground(Color.BLUE);
       p.add(b4);
       b4.addActionListener(this );
       
       JLabel L2=new JLabel();
       L2.setText("Subtotal");
              L2.setForeground(Color.WHITE);

       p.add(L2);
       t=new JTextField();
       t.setPreferredSize(new Dimension(100,50));
        p.add(t);
       JLabel L4 =new JLabel("Receipt");
                     L4.setForeground(Color.WHITE);

       p.add(L4);
       
       b5=new JButton("generate");
       b5.setBackground(Color.WHITE);
       b5.setForeground(Color.BLUE);
       b5.addActionListener(this);
      
       
       p.add(b5);
       
       
    }

         
    


      public void actionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        double Subtotal=0;
        String Hani="";
        
        
           EventManagement eventManagement = new EventManagement();

        if(r.isSelected()){
            Subtotal=Subtotal+20000;
        } 
        if(r1.isSelected())
        {
            Subtotal=Subtotal+10000;
        }
        if(r2.isSelected())
        {
            Subtotal=Subtotal+15000;
        }
        if(r3.isSelected())
        {
            Subtotal=Subtotal+16000;
        }
        
        if(r4.isSelected())
        {
           
            Subtotal=Subtotal+70000;
 
        }
        if(r5.isSelected())
        {
           
            Subtotal=Subtotal+60000;
 
        }
        
        if(r6.isSelected())
        {
           
            Subtotal=Subtotal+45000;
 
        }
        if(evt.getSource()==b5)
            
        {
          
        if (r4.isSelected()&&r.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "SPIDER MAN  : 70,000 "+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"90000.0"+"\n"+"------------------------------");  
        JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  

         Hani="***HERE'S YOUR RECEIPT***"+"\n"+" SPIDER MAN  : 70,000"+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"90000.0"+"\n"+"--------------------------------"+"\n";

        }
        if (r4.isSelected()&&r2.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "SPIDER MAN  : 70,000 "+"\n"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"85000.0"+"\n"+"------------------------------");  
        JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  

         Hani="***HERE'S YOUR RECEIPT***"+"\n"+" SPIDER MAN  : 70,000"+"\n"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"85000.0"+"\n"+"--------------------------------"+"\n";

        }
         if (r4.isSelected()&&r3.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "SPIDER MAN  : 70,000 "+"\n"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"86000.0"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  

         Hani="***HERE'S YOUR RECEIPT***"+"\n"+" SPIDER MAN  : 70,000"+"\n"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"86000.0"+"\n"+"--------------------------------"+"\n";

        }
        
        if (r5.isSelected()&&r.isSelected())
        {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "JACK AND JILL : 60,000 "+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"80000.0"+"\n"+"------------------------------");  
        JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  

            Hani="***HERE'S YOUR RECEIPT***"+"\n"+" JACK AND JILL  : 60,000"+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"80000.0"+"\n"+"--------------------------------"+"\n";
  
        }
        if (r6.isSelected()&&r.isSelected())
        {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "RED AND BLUE : 45,000 "+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"65000.0"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
           
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+" RED AD BLUE  : 45,000"+"\n"+"\n"+"Manchorian Rice ,Chowmein : 20,000"+"\n"+"\n"+"SUBTOTAL :"+"65000.0"+"\n"+"--------------------------------"+"\n";

        
        }
        if (r6.isSelected()&&r1.isSelected())
        {
            
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "RED AND BLUE : 45,000 "+"\n"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"55000.0"+"\n"+"------------------------------");  
        JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
            
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+" RED AD BLUE  : 45,000"+"\n"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"55000.0"+"\n"+"--------------------------------"+"\n";

        
        }
        if (r6.isSelected()&&r2.isSelected())
        {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "RED AND BLUE : 45,000 "+"\n"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"60000.0"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
           
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+" RED AD BLUE  : 45,000"+"\n"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"60000.0"+"\n"+"--------------------------------"+"\n";

        
        }
        if (r6.isSelected()&&r3.isSelected())
        {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+ "RED AND BLUE : 45,000 "+"\n"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"61000.0"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
           
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+" RED AD BLUE  : 45,000"+"\n"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"61000.0"+"\n"+"--------------------------------"+"\n";

        
        }
        if(r4.isSelected()&&r1.isSelected())
        {
           JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"SPIDER MAN: 70,000"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"80000"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
             
           Hani="***HERE'S YOUR RECEIPT***"+"\n"+"SPIDER MAN : 70,000"+"\n"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"80000"+"\n"+"--------------------------------"+"\n";

            
        }
        if(r5.isSelected()&&r1.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL : 60,000"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"70000"+"\n"+"------------------------------");  
          JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
       
         Hani="***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL : 60,000"+"\n"+"Chineese rice and   cake   :   10,000 "+"\n"+"\n"+"SUBTOTAL :"+"70000"+"\n"+"--------------------------------"+"\n";

        }
       if(r5.isSelected()&&r2.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL : 60,000"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"75000"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
        
         Hani="***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL: 60,000"+"\n"+"Cotton Candy stall and Cake: 15,00"+"\n"+"\n"+"SUBTOTAL :"+"75000"+"\n"+"--------------------------------"+"\n";

        }
       if(r5.isSelected()&&r3.isSelected())
        {
         JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL: 60,000"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"76000"+"\n"+"------------------------------");  
         JOptionPane.showMessageDialog(null,"Your order is confirmed we will contact you in 3-4 working days");  
        
         Hani="***HERE'S YOUR RECEIPT***"+"\n"+"JACK AND JILL : 60,000"+"\n"+"Singaporean Rice and Coffe :    16,000"+"\n"+"\n"+"SUBTOTAL :"+"76000"+"\n"+"--------------------------------"+"\n";

        }
       

       

        
         }
        t.setText(Double.toString(Subtotal));
        Subtotal=Double.parseDouble(t.getText());
        
        
        
        
        
        
     
   
   
      
      
     String s = String.valueOf(Hani);
        try {
            FileWriter file = new FileWriter("C:\\Users\\Momina\\Desktop\\Hani",true);
            file.write(s);
            file.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BabyGirl.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      public static void main (String[]args)
      {
        new BabyBoy();  
      }
        
       
      
}

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
public class BabyGirl extends KID implements ActionListener {
    JButton b1,b2;
    JTextField t;
    JRadioButton r,r1,r2,r3,r4,r5,r6;
   public  JCheckBox checkbox_btn,checkbox_btn1,checkbox_btn2,checkbox_btn3;
    
   BabyGirl()
    {
        super();
        JLabel L3=new JLabel("OUR POLICIES :  1)   We only serve dinner packages upto 200 guests if you want more or less then contact us at our gmail(ummehanibaig.02@gmail.com) before selecting any package ");
                L3.setForeground(Color.WHITE);

        JLabel L5=new JLabel(" 2)   if you select any of our theme package then it's necessary to select one of our dinner package");
            L5.setForeground(Color.WHITE);

        JLabel label=new JLabel("THEMES OPTION FOR GIRLS");
                label.setForeground(Color.BLACK);

        JFrame f=new JFrame();
        f.setSize(300, 300); 
       f.setVisible(true);
       f.setTitle("BabyGIRL");
       JPanel p=new JPanel();
       p.add(L3);
       p.add(L5);
       p.add(label);
       f.add(p);
       p.setBackground(Color.BLUE);
       p.setLayout(new FlowLayout(FlowLayout.CENTER,6000,20));
       r4=new JRadioButton(" PURPLE BARBIE    70,000   ");
            r4.setBackground(Color.WHITE);
             r4.setForeground(Color.BLUE); 

       p.add(r4);
       r5=new JRadioButton(" DOORA THE EXPLORER 60,000 ");
                        r5.setBackground(Color.WHITE);
                        r5.setForeground(Color.BLUE);

       p.add(r5);
       r6=new JRadioButton("BLUE NICKALODIAN    45,000 ");
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
       r=new JRadioButton  ("chicken Pasta , Coffe and Lotus Cake: 30,000");
       r.setBackground(Color.WHITE);
                     r.setForeground(Color.BLUE);

       r1=new JRadioButton  ("Mumbai Biryani , Coffe  and  Malt Cake: 25,000");
       r1.setBackground(Color.WHITE);
                     r1.setForeground(Color.BLUE);
        r2=new JRadioButton  (" Pulao ,Kashmiri Chai and Coffe Cake : 29,000");
         r2.setBackground(Color.WHITE);
                     r2.setForeground(Color.BLUE);
        
        r3=new JRadioButton  ("Chineese Rice ,any Drink and any Cake: 35,000");
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
     b1=new JButton("CALCULATE TOTAL COST");
    b1.setBackground(Color.WHITE);
              b1.setForeground(Color.BLUE);  
     p.add(b1);
       b1.addActionListener(this );
       
       
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
       
       b2=new JButton("generate");
       b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
              b2.setForeground(Color.BLUE);

      p.add(b2);
      
       
       
    }

     public void actionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        double Subtotal=0;
        String Hani="";
        
         EventManagement eventManagement = new EventManagement();
        if(r.isSelected()){
        
            Subtotal=Subtotal+30000-giftHamper;
        }
        else if(r1.isSelected())
        {
            Subtotal=Subtotal+25000-giftHamper;
        }
        else if(r2.isSelected())
        {
            Subtotal=Subtotal+29000-giftHamper;
        }
        else if(r3.isSelected())
        {
            Subtotal=Subtotal+35000-giftHamper;
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
        if(evt.getSource()==b2)
           
        {
            if(r.isSelected()&&r4.isSelected())
                
            {
             
             JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"100000.0"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 99,000"+"\n");
             JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
             Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"100000.0"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 99,000"+"\n";

            }
            if(r1.isSelected()&&r4.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"950000.0"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 94,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"850000.0"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 84,000"+"\n";
            }if(r2.isSelected()&&r4.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"990000.0"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 98,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
             Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"990000.0"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 98,000"+"\n";
            }
            if(r3.isSelected()&&r4.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"105000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 104,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
           Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "PURPLE BARBIE 70,000 "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"105000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 104,000"+"\n";
            }
            if(r.isSelected()&&r5.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"90000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 89,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
             Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"90000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 89,000"+"\n";
            }
          if(r1.isSelected()&&r5.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"850000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 84,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER 60,000  "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"850000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 84,000"+"\n";
            }
          if(r2.isSelected()&&r5.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER 60,000  "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"890000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 88,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"890000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 88,000"+"\n";
            }
            
          if(r3.isSelected()&&r5.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"950000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 94,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "DOORA THE EXPLORER  60,000  "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"950000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 94,000"+"\n";
            }
        
         
           if(r.isSelected()&&r6.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"750000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 74,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
             Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"chicken Pasta , Coffe and Lotus Cake: 30,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"750000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 74,000"+"\n";
            }
           if(r1.isSelected()&&r6.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"700000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 69,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Mumbai Biryani , Coffe  and  Malt Cake: 25,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"700000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 69,000"+"\n";
            }
           if(r2.isSelected()&&r6.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"740000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 73,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Pulao ,Kashmiri Chai and Coffe Cake : 29,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"740000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 73,000"+"\n";
            }
        if(r3.isSelected()&&r6.isSelected())
                
            {
            JOptionPane.showMessageDialog(null,"***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"800000.0"+"\n"+"\n"+"AND AFTER DISCOUNT YOUR TOTAL AMOUNT IS 79,000"+"\n");
            JOptionPane.showMessageDialog(null,"YOUR ORDER IS CONFIRMED WE WILL CONTACT YOU IN 3-4 WORKING DAYS");
            Hani="***HERE'S YOUR RECEIPT***"+"\n"+"\n"+ "NICKALODIA 45,000  "+"\n"+"Chineese Rice ,any Drink and any Cake: 35,000"+"\n"+"---------------------------"+"\n"+"SUBTOTAL : "+"800000.0"+"\n"+"\n"+"AND AFTER DISCONT YOU TOTAL AMOUNT IS 79,000"+"\n";
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
        public static void main(String[]args)
        {
            new BabyGirl();
        }
 
}


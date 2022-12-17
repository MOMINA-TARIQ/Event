/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;

/**
 
 * @author Momina
 */

import javax.swing.*;
import java.awt.*;      
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class EventManagement implements ActionListener{
    JFrame f;
    JButton b , b1 , b2 , b3, b4;
    JLabel l, l1;
     
    EventManagement(){
      try{
        f = new JFrame();
        
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(250,200,525,365);
        f.setTitle("Event");
        
        JPanel p = new JPanel();
        f.add(p , BorderLayout.WEST);
        p.setPreferredSize(new Dimension(250,0));
        p.setBackground(Color.blue);
        p.setLayout(new FlowLayout(FlowLayout.CENTER,100,0));
        
        
        Image  i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Momina\\Downloads\\images (1).jfif");    
        f.setIconImage(i);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\Momina\\Downloads\\nn.jpg");
         l1 = new JLabel();
         l1.setIcon(i1);
         l1.setPreferredSize(new Dimension(260,350));
         p.add(l1);
         
        
        JPanel p1 = new JPanel();
        f.add(p1 , BorderLayout.EAST );
        p1.setPreferredSize(new Dimension(258,100));
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,400,30));
        p1.setBackground(Color.white);
        
        
        l =  new JLabel("SELECT YOUR DESIRE EVENT");
        p.add(l, BorderLayout.LINE_START);
        l.setFont(new Font("Calibri", Font.BOLD, 20));
        l.setForeground(Color.white);
        
        b = new JButton("Wedding");
        p1.add(b);
        b.setForeground(Color.white);
        b.setBackground(Color.blue);
        b.setPreferredSize(new Dimension(100,30));
        b.addActionListener((ActionListener)this);
       
        
        b1 = new JButton("Birthday");
        p1.add(b1);
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
        b1.setPreferredSize(new Dimension(100,30));
        b1.addActionListener((ActionListener)this);
        
        
        b2 = new JButton("Business");
        p1.add(b2);
        b2.setForeground(Color.white);
        b2.setBackground(Color.blue);
        b2.setPreferredSize(new Dimension(100,30));
        b2.addActionListener((ActionListener)this);
        
        b3 = new JButton("Sports");
        p1.add(b3);
        b3.setForeground(Color.white);
        b3.setBackground(Color.blue);
        b3.setPreferredSize(new Dimension(100,30));
        b3.addActionListener((ActionListener)this);
        
        b4 = new JButton("Bachelors ");
        p1.add(b4);
        b4.setForeground(Color.white);
        b4.setBackground(Color.blue);
        b4.setPreferredSize(new Dimension(100,30));
        b4.addActionListener((ActionListener)this);
        
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
   
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed (ActionEvent e){
       
        if(e.getSource()==b){
            Weddings weddings = new Weddings();
            f.dispose();
        }
        if(e.getSource()==b3){
            new Sports();
            f.dispose();  
        }
        if(e.getSource()==b1){
            new BirthDay();
            f.dispose();
        }
        if(e.getSource()==b4){
            new BachelorParty();
            f.dispose();
        }
       if(e.getSource()==b2){
          new  Business_Events();
          f.dispose();
       }
        
    }
    public static void main(String args[]){
        EventManagement eventManagement = new EventManagement();
    }
}

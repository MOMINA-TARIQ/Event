/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;

/**
 *
 * @author Momina
 */
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
import java.awt.Font;
public class BirthDay implements ActionListener {
    JFrame f;
    public JButton b,b1;
    JLabel l;
    
    
    BirthDay()
    { 
       
       
       f= new JFrame();
       
       
       l = new JLabel("MOMENTS MATTER! LET'S CELEBRATE YOUR BIRTHDAY TOGETHER"); 
       Font fn=new Font("italic",Font.ITALIC,31);
       l.setFont(fn);
       l.setForeground(Color.white);
       
       
       
       
       
       b = new JButton("SETUP FOR KIDS"); 
       b.setBackground(Color.WHITE);
       b.setForeground(Color.BLUE);
       b.addActionListener(this);
       Font t=new Font("italic",Font.ITALIC,21);
       b.setFont(t);
       b1 = new JButton("SETUP FOR ADULTS"); 
       b1.setBackground(Color.WHITE);
           b1.setForeground(Color.BLUE);
        Font nt=new Font("italic",Font.ITALIC,21);
       b1.setFont(nt);
       b1.addActionListener(this);
       
       
       
       
       
       
       
      JPanel p = new JPanel(); 
       p.add(l);
       
       
       
       p.add(b); 
       p.add(b1); 
       
        
       p.setBackground(Color.BLUE);
       p.setLayout(new FlowLayout(FlowLayout.CENTER,6000,20));
       
       f.add(p); 
       f.setSize(300, 300); 
       f.setVisible(true);
       f.setTitle("BIRTHDAY PLANNERS");
      
    
 }
public static void main(String[] args) {
        
        new BirthDay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            ADULT ad=new ADULT();
        }
       if(e.getSource()==b)
        {
            KID Kd=new KID();
        }
       
    }

    
}
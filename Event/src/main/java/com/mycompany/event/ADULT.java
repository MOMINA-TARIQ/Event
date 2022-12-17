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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author COMPLAP
 */
public class ADULT implements ActionListener  {
  JFrame frame;
    JPanel p;
    JLabel label,l1;
    JButton b1,b2;
    double giftHamper=1000;
    
    

    public ADULT() {
          frame=new JFrame();
          frame.setBounds(200,200,600,350);
          frame.setVisible(true);  
         frame.setTitle("Gender selection Page");
            
        p = new JPanel();
        frame.add(p);
        p.setBackground(Color.BLUE);
        p.setLayout(new GridLayout(4,1));
        label=new JLabel("  ARE YOU READY TO CHECKOUTS ARE EXCITING PACKAGES!!... SELECT THE GENDER PLEASE : ");
        label.setForeground(Color.WHITE);
        p.add(label);
        l1=new JLabel("NOTE : We have special 1000RS Off Gift Hamper on Girl Section dinner packages");
        l1.setForeground(Color.WHITE);
        p.add(l1);
        b1=new  JButton("Boy");
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.WHITE);
        p.add(b1);
        b1.addActionListener(this);

        
        
        b2=new  JButton("Girl");
        
        b2.setForeground(Color.BLUE);
         b2.setBackground(Color.WHITE);
        p.add(b2);
        b2.addActionListener(this);
 
       
        
        
    
}    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            Boy bo=new Boy();
            
        }
        if(e.getSource()==b2){
            JOptionPane.showMessageDialog(null,"WOW! YOU ARE VERY CLOSE TO OUR SPECIAL Gift  which is : "+giftHamper+"off on your dinner package");
            Girl g=new Girl();
            
        }
        
    
}
    
}
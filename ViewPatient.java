
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class ViewPatient extends JFrame implements ActionListener{
     JTable t1;
    JButton b1,b2;
    
    ViewPatient(){
             
      t1=new JTable();
      t1.setBounds(20,40,980,350);
      add(t1);
      
        JLabel l1= new JLabel("Name");
        l1.setBounds(60,10,70,30);
        add(l1);
        
        JLabel l2= new JLabel("Email");
        l2.setBounds(200,10,70,30);
        add(l2);
        
        JLabel l3= new JLabel("Password");
        l3.setBounds(470,10,70,30);
        add(l3);
        
        JLabel l4= new JLabel("Re-type Pass");
        l4.setBounds(600,10,100,30);
        add(l4);
        
        JLabel l5= new JLabel("Number");
        l5.setBounds(750,10,70,30);
        add(l5);
        
        JLabel l6= new JLabel("Age");
        l6.setBounds(900,10,70,30);
        add(l6);
        
         JLabel l7= new JLabel("Username");
        l7.setBounds(330,10,70,30);
        add(l7);
      
      
      b1=new JButton("Load Data");
       b1.setBounds(350,460,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("Back");
      b2.setBounds(525,460,120,30);
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      add(b2);
      
     
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
     setBounds(250,220,1000,550);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           try{
             conn c= new conn();
             String str = "select * from patientsignup";
             ResultSet rs = c.s.executeQuery(str);
             
             t1.setModel(DbUtils.resultSetToTableModel(rs));
             
             
          }catch(Exception e){}
       }else if(ae.getSource()==b2){
          new AdminDashboard().setVisible(true);
          this.setVisible(false);
       }
    }
     public static void main(String[] args){
         new ViewPatient().setVisible(true);  
    }
}

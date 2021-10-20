
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class DoctorDashboard extends JFrame implements ActionListener{
    
     JMenuBar mb;
    JMenu m1,m2,m3,m4;
     JTable t1;
    JComboBox c1,c2,c3;
     JMenuItem i1,i2,i3,i4,i5,i6,i7;
      JButton b1,b2;
     
     DoctorDashboard(){
        
setBounds(350,150,800,500);    
         
         
    mb= new JMenuBar();
    mb.setBackground(Color.gray);
    mb.setFont(new Font("Tahoma",Font.PLAIN,15));
    add(mb);
    
    mb.setBounds(0,0,800,40);
    m1= new JMenu("My Details");
    m1.setForeground(Color.WHITE);
    mb.add(m1);
    
     m2= new JMenu("View Disease");
     m2.setForeground(Color.WHITE);
    mb.add(m2);

    
    m3= new JMenu("View Patient");
     m3.setForeground(Color.WHITE);
    mb.add(m3);
    
    m4= new JMenu("Logout");
     m4.setForeground(Color.WHITE);
    mb.add(m4);
    
      i1= new JMenuItem("My Details");
    i1.addActionListener(this);
    m1.add(i1);
    
    i2= new JMenuItem("View Disease");
    i2.addActionListener(this);
    m2.add(i2);
    
    i3= new JMenuItem("View Patient");
    i3.addActionListener(this);
    m3.add(i3);
    
    i4= new JMenuItem("Logout");
    i4.addActionListener(this);
    m4.add(i4);
    
     
    JLabel l9=new JLabel("Customer Details");
    l9.setBounds(240,0,600,150);
   l9.setForeground(Color.BLACK);
   l9.setFont(new Font("serif",Font.PLAIN,40));
    add(l9);
    
     t1=new JTable();
      t1.setBounds(130,150,500,250);
      add(t1);
      
   
        JLabel l1= new JLabel("Name");
        l1.setBounds(50,10,60,30);
        add(l1);
        
        JLabel l2= new JLabel("Email");
        l2.setBounds(150,10,60,30);
        add(l2);
        
        JLabel l3= new JLabel("Password");
        l3.setBounds(250,10,60,30);
        add(l3);
        
        JLabel l4= new JLabel("Re-type Pass");
        l4.setBounds(350,10,60,30);
        add(l4);
        
        JLabel l5= new JLabel("Number");
        l5.setBounds(450,10,60,30);
        add(l5);
        
        JLabel l6= new JLabel("Age");
        l6.setBounds(550,10,60,30);
        add(l6);
        
      b1=new JButton("Load Data");
      b1.setBounds(250,400,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("Back");
      b2.setBounds(420,400,120,30);
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      add(b2);
    
                  getContentPane().setBackground(Color.WHITE);
                  setLayout(null);
                  setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("My Details")){
             new MyDetails().setVisible(true);
          }else if(ae.getActionCommand().equals("View Disease")){
            new ViewDisease().setVisible(true);
          }else if(ae.getActionCommand().equals("View Patient")){
             new ViewPatient().setVisible(true);
          }else if(ae.getActionCommand().equals("Logout")){
           new SmartHealthPrediction().setVisible(true);
           this.setVisible(false);
          }
        if(ae.getSource()==b1){
           try{
             conn c= new conn();
             String str = "select * from patientsignup";
             ResultSet rs = c.s.executeQuery(str);
             
             t1.setModel(DbUtils.resultSetToTableModel(rs));
             
             
          }catch(Exception e){}
       }else if(ae.getSource()==b2){
          new SmartHealthPrediction().setVisible(true);
          this.setVisible(false);
       }
    
    } 
      public static void main(String[] args){
            new DoctorDashboard();
    }
      
    
}


 

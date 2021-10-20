
package smarthealthprediction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class AdminDashboard extends JFrame implements ActionListener{
    
     JMenuBar mb;
    JMenu m1,m2,m3,m4,m5,m6,m7;
     JTable t1;
    JButton b1,b2;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    
     AdminDashboard(){
           setBounds(250,150,1000,600);    
    
    mb= new JMenuBar();
    mb.setBackground(Color.gray);
    mb.setFont(new Font("Tahoma",Font.PLAIN,15));
    add(mb);
    
    mb.setBounds(0,0,1000,40);
    m1= new JMenu("Add Doctor");
    m1.setForeground(Color.WHITE);
    mb.add(m1);
    
     m2= new JMenu("Add Disease");
     m2.setForeground(Color.WHITE);
    mb.add(m2);
    
     m3= new JMenu("View Patient");
     m3.setForeground(Color.WHITE);
     mb.add(m3);
    
     m4= new JMenu("View Doctor");
     m4.setForeground(Color.WHITE);
    mb.add(m4);
    
     m5= new JMenu("View Disease");
     m5.setForeground(Color.WHITE);
    mb.add(m5);
    
    m6= new JMenu("View Feedback");
     m6.setForeground(Color.WHITE);
    mb.add(m6);
    
    m7= new JMenu("Logout");
     m7.setForeground(Color.WHITE);
    mb.add(m7);
    
       i1= new JMenuItem("Add Doctor");
    i1.addActionListener(this);
    m1.add(i1);
    
    i2= new JMenuItem("Add Disease");
    i2.addActionListener(this);
    m2.add(i2);
    
    i3= new JMenuItem("View Patient");
    i3.addActionListener(this);
    m3.add(i3);
    
    i4= new JMenuItem("View Doctor");
    i4.addActionListener(this);
    m4.add(i4);
    
     i5= new JMenuItem("View Disease");
    i5.addActionListener(this);
    m5.add(i5);
    
     i6= new JMenuItem("View Feedback");
    i6.addActionListener(this);
    m6.add(i6);
    
     i7= new JMenuItem("Logout");
    i7.addActionListener(this);
    m7.add(i7);
    
  
    
    JLabel l9=new JLabel("Customer Details");
    l9.setBounds(300,0,600,150);
   l9.setForeground(Color.BLACK);
   l9.setFont(new Font("serif",Font.PLAIN,50));
    add(l9);
    
       t1=new JTable();
      t1.setBounds(150,150,600,300);
      add(t1);
      
   
        JLabel l1= new JLabel("Name");
        l1.setBounds(50,10,80,30);
        add(l1);
        
        JLabel l2= new JLabel("Email");
        l2.setBounds(160,10,80,30);
        add(l2);
        
        JLabel l3= new JLabel("Password");
        l3.setBounds(290,10,80,30);
        add(l3);
        
        JLabel l4= new JLabel("Re-type Pass");
        l4.setBounds(400,10,80,30);
        add(l4);
        
        JLabel l5= new JLabel("Number");
        l5.setBounds(540,10,80,30);
        add(l5);
        
        JLabel l6= new JLabel("Age");
        l6.setBounds(670,10,80,30);
        add(l6);
        
      b1=new JButton("Load Data");
      b1.setBounds(350,520,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("Back");
      b2.setBounds(525,520,120,30);
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      add(b2);


           
                  getContentPane().setBackground(Color.WHITE);
                  setLayout(null);
                  setVisible(true);
     }
     
     
 public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Add Doctor")){
             new AddDoctor().setVisible(true);
          }else if(ae.getActionCommand().equals("Add Disease")){
            new AddDisease().setVisible(true);
          }else if(ae.getActionCommand().equals("View Patient")){
            new ViewPatient().setVisible(true);
          }else if(ae.getActionCommand().equals("View Doctor")){
             new ViewDoctor().setVisible(true);
          }else if(ae.getActionCommand().equals("View Disease")){
             new ViewDisease().setVisible(true);
          }else if(ae.getActionCommand().equals("View Feedback")){
             new ViewFeedback().setVisible(true);
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
            new AdminDashboard();
    }
  
}

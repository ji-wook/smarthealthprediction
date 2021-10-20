
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewDisease extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
    
    ViewDisease(){
          setBounds(250,220,1000,550);
         
         t1=new JTable();
        t1.setBounds(20,40,1000,350);
      add(t1);
      
        JLabel l1= new JLabel("ID");
        l1.setBounds(80,10,100,30);
        add(l1);
        
        JLabel l2= new JLabel("Disease Name");
        l2.setBounds(330,10,150,30);
        add(l2);
        
        JLabel l3= new JLabel("Disease Symptoms");
        l3.setBounds(550,10,150,30);
        add(l3);
        
        JLabel l4= new JLabel("Disease Type");
        l4.setBounds(830,10,150,30);
        add(l4);
        
      
      
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
     
      setVisible(true);
    } 
   
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           try{
             conn c= new conn();
             String str = "select * from adddisease";
             ResultSet rs = c.s.executeQuery(str);
             
             t1.setModel(DbUtils.resultSetToTableModel(rs));
             
             
          }catch(Exception e){}
       }else if(ae.getSource()==b2){
          new AdminDashboard().setVisible(true);
          this.setVisible(false);
       }
    }
     public static void main(String[] args){
         new ViewDisease().setVisible(true);  
    }
    
}

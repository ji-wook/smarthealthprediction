
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewFeedback extends JFrame implements ActionListener{

   JTable t1;
    JButton b1,b2;
    
    ViewFeedback(){
         setBounds(350,220,800,400);
         
         t1=new JTable();
      t1.setBounds(20,40,880,250);
      add(t1);
      
        JLabel l1= new JLabel("Feedback");
        l1.setBounds(350,10,100,30);
        add(l1);
        
          b1=new JButton("Load Data");
      b1.setBounds(200,300,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("Back");
      b2.setBounds(500,300,120,30);
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
             String str = "select * from feedback";
             ResultSet rs = c.s.executeQuery(str);
             
             t1.setModel(DbUtils.resultSetToTableModel(rs));
             
             
          }catch(Exception e){}
       }else if(ae.getSource()==b2){
          new AdminDashboard().setVisible(true);
          this.setVisible(false);
       }
    }  
     public static void main(String[] args){
         new  ViewFeedback().setVisible(true);  
    }
    
}

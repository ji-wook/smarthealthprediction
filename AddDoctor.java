
package smarthealthprediction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddDoctor extends JFrame implements ActionListener{

     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
    JPasswordField p1,p2;
    
    AddDoctor(){
           setBounds(490,220,530,500);
           
             l3=new JLabel("Add Doctors");
           l3.setBounds(150,10,300,60);
           l3.setFont(new Font("Tahoma",Font.PLAIN,40));
           add(l3);
           
            l1=new JLabel("ID:");
      l1.setBounds(60,100,200,30);
       l1.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l1); 
      
       l2=new JLabel("NAME:");
      l2.setBounds(60,150,200,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l2); 
      
            l4=new JLabel("PASSWORD:");
             l4.setBounds(60,200,200,30);
            l4.setFont(new Font("Tahoma",Font.PLAIN,15));
            add(l4); 
      
       l5=new JLabel("ADDRESS:");
      l5.setBounds(60,250,200,30);
       l5.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l5); 
      
       l6=new JLabel("NUMBER");
      l6.setBounds(60,300,200,30);
       l6.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l6); 
      
      t1=new JTextField();
      t1.setBounds(200,100,200,30);
      add(t1);
      
       t2=new JTextField();
      t2.setBounds(200,150,200,30);
      add(t2);
      
    
       p1=new JPasswordField();
        p1.setBounds(200,200,200,30);
       add(p1); 
      
        t3=new JTextField();
       t3.setBounds(200,250,200,30);
      add(t3);
      
       t4=new JTextField();
      t4.setBounds(200,300,200,30);
      add(t4);
      
      
          b1=new JButton("Register");
      b1.setBounds(90,380,130,27);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setFont(new Font("Tahoma",Font.PLAIN,18));
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("Cancle");
      b2.setBounds(260,380,130,27);
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
      b2.setFont(new Font("Tahoma",Font.PLAIN,18));
      b2.addActionListener(this);
      add(b2);
            getContentPane().setBackground(Color.WHITE);
           setLayout(null);
           setVisible(true);
    }
    
      public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== b1){
         String D_id= t1.getText();
      String D_name= t2.getText();
        String D_password= String.valueOf(p1.getPassword());
       String D_address= t3.getText();
       String D_number= t4.getText();
       
       
         if(D_id.equals("")){
            JOptionPane.showMessageDialog(null," Add Id");
        }else if(D_name.equals("")){
            JOptionPane.showMessageDialog(null," Add Name");
        }else if(D_password.equals("")){
            JOptionPane.showMessageDialog(null,"Add Password");
        }else if(D_address.equals("")){
            JOptionPane.showMessageDialog(null,"Add Address");
        }else if(D_number.equals("")){
            JOptionPane.showMessageDialog(null,"Add Number");
        }
       
         
       String str="insert into adddoctor values('"+D_id+"','"+D_name+"','"+D_password+"','"+D_address+"','"+D_number+"')";
     
       try{
            conn c= new conn();
           
          c.s.executeUpdate(str);
          JOptionPane.showMessageDialog(null,"Doctor is Added Sucessfully!");
             this.setVisible(false);
          
       }catch(Exception e){}
       
      }else if(ae.getSource()==b2){
             this.setVisible(false);
       }   
    
 }
      
   public static void main(String[] args){
        new AddDoctor();
    }
}

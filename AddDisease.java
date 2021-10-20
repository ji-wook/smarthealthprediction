
package smarthealthprediction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class AddDisease extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1;
    JComboBox c1;
    
     @SuppressWarnings("unchecked")
   AddDisease(){ 
      
       setBounds(350,220,800,500); 
       
   JLabel l9=new JLabel("Add Disease");
    l9.setBounds(300,0,600,100);
   l9.setForeground(Color.BLACK);
   l9.setFont(new Font("serif",Font.PLAIN,50));
    add(l9);

     l1=new JLabel("Disease ID:");
      l1.setBounds(200,120,200,30);
       l1.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l1); 
      
       
    l2=new JLabel("Name Of Disease:");
    l2.setBounds(200,170,200,30);
   l2.setForeground(Color.BLACK);
   l2.setFont(new Font("serif",Font.PLAIN,15));
    add(l2);
    
    
         
    l3=new JLabel("Symptoms of Disease:");
    l3.setBounds(200,220,200,30);
   l3.setForeground(Color.BLACK);
   l3.setFont(new Font("serif",Font.PLAIN,15));
    add(l3);
    
         
    l4=new JLabel("Types Of Disease:");
    l4.setBounds(200,330,200,30);
   l4.setForeground(Color.BLACK);
   l4.setFont(new Font("serif",Font.PLAIN,15));
    add(l4);
    
        t1=new JTextField();
      t1.setBounds(350,120,200,30);
      add(t1);
      
       t2=new JTextField();
      t2.setBounds(350,170,200,30);
      add(t2);
      
       t3=new JTextField(150);
      t3.setBounds(350,220,200,90);
      add(t3);
      
       c1= new JComboBox(new String[]{"--Select--","Heart","Brain","Physio","Bone","Infection","STD"});
        c1.setBounds(350,330,200,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
          b1=new JButton("Submit");
      b1.setBounds(350,400,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
    getContentPane().setBackground(Color.WHITE);
      setLayout(null);
       setVisible(true);   
   }
   
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == b1){  
         
          String id=t1.getText();
          String disease_name=t2.getText();
          String symptoms=t3.getText();
         
          
           String types=(String)c1.getSelectedItem();
          
            String str="insert into adddisease values('"+id+"','"+disease_name+"','"+symptoms+"','"+types+"')";
         try{
             conn c=new conn();
             c.s.executeUpdate(str);
             
               JOptionPane.showMessageDialog(null,"Disease Added Sucessfully!");
             new AdminDashboard().setVisible(true);
             this.setVisible(false);
         }catch(Exception e){}
    }
   }
   
      public static void main(String[] args){
            new AddDisease();
    }
}

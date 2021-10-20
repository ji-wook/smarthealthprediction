
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FeedBack extends JFrame implements ActionListener{

     JLabel l1,l2,l3;
    JTextField t1;
       JButton b1;
       
  FeedBack(){
      setBounds(450,300,500,300);
         
          l3=new JLabel("FeedBack");
      l3.setBounds(170,10,500,60);
       l3.setFont(new Font("Tahoma",Font.PLAIN,40));
      add(l3); 
      
       l1=new JLabel("Feedback:");
      l1.setBounds(60,120,200,30);
       l1.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l1); 
      
        t1=new JTextField(50);
      t1.setBounds(170,100,200,70);
      add(t1);
      
         b1=new JButton("Submit");
      b1.setBounds(180,200,130,27);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setFont(new Font("Tahoma",Font.PLAIN,18));
      b1.addActionListener(this);
      add(b1);
      
         getContentPane().setBackground(Color.WHITE);
   setLayout(null);
   setVisible(true);
  } 
  

   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == b1){  
         
          String fb=t1.getText();
          
            String str="insert into feedback values('"+fb+"')";
         try{
             conn c=new conn();
             c.s.executeUpdate(str);
             
               JOptionPane.showMessageDialog(null,"Thanyou for your feedback");
             this.setVisible(false);
         }catch(Exception e){}
    }
   }   
     public static void main(String[] args){
            new FeedBack();
    }
}

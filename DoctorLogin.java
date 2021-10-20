
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class DoctorLogin extends JFrame implements ActionListener{
   
     JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    
    DoctorLogin(){
        
         setBounds(500,200,500,400);
         
          l3=new JLabel("Login");
      l3.setBounds(170,10,200,60);
       l3.setFont(new Font("Tahoma",Font.PLAIN,50));
      add(l3); 
      
          l1=new JLabel("ID");
      l1.setBounds(60,120,200,30);
       l1.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l1); 
      
       l2=new JLabel("PASSWORD");
      l2.setBounds(60,170,200,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l2); 
      
      t1=new JTextField();
      t1.setBounds(220,120,200,30);
      add(t1);
      
       p1=new JPasswordField();
      p1.setBounds(220,170,200,30);
      add(p1);
      
      b1=new JButton("LOGIN");
      b1.setBounds(80,250,130,27);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setFont(new Font("Tahoma",Font.PLAIN,18));
      b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("CANCEL");
      b2.setBounds(250,250,130,27);
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
      String D_password= String.valueOf(p1.getPassword());
      conn c= new conn();
      
      
      
      String str = "select * from adddoctor where D_id= '"+D_id+"'and D_password='"+D_password+"'";
      try{
           ResultSet rs= c.s.executeQuery(str);
          
          if(rs.next()){
           new DoctorDashboard().setVisible(true);
           this.setVisible(false);
          }else{
           JOptionPane.showMessageDialog(null, "Invalid Id or Password");
           this.setVisible(false);
          }
      }catch(Exception e){}
    }else if(ae.getSource()==b2){
     new SmartHealthPrediction().setVisible(true);
       this.setVisible(false);
    }
   
  }
   public static void main(String[] args){
            new DoctorLogin();
    }
  
}


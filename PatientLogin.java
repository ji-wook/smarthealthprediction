
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PatientLogin extends JFrame implements ActionListener{
     JLabel l1,l2,l3;
    JTextField t1;
    JButton b1,b2,b3;
    JPasswordField p1;
    
    PatientLogin(){
         setBounds(500,200,500,400);
         
          l3=new JLabel("Login");
      l3.setBounds(170,10,200,60);
       l3.setFont(new Font("Tahoma",Font.PLAIN,50));
      add(l3); 
      
          l1=new JLabel("USERNAME");
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
      
      b3=new JButton("click here! to create your account");
      b3.setBounds(110,300,250,25);
      b3.setBackground(Color.WHITE);
      b3.setForeground(Color.BLACK);
       b3.setFont(new Font("Tahoma",Font.PLAIN,13));
        b3.addActionListener(this);
      add(b3); 
      
       getContentPane().setBackground(Color.WHITE);
   setLayout(null);
   setVisible(true);
     }
     
       public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== b1){
      String username= t1.getText();
      String password= String.valueOf(p1.getPassword());
      conn c= new conn();
      
      if(username.equals("")){
            JOptionPane.showMessageDialog(null,"Username can not be blank");
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(null,"Password must required");
        }
      
      String str = "select * from patientsignup where username= '"+username+"'and password='"+password+"'";
      try{
           ResultSet rs= c.s.executeQuery(str);
          
          if(rs.next()){
           new PatientDashboard().setVisible(true);
           this.setVisible(false);
          }else{
           JOptionPane.showMessageDialog(null, "Invalid username or password");
           this.setVisible(false);
          }
      }catch(Exception e){}
    }else if(ae.getSource()==b2){
     new SmartHealthPrediction().setVisible(true);
       this.setVisible(false);
    }else if(ae.getActionCommand().equals("click here! to create your account")){
             new PatientSignUp().setVisible(true);
             this.setVisible(false);
    }
  }
    public static void main(String[] args){
            new PatientLogin();
    }
}

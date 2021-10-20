
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PatientSignUp extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t4,t5,t6;
    JButton b1,b2,b3;
    JPasswordField p1,p2;
    
     PatientSignUp (){
           setBounds(450,50,500,650);
           
           l3=new JLabel("Register");
           l3.setBounds(150,10,200,60);
           l3.setFont(new Font("Tahoma",Font.PLAIN,50));
           add(l3);
           
            l1=new JLabel("NAME:");
      l1.setBounds(60,100,200,30);
       l1.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l1); 
      
       l2=new JLabel("EMAIL:");
      l2.setBounds(60,150,200,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l2); 
      
            l4=new JLabel("USERNAME:");
             l4.setBounds(60,200,200,30);
            l4.setFont(new Font("Tahoma",Font.PLAIN,15));
            add(l4); 
      
       l5=new JLabel("PASSWORD:");
      l5.setBounds(60,250,200,30);
       l5.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l5); 
      
       l6=new JLabel("RE-TYPE PASS:");
      l6.setBounds(60,300,200,30);
       l6.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l6); 
      
      l7=new JLabel("NUMBER:");
      l7.setBounds(60,350,200,30);
       l7.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l7); 
      
      l8=new JLabel("AGE:");
      l8.setBounds(60,400,200,30);
       l8.setFont(new Font("Tahoma",Font.PLAIN,15));
      add(l8); 
      
  
      t1=new JTextField();
      t1.setBounds(200,100,200,30);
      add(t1);
      
       t2=new JTextField();
      t2.setBounds(200,150,200,30);
      add(t2);
      
      t4=new JTextField();
      t4.setBounds(200,200,200,30);
      add(t4);
      
       p1=new JPasswordField();
      p1.setBounds(200,250,200,30);
      add(p1);
      
      p2=new JPasswordField();
      p2.setBounds(200,300,200,30);
      add(p2);
      
       t5=new JTextField();
      t5.setBounds(200,350,200,30);
      add(t5);
     
       t6=new JTextField();
      t6.setBounds(200,400,200,30);
      add(t6);
      
      
          b1=new JButton("REGISTER");
      b1.setBounds(80,470,130,27);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setFont(new Font("Tahoma",Font.PLAIN,18));
    b1.addActionListener(this);
      add(b1);
      
      b2=new JButton("CANCEL");
      b2.setBounds(250,470,130,27);
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
      b2.setFont(new Font("Tahoma",Font.PLAIN,18));
      b2.addActionListener(this);
      add(b2);
      
       b3=new JButton("click here! to login your account");
      b3.setBounds(110,520,250,25);
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
      String name= t1.getText();
      String email= t2.getText();
        String username= t4.getText();
        String password= String.valueOf(p1.getPassword());
        String retype_pass= String.valueOf(p2.getPassword());
       String number= t5.getText();
       String age= t6.getText();
       
       
         if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Add Name");
        }else if(email.equals("")){
            JOptionPane.showMessageDialog(null,"Add Email");
        }else if(username.equals("")){
            JOptionPane.showMessageDialog(null,"Add Username");
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(null,"Add Password");
        } else if(!password.equals(retype_pass)){
            JOptionPane.showMessageDialog(null,"Retype the Password again");
        }else if(number.equals("")){
            JOptionPane.showMessageDialog(null,"Add Number");
        }else if(age.equals("")){
            JOptionPane.showMessageDialog(null,"Add Age");
        }
       
         
       String str="insert into patientsignup values('"+name+"','"+email+"','"+username+"','"+password+"','"+retype_pass+"','"+number+"','"+age+"')";
     
       try{
            conn c= new conn();
           
          c.s.executeUpdate(str);
          JOptionPane.showMessageDialog(null,"Registered Sucessfully");
             new PatientLogin().setVisible(true);
             this.setVisible(false);
          
       }catch(Exception e){}
       
      }else if(ae.getSource()==b2){
            new SmartHealthPrediction().setVisible(true);
             this.setVisible(false);
          
     }else if(ae.getActionCommand().equals("click here! to login your account")){
             new PatientLogin().setVisible(true);
             this.setVisible(false);
     }   
    
 }
      public static void main(String[] args){
        new PatientSignUp();
    }
  
}

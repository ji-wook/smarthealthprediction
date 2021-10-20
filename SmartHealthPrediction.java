
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SmartHealthPrediction extends JFrame implements ActionListener{
   
    SmartHealthPrediction(){
        
         setBounds(200,100,1180,663);
         
    
     JLabel l2=new JLabel("Smart health prediction");
    l2.setBounds(120,10,1200,150 );
    l2.setForeground(Color.BLACK);
    l2.setFont(new Font("serif",Font.PLAIN,100));
    add(l2);
    
     JButton b1=new JButton("Admin Login");
    b1.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b1.setBounds(50,300,300,100);
    b1.setFont(new Font("Tahoma",Font.PLAIN,30));
    b1.addActionListener(this);
    add(b1);
    
     JButton b2=new JButton("Patient Login");
    b2.setBackground(Color.BLUE);
    b2.setForeground(Color.WHITE);
    b2.setBounds(430,300,300,100);
    b2.setFont(new Font("Tahoma",Font.PLAIN,30));
    b2.addActionListener(this);
    add(b2);
    
     JButton b3=new JButton("Doctor Login");
    b3.setBackground(Color.BLUE);
    b3.setForeground(Color.WHITE);
    b3.setBounds(810,300,300,100);
    b3.setFont(new Font("Tahoma",Font.PLAIN,30));
    b3.addActionListener(this);
    add(b3);
    
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
    setVisible(true);
    
    }
       public void actionPerformed(ActionEvent ae){
          
           if(ae.getActionCommand().equals("Admin Login")){
             new Login().setVisible(true);
             this.setVisible(false);
          }else if(ae.getActionCommand().equals("Patient Login")){
            new PatientLogin().setVisible(true);
            this.setVisible(false);
          }else if(ae.getActionCommand().equals("Doctor Login")){
            new DoctorLogin().setVisible(true);
            this.setVisible(false);
          }
    
    }
  
    public static void main(String[] args) {
      new SmartHealthPrediction();
    }
    
}

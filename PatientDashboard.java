
package smarthealthprediction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class PatientDashboard extends JFrame implements ActionListener {

     JMenuBar mb;
    JMenu m1,m2,m3,m4;
     JTable t1;
    JComboBox c1,c2,c3;
     JMenuItem i1,i2,i3,i4,i5,i6,i7;
     JButton b1,b2;
    JLabel l1,l2,l3;
    JTextField t7;
    
    @SuppressWarnings("unchecked")
    PatientDashboard(){
          
            setBounds(350,150,800,470);
        
    mb= new JMenuBar();
    mb.setBackground(Color.gray);
    mb.setFont(new Font("Tahoma",Font.PLAIN,15));
    add(mb);
    
    mb.setBounds(0,0,1000,40);
    m1= new JMenu("My Details");
    m1.setForeground(Color.WHITE);
    mb.add(m1);
    
     m2= new JMenu("Show Disease");
     m2.setForeground(Color.WHITE);
    mb.add(m2);

    
    m3= new JMenu("Feedback");
     m3.setForeground(Color.WHITE);
    mb.add(m3);
    
    m4= new JMenu("Logout");
     m4.setForeground(Color.WHITE);
    mb.add(m4);
    
      i1= new JMenuItem("My Details");
    i1.addActionListener(this);
    m1.add(i1);
    
    i2= new JMenuItem("Show Disease");
    i2.addActionListener(this);
    m2.add(i2);
    
    i3= new JMenuItem("Feedback");
    i3.addActionListener(this);
    m3.add(i3);
    
    i4= new JMenuItem("Logout");
    i4.addActionListener(this);
    m4.add(i4);
    
     
    JLabel l9=new JLabel("Disease Prediction");
    l9.setBounds(200,0,600,150);
   l9.setForeground(Color.BLACK);
   l9.setFont(new Font("serif",Font.PLAIN,50));
    add(l9);
    
      l1=new JLabel("Symptom 1:");
    l1.setBounds(200,150,200,30);
   l1.setForeground(Color.BLACK);
   l1.setFont(new Font("serif",Font.PLAIN,15));
    add(l1);
    
    c1= new JComboBox(new String[]{"--Select--","fever","Weakness","fainting","shortness of breath","sharp chest pain","swelling"});
        c1.setBounds(350,150,200,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        l2=new JLabel("Symptom 2:");
    l2.setBounds(200,200,200,30);
   l2.setForeground(Color.BLACK);
   l2.setFont(new Font("serif",Font.PLAIN,15));
    add(l2);
    
    
    c2= new JComboBox(new String[]{"--Select--","faster heartbeat","joint pains","throat inflammation","dizziness","weekness","lower grade fever","rednedd over infected area"});
        c2.setBounds(350,200,200,30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
            l3=new JLabel("Symptom 3:");
    l3.setBounds(200,250,200,30);
   l3.setForeground(Color.BLACK);
   l3.setFont(new Font("serif",Font.PLAIN,15));
    add(l3);
    
    c3= new JComboBox(new String[]{"--Select--","shortness of breath","headache","measel like rashes","chest pounding","irregular heartbeat","stiffness"});
        c3.setBounds(350,250,200,30);
        c3.setBackground(Color.WHITE);
        add(c3);
        
     JLabel l5= new JLabel("Suspected Disease:");
     l5.setBounds(200,370,200,30);
     l5.setForeground(Color.BLACK);
     l5.setFont(new Font("serif",Font.PLAIN,15));
     add(l5);
     
         
      t1=new JTable();
      t1.setBounds(350,380,200,50);
      add(t1);
   
      b1=new JButton("Submit");
      b1.setBounds(350,300,120,30);
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);
      
     
                  getContentPane().setBackground(Color.WHITE);
                  setLayout(null);
                  setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("My Details")){
             new MyDetails().setVisible(true);
          }else if(ae.getActionCommand().equals("Show Disease")){
            new ShowDisease().setVisible(true);
          }else if(ae.getActionCommand().equals("Feedback")){
             new FeedBack().setVisible(true);
          }else if(ae.getActionCommand().equals("Logout")){
           new SmartHealthPrediction().setVisible(true);
           this.setVisible(false);
          }
        
         if(ae.getSource()==b1){
            
            String sym1=(String)c1.getSelectedItem();
           String sym2=(String)c2.getSelectedItem();
             try{
                 conn c= new conn();
             String str = "select disease_name from adddisease where symptoms regexp '"+sym1+"' and symptoms REGEXP '"+sym2+"'";

             ResultSet rs = c.s.executeQuery(str);
           
             t1.setModel(DbUtils.resultSetToTableModel(rs));
            
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
          }
       }
      
       } 
      public static void main(String[] args){
            new PatientDashboard();
    }
      
    
}

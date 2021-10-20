
package smarthealthprediction;
import java.sql.*;

public class conn {

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static PreparedStatement preparedStatement(String select__from_adddisease_where_symptoms__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     Connection c;
    Statement s;
    
     public conn(){
       try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/shp","root","8585");
          s= c.createStatement();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}

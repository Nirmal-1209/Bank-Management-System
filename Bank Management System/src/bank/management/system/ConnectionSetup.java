package bank.management.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class ConnectionSetup {

    Connection connection;
    Statement statement;

    public ConnectionSetup(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "nirmal2002");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}


package com.techblog.helper;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
    
    private static Connection con;  //referance on connection which is private and static
    
    public static Connection getConnection(){
        
        //method which will return connection because we need connection multiple times
        try{
            
            if(con==null){
             
                Class.forName("com.mysql.jdbc.Driver");
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "root");
            }
            }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        return con;
    }
    
}

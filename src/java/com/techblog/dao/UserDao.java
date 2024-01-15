
package com.techblog.dao;

import com.techblog.entities.User;
import com.techblog.helper.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {
    
    private Connection con;

    //whenever want to store data to database we have to create an object of UserDao and initialise it with Connection
    public UserDao(Connection con) {
        this.con = con;
    }

    //saving or storing information about new user in database
    public boolean saveUser(User user){
        boolean f = false;
        try{
            String query =  "insert into user(name, email, password, gender, about) values(?, ?, ?, ?, ?)";//we are not considering id and date as date has default current value and id is auto incrementing
            
            PreparedStatement psmt = this.con.prepareStatement(query);
            
            psmt.setString(1, user.getName());
            psmt.setString(2, user.getEmail());
            psmt.setString(3, user.getPassword());
            psmt.setString(4, user.getGender());
            psmt.setString(5, user.getAbout());
            
            psmt.executeUpdate();
            f = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    
    //getting user from database by email and password at the time of login
    public User getUserByEmailAndPassword(String email, String password){
        
        User user = null;
        
        try{
            
            Connection con = ConnectionProvider.getConnection();
            
            String query = "select * from user where email =? and password =?";
            
            PreparedStatement psmt = con.prepareStatement(query);
            
            psmt.setString(1, email);
            psmt.setString(2, password);
            
            ResultSet set = psmt.executeQuery();
            
            if(set.next()){
                
                user = new User();
                
                user.setName(set.getString("name"));
                user.setEmail(set.getString("email"));
                user.setId(set.getInt("id"));
                user.setAbout(set.getString("about"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setDate(set.getTimestamp("date"));
                user.setProfile(set.getString("profile"));
              
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    //updating user details
    
    public boolean updateUserInDatabase(User user){
        boolean f = false;
        try{
            String query = "update user set name=?, email=?, password=?, about=?, gender=?, profile=? where id=?";
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setString(1, user.getName());
            psmt.setString(2, user.getEmail());
            psmt.setString(3, user.getPassword());
            psmt.setString(4, user.getAbout());
            psmt.setString(5, user.getGender());
            psmt.setString(6, user.getProfile());
            psmt.setInt(7, user.getId());
            
            f = true;
            
            psmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public User getUserByUserId(int userId){
        
        User user = null;
        
        try{
            String query = "select * from user where id=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, userId);
            ResultSet set = ps.executeQuery();
            
            while(set.next()){
                
                user = new User();
                user.setName(set.getString("name"));
                user.setEmail(set.getString("email"));
                user.setId(set.getInt("id"));
                user.setAbout(set.getString("about"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setDate(set.getTimestamp("date"));
                user.setProfile(set.getString("profile"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    
    
}

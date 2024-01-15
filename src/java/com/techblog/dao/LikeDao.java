
package com.techblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LikeDao {
   Connection con = null;

    public LikeDao(Connection con) {
        this.con = con;
    }
   
    
    public boolean insertLike(int pid, int uid){
        boolean f = false;
        try{
            String query = "insert into liked(pid, uid) values(?, ?)";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, pid);
            ps.setInt(2, uid);
            
            ps.executeUpdate();
            
            f = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public int countLike(int pid){
        int cnt = 0;
        try{
            String query = "select count(*) from liked where pid=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, pid);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                cnt = rs.getInt(1);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return cnt;
    }
    
    public boolean checkLikeByUser(int pid, int uid){
        boolean f = false;
        try{
            String query = "select * from liked where pid=? and uid=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, pid);
            ps.setInt(2, uid);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                f = true;
            }      
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteLike(int pid, int uid){
        boolean f = false;
        try{
            String query = "delete from liked where pid=? and uid=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, pid);
            ps.setInt(2, uid);
            
            ps.executeQuery();
            
            f = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    //checkLikeByUserOnPost
    public boolean checkLikeByUserOnPost(int pId, int userId){
        boolean f = false;
        try{
         
            PreparedStatement ps = con.prepareStatement("SELECT * FROM liked WHERE uid=? AND pid=?");
            
            ps.setInt(1, pId);
            ps.setInt(2, userId);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                f = true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return f;
    }
}

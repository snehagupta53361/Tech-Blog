package com.techblog.dao;

import com.techblog.entities.Categories;
import com.techblog.entities.Posts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SNEHA GUPTA
 */
public class PostDao {

    Connection con = null;

    public PostDao(Connection con) {
        this.con = con;
    }

    public ArrayList<Categories> getCategories() {
        ArrayList<Categories> list = new ArrayList();
        try {
            String query = "SELECT * FROM CATEGORIES";

            Statement st = this.con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("cname");
                String description = rs.getString("cdescription");

                Categories c = new Categories(cid, name, description);

                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean savePostToDatabase(Posts post) {
        boolean f = false;

        try {
            String query = "insert into posts(ptitle, pcontent, pcode, ppic, catid, userid) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, post.getpTitle());
            ps.setString(2, post.getpContent());
            ps.setString(3, post.getpCode());
            ps.setString(4, post.getpPic());
            ps.setInt(5, post.getCatId());
            ps.setInt(6, post.getUserId());

            ps.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    //get all posts from database
    public List<Posts> getAllPosts() {
        List posts = new ArrayList();

        try {

            PreparedStatement ps = con.prepareStatement("select * from posts");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int pid = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcode = rs.getString("pcode");
                String pcontent = rs.getString("pcontent");
                String ppic = rs.getString("ppic");
                Timestamp date = rs.getTimestamp("pdate");
                int catId = rs.getInt("catid");
                int userId = rs.getInt("userid");

                Posts post = new Posts(pid, ptitle, pcontent, pcode, ppic, date, catId, userId);

                posts.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;

    }

    //get all posts according to category applied
    public List<Posts> getAllPostsByCategories(int catid) {
        List posts = new ArrayList();

        try {

            PreparedStatement ps = con.prepareStatement("select * from posts where catid=?");

            ps.setInt(1, catid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int pid = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcode = rs.getString("pcode");
                String pcontent = rs.getString("pcontent");
                String ppic = rs.getString("ppic");
                Timestamp date = rs.getTimestamp("pdate");
                int catId = rs.getInt("catid");
                int userId = rs.getInt("userid");

                Posts post = new Posts(pid, ptitle, pcontent, pcode, ppic, date, catId, userId);

                posts.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;

    }

    public Posts getPostInfoByPostId(int postId) {

        Posts posts = new Posts();

        try {

            String query = "Select * from posts where pid=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, postId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int pid = rs.getInt("pid");
                String pTitle = rs.getString("ptitle");
                String pContent = rs.getString("pcontent");
                String pCode = rs.getString("pcode");
                String pPic = rs.getString("ppic");
                Timestamp pDate = rs.getTimestamp("pdate");
                int cId = rs.getInt("catid");
                int userId = rs.getInt("userid");

                posts = new Posts(pid, pTitle, pContent, pCode, pPic, pDate, cId, userId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return posts;
    }
    //deletePost 

    public boolean deletePost(int postId) {
        boolean f = false;
        try {
            String query = "delete from posts where pid=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, postId);

            ps.executeUpdate();

            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    //method related to updation
    public boolean updatePost(int cid, String pTitle, String pContent, String pCode, String pPic, int pId) {
        boolean f = false;

        try {
            String query = "Update posts set ptitle=?, pcontent=?, pcode=?, ppic=?, catid=? where pid=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, pTitle);
            ps.setString(2, pContent);
            ps.setString(3, pCode);
            ps.setString(4, pPic);
            ps.setInt(5, cid);
            ps.setInt(6, pId);

            ps.executeUpdate();

            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

    //get All posts of the user
    public List<Posts> getAllUserPosts(int uId) {
        List posts = new ArrayList();

        try {

            PreparedStatement ps = con.prepareStatement("select * from posts where userid=?");

            ps.setInt(1, uId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int pid = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcode = rs.getString("pcode");
                String pcontent = rs.getString("pcontent");
                String ppic = rs.getString("ppic");
                Timestamp date = rs.getTimestamp("pdate");
                int catId = rs.getInt("catid");
                int userId = rs.getInt("userid");

                Posts post = new Posts(pid, ptitle, pcontent, pcode, ppic, date, catId, userId);

                posts.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;

    }

    //get all posts according to category of the user applied
    public List<Posts> getAllUserPostsByCategories(int catid, int userId) {
        List posts = new ArrayList();

        try {

            PreparedStatement ps = con.prepareStatement("select * from posts where catid=? and userid=?");

            ps.setInt(1, catid);
            ps.setInt(2, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int pid = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcode = rs.getString("pcode");
                String pcontent = rs.getString("pcontent");
                String ppic = rs.getString("ppic");
                Timestamp date = rs.getTimestamp("pdate");
                int catId = rs.getInt("catid");

                Posts post = new Posts(pid, ptitle, pcontent, pcode, ppic, date, catId, userId);

                posts.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;

    }
    
    //getObjectOfCategoriesByCatId
    public Categories getCategoriesByCatId(int catId){
        
        Categories category = null;
        
        try{
            PreparedStatement ps = con.prepareStatement("select * from categories where cid=?");
            
            ps.setInt(1, catId);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Categories catg = new Categories(rs.getString("cname"), rs.getString("cdescription"));
                
                category = catg;
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return category;
    }

}

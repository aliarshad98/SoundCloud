/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.sql.SQLException;

/**
 *
 * @author Ibrahim
 */
public class Account 
{
     int id;
    String name;
    String email;
    String mobile_number;
    String password;
    String blocked_until;
    DBConnection conn = DBConnection.getInstance();
        
    public Account(String name, String email, String mobile_number, String password) 
    {
        this.name = name;
        this.email = email;
        this.mobile_number = mobile_number;
        this.password = password;
    }

    public Account(String name, String email, String mobile_number, String password, String blocked_until) {
        this.name = name;
        this.email = email;
        this.mobile_number = mobile_number;
        this.password = password;
        this.blocked_until = blocked_until;
    }
    
    public User requestUser(int id)
    {
        User u=null;
        try
        {
            u = conn.getUser(id);
        }
        catch(Exception a)
        {
            a.printStackTrace();
        }
        return u;
    }
    public void changeAccountPassword(int id, String pass)
    {
        User u = this.requestUser(id);
        u.setPassword(pass);
        conn.updateUser(u);
        System.out.println("Password of user '" + u.getName() + "' changed.");
    }
    public void blocktheUser(int id, String date_uptil)
    {
        User u = this.requestUser(id);
        u.setBlockDate(date_uptil);
        conn.updateUser(u);
        System.out.println("User '" + u.getName() + "' has been blocked until " + date_uptil + ".");
    }
    public void deleteUser(int id)
    {
        User u = this.requestUser(id);
        if (u==null)
        {
            System.out.println("Unable to delete User with user id = "+ id +".");
        }
        else
        {
            conn.permanentlyDelete(id);
        }
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getBlocked_until() {
        return blocked_until;
    }

    public DBConnection getConn() {
        return conn;
    }
}

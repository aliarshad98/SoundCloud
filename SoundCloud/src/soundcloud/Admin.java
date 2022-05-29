/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

/**
 *
 * @author Ibrahim
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class Admin extends Account
{ 
    private Admin(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    // static variable single_instance of type Singleton 
    private static Admin admin = null;
    public static Admin getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (admin == null) 
            Admin.admin = new Admin (name, email, mobile_number, password); 
        return admin; 
    } 
    public void changePassword(int id, String pass)
    {
        this.changeAccountPassword(id, pass);
    }
    public String blockUser(int id, int days)
    {
        //String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());            
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date date = calendar.getTime();
        this.blocktheUser(id, new SimpleDateFormat("dd/MM/yyyy").format(date));
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
    public void deleteUserAccount(int id)
    {
        this.deleteUser(id);
    }
} 

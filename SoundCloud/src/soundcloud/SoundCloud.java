/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.time.Instant;
import java.util.Date;
/**
 *
 * @author Ibrahim
 */
public class SoundCloud {

    public static User u;
    
    public static String my_email = "soundcloudapp.fast@gmail.com";
    public static String my_pass = "ibrahimzafarrocks";
    Admin admin = Admin.getInstance("soundcloudapp", my_email, "03456721", my_pass);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println(System.getProperty("java.home"));
        //System.out.println(today);
        //conn.InsertAccount("patti", "patti@hotmale.com", "03356789", "4asd56kjs78dsf90", "3/12/18");
        //conn.InsertAccount("shozi", "shozi@hotmail.com", "03672339", "kjsdhfkjhdfg", "3/12/18");
        //conn.InsertAccount("patti", "ibra@gmail.com", "030654679", "dfg23df864hg", "1/12/18");
        //Admin adn = Admin.getInstance("ikjdfim", "ibra@gmail.com", "03456721", "hgf12");
        //admin.changePassword(1, "123");
        //admin.blockUser(2);
        DBConnection c = DBConnection.getInstance();
//        User a = c.getUser(2);
//        a.getPlaylists();
//        admin.deleteUserAccount(2);
        //System.out.println("select * from UserSubscriptions join subscriptionpackages  where UserSubscriptions.package_name = subscriptionpackages.package_name");
        
        StartPage st = new StartPage();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Ibrahim
 */
public class SubscriptionManager extends Account
{
    ArrayList<SubscriptionPackages> sub_packages = new ArrayList<SubscriptionPackages>();
    DBConnection conn = DBConnection.getInstance();

    private SubscriptionManager(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    
    // static variable single_instance of type Singleton 
    private static SubscriptionManager sub_manager = null; 
    public static SubscriptionManager getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (sub_manager == null) 
            SubscriptionManager.sub_manager = new SubscriptionManager (name, email, mobile_number, password); 
        return sub_manager; 
    } 
    ArrayList<SubscriptionPackages> getSubscriptionPackages()
    {
        return conn.getSubPackages();    
    }
    void updateUserSubscription(User u, SubscriptionPackages sp)
    {   
        int user_id = conn.getUserID(u);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 1);
        Date date = calendar.getTime();
        String date_string = new SimpleDateFormat("dd/MM/yyyy").format(date);
        Subscription subs = new Subscription(user_id, sp, date_string);
        subs.subpackage = sp;
        u.updateTheSubscription(subs);
        boolean status = conn.setUserSubscription(u, sp);
    }
    
    void gatewayPromptWithAmount(SubscriptionPackages sp)
    {
        /*I talked to Sir Amir about adding a PaymentGateway. 
        He told us to simply add a boolean return value 
        of successful payment, as integrating PayPal/Stripe 
        is beyond the scope of this course
        */
        
    }
    public ArrayList<SubscriptionPackages> BrowsePackage(User u)
    {
        ArrayList<SubscriptionPackages> subpackages = new ArrayList<SubscriptionPackages>();
        Subscription a = conn.getPastUserSubscriptions(u);
        boolean status = a.reviewCurrentStatus();
        if (status)
        {
            subpackages = conn.getSubPackages();
        }
        return subpackages;
    }
    public void subscribeUser(User u, SubscriptionPackages sp)
    {        
        this.gatewayPromptWithAmount(sp);
    }
} 


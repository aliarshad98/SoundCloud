/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Ibrahim
 */
public class Subscription 
{
    int user_id;
    SubscriptionPackages subpackage;
    String subscription_expiry; //dd/mm/yyyy

    public Subscription(int user_id, SubscriptionPackages subpackage, String subscription_expiry) {
        this.user_id = user_id;
        this.subpackage = subpackage;
        this.subscription_expiry = subscription_expiry;
    }

    public void setSubpackage(SubscriptionPackages subpackage) {
        this.subpackage = subpackage;
    }

    public void setSubscription_expiry(String subscription_expiry) {
        this.subscription_expiry = subscription_expiry;
    }
    public boolean reviewCurrentStatus() 
    {
        Date today = Calendar.getInstance().getTime();
        Date expiry = null;
        try
        {
            expiry = new SimpleDateFormat("dd/MM/yyyy").parse(this.subscription_expiry);
        }
        catch(ParseException ps)
        {
            ps.printStackTrace();
        }
        if (expiry.after(today))
        {
            return true;
        }
        return false;
    }
    
    public void updateSubscription(SubscriptionPackages sp)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());            
        calendar.add(Calendar.MONTH, 1);
        Date date = calendar.getTime();
        this.subpackage=sp;
        this.subscription_expiry = new SimpleDateFormat("dd/MM/yyyy").format(date);

    }

    public SubscriptionPackages getSubpackage() {
        return subpackage;
    }

    public String getSubscription_expiry() {
        return subscription_expiry;
    }
    
}

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
public class SubscriptionPackages 
{
    String name;
    double price;

    public SubscriptionPackages(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}

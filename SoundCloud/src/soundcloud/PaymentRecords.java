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
public class PaymentRecords 
{
    double amount;
    String expiry_date;
    
    public PaymentRecords(double amount, String expiry_date) {
        this.amount = amount;
        this.expiry_date = expiry_date;
    }
    
}

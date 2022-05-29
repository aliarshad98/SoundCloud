/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim
 */
public class Uploader extends User
{
    ArrayList<Song> songs = new ArrayList<Song>();
    ArrayList<Album> albums = new ArrayList<Album>();
    public Uploader(String name, String email, String mobile_number, String password) 
    {
        super(name, email, mobile_number, password);
    }
    
}

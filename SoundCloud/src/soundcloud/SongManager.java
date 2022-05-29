/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ibrahim
 */
public class SongManager extends Account
{
    DBConnection conn = DBConnection.getInstance();
    private SongManager(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    
    // static variable single_instance of type Singleton 
    private static SongManager song_manager = null; 
    public static SongManager getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (song_manager == null) 
            SongManager.song_manager = new SongManager (name, email, mobile_number, password); 
        return song_manager; 
    }
    public Song getSong(int songID)
    {
        return conn.retrieveSong(songID);
    }
    public void automatedSongDeletion(int songID)
    {
        conn.deleteSong(songID);
    }
    public void removeFeedback(Feedback fb)
    {
        conn.removeFeedback(fb);
    }
    public void addtoResolvedFeedback(Feedback fb)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());            
        Date date = calendar.getTime();
        String date_string = new SimpleDateFormat("dd/MM/yyyy").format(date);
        conn.addtoResolvedFeedback(fb, date_string);
    }
} 

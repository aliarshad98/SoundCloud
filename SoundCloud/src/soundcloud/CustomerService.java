/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ibrahim
 */
class CustomerService extends Account
{ 
    SongManager songmgr = SongManager.getInstance("", "", "", "");
    private CustomerService(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    // static variable single_instance of type Singleton 
    private static CustomerService customer_service = null; 
    public static CustomerService getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (customer_service == null) 
            CustomerService.customer_service = new CustomerService (name, email, mobile_number, password); 
        return customer_service; 
    } 
    public Feedback getSongFeedback(int song_id)
    {
        return conn.getFeedback(song_id);
    }
    public Song getSong(int songID)
    {
        return conn.retrieveSong(songID);
    }
    public void SongViolatesCommunityGuidelines(Feedback fb, int song_id)
    {
        Song s = this.getSong(song_id);
        songmgr.automatedSongDeletion(song_id);
        songmgr.removeFeedback(fb);
        songmgr.addtoResolvedFeedback(fb);
    }
    public void SongDoesNotViolateCommunityGuidelines(Feedback fb, int song_id)
    {
        songmgr.removeFeedback(fb);
        songmgr.addtoResolvedFeedback(fb);
    }
    public boolean reviewCopyrights(int songID)
    {
        int randomNum = ThreadLocalRandom.current().nextInt();
        if (randomNum%2==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} 


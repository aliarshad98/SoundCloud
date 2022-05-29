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
public class Feedback 
{
    int user_id;
    int feedback_id;
    int song_id;
    String feedback_date;
    String feedback;

    public Feedback(int user_id, int feedback_id, String feedback) {
        this.user_id = user_id;
        this.feedback_id = feedback_id;
        this.feedback = feedback;
    }

    public Feedback(int user_id, int feedback_id, int song_id, String feedback) {
        this.user_id = user_id;
        this.feedback_id = feedback_id;
        this.song_id = song_id;
        this.feedback = feedback;
    }

    public Feedback(int user_id, int feedback_id, int song_id, String feedback_date, String feedback) {
        this.user_id = user_id;
        this.feedback_id = feedback_id;
        this.song_id = song_id;
        this.feedback_date = feedback_date;
        this.feedback = feedback;
    }

    public int getSong_id() {
        return song_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_date(String feedback_date) {
        this.feedback_date = feedback_date;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getFeedback_date() {
        return feedback_date;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }
    
}
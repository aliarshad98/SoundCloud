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
public class PlayList 
{
    String name;
    ArrayList<Song> songslist = new ArrayList<Song>();

    public PlayList(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSong(Song s)
    {
        this.songslist.add(s);
    }
    
}

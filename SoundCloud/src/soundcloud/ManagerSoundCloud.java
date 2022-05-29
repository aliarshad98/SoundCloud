/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.util.ArrayList;

/**
 *
 * @author Afrasiyab
 */
public class ManagerSoundCloud {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private ArrayList<Album> albums = new ArrayList<Album>();
    void loadSongs()
    {
        //loadings from database
    }
    
    void addSong(Song s)
    {
        songs.add(s);
        System.out.println(s);
    }
    
    void addAlbum(Album a)
    {
        albums.add(a);
    }
    
    void addSongToAlbum(Song s,Album a)
    {
        for(int i=0;i<albums.size();i++)
        {
        }
    }
    
}

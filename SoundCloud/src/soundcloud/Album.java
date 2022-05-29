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
public class Album 
{
    ArrayList<Song> album = new ArrayList<Song>();
    private String Uploader;
    private int id = 0;
    private String Title;
    private String Singer;
    private String Genre;
    private String Description;
    private String File_name;
    private String Url;
    
    ArrayList<Song> get_album(){
        return album;
    }
    
    int get_id(){
        return id;
    }
    public Album(ArrayList<Song> album,String Uploader,String title,String singer,String genre,String file,String uploader,String desc,String url)
    {
        this.album = album;
        this.Uploader = Uploader;
        Title = title;
        Singer = singer;
        Genre = genre;
        Description = desc;
        File_name = file;
        Url = url;
        id++;
    }
    
    public Album(ArrayList<Song> album,String Uploader,String title,String singer,String genre,String file,String uploader,String url)
    {
        this.album = album;
        this.Uploader = Uploader;
        Title = title;
        Singer = singer;
        Genre = genre;
        File_name = file;
        Description = "";
        Url = url;
        id++;
    }
    
    String get_Title(){
        return Title;
    }
    
    public void add_Song(Song s)
    {
        album.add(s);
    }
    
    public String toString(){
       for (int i=0;i<album.size();i++)
       {
           System.out.println(album.get(i));
       }
        return "Title : " + Title + "\nSinger : " + Singer + "\nGenre : " + Genre + "\nFile Name : " + File_name + "\nDescription : " +Description+"\nUploader : "+Uploader+"\n Url : "+Url;
    }
}

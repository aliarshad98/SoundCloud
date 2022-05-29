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
public class Song 
{
    int song_id;
    int added_by;
    String title;
    String Singer;
    boolean premium;
    String path_to_file;
    String Genre;
    String Description;
    String File_name;
    String Uploader;
    String Url;
    int views;
    
    
    public Song(int song_id, int added_by, String title, String Singer, boolean premium, String path_to_file, String Url) {
        this.song_id = song_id;
        this.added_by = added_by;
        this.title = title;
        this.Singer = Singer;
        this.premium = premium;
        this.path_to_file = path_to_file;
        this.Url = Url;
        this.views=0;
    }

    
    public Song(int song_id, int added_by, String title, String Singer, boolean premium, String path_to_file) {
        this.song_id = song_id;
        this.added_by = added_by;
        this.title = title;
        this.Singer = Singer;
        this.premium = premium;
        this.path_to_file = path_to_file;
    }

    public String getTitle() {
        return title;
    }

    public Song(String title,String singer,String genre,String file,int uploader,String desc,String url){
        this.title = title;
        Singer = singer;
        Genre = genre;
        Description = desc;
        File_name = file;
        added_by = uploader;
        Url = url;
    }
    
    public Song(String title,String singer,String genre,String file,String uploader,String url){
        this.title = title;
        Singer = singer;
        Genre = genre;
        Description = "";
        File_name = file;
        Uploader = uploader;
        Url = url;
    }

    public int getAdded_by() {
        return added_by;
    }

    public int getSong_id() {
        return song_id;
    }

    public String getSinger() {
        return Singer;
    }

    public boolean is_premium() {
        return premium;
    }
    
    public String get_Url(){
        return Url;
    }
    public String get_Title(){
        return this.title;
    }
    
    public String get_Singer(){
        return Singer;
    }
    
    public String get_Genre(){
        return Genre;
    }
   
    public String get_Description(){
        return Description;
    }
    
    public String get_File_name(){
        return File_name;
    }
    
    public int get_id(){
        return song_id;
    }
    
    public String get_uploader(){
        return Uploader;
    }
    
    public String toString(){
        return "Title : " + this.title + "\nSinger : " + Singer + "\nGenre : " + Genre + "\nFile Name : " + File_name + "\nDescription : " +Description+"\nUploader"+Uploader+"\n Url : "+Url;
    }
    
    public Song(String file){
        this.title = "";
        Singer = "";
        Genre = "";
        Description = "";
        File_name = file;
        Uploader = "";
        Url = "";
    }
}

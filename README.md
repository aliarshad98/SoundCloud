# SoundCloud
A Java application for playing MP3 songs with simple UI. Use of Java Swing for developing GUI and JDBC for connection with Database to store and retrieve data.
# Actors
- Admin
- User
# Functionalities
## User
- Login/Registration.
- Look for Trending Songs.
- Can Access a song.
- Upload a song of own choice.
- Can edit own details.
- Can delete its account.
- Purchase subscriptions.
- Can see who he/she is following.
- Can see own followers.
- Can give feedback on a song.
## Admin
- Admin can block, delete and reset the password of the user.
- Admin can see the feedback of users on songs.
- Based on feedback, Admin can either delete the song or just resolve the issue.
# Pre-requisites
- Create Jdbc Derby Database in Netbeans and run queries.sql file to create the tables in the database.
- Create an Admin in the Admin table.
- Write the URL, user and password of database in the runCommand() function in DBConnection.java file (SoundCloud -> src -> soundcloud).
- Add Music files in Music Folder (Files should be .mp3 type).
# Run App
- Open the app in Netbeans IDE.
- To run the app, right click on 'StartPage.java' file (SoundCloud -> src -> soundcloud) and select Run File.

package LinkedListChallenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>(); // Variable para ALBUMS ARRAY

    public static void main(String[] args) {
//        Create SINGLE ALBUM
        Album album = new Album("Stormgringer", "Deep Purple");
        album.addSong("Song1", 4.6);
        album.addSong("Song2", 4.22);
        album.addSong("Song3", 4.3);
        album.addSong("Song4", 5.6);
        album.addSong("July", 8.0);
        album.addSong("KAty", 4.65);
        album.addSong("Tom", 4.0);
        album.addSong("Soldier", 6.55);
        albums.add(album); // Add it to ARRAY
//          Create SINGLE ALBUM (new Object so it won't be saved in same place in memory)
        album = new Album("Images and Words", "Dream Theater");
        album.addSong("Pull me under", 8.13);
        album.addSong("Another Day", 4.24);
        album.addSong("Take the time", 8.21);
        album.addSong("Surrounded", 5.30);
        album.addSong("Metropolis", 9.32);
        album.addSong("Under a Glass Moon", 7.03);
        album.addSong("Wait for Sleep", 2.32);
        album.addSong("Learning to live", 11.30);
        albums.add(album); // Add it to ARRAY

//        New Playlist:
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("July", playList);
        albums.get(1).addToPlayList("Surrounded", playList);
        albums.get(1).addToPlayList("Take the time", playList);
        albums.get(0).addToPlayList("KAty", playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(0).addToPlayList(2, playList);

//        play.
        play(playList);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listI = playlist.listIterator();
        if(playlist.size()== 0){
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listI.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listI.hasNext()){
                            listI.next();
                        }
                        forward = true;
                    }
                    if(listI.hasNext()){
                        System.out.println("Now playing: " + listI.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listI.hasPrevious()){
                            listI.previous();
                        }
                        forward = false;
                    }
                    if(listI.hasPrevious()){
                        System.out.println("Now playing: " +listI.previous().toString());
                    } else {
                        System.out.println("Start of Playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listI.hasPrevious()){
                            System.out.println("Replaying: " +listI.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Start of list");
                        }
                    } else {
                        if(listI.hasNext()){
                            System.out.println("Replaying: " +listI.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of list");
                        }
                    }


                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Actions:\n");
        System.out.println("0- Quit\n" + "1- Play Next\n" + "2- Play Prev\n" + "3- Replay\n" + "4- List\n"+ "5- Actions\n");
    }
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("******");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****");
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "DeepPurple");
        album.addSong("Stormbtinger", 4.6);
        album.addSong("Love don't mean a thing", 4.2);
        album.addSong("Holy man", 4.5);
        album.addSong("Hold on", 4.7);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("you can't do it right", 4.9);
        album.addSong("High bal shooter", 4.4);
        album.addSong("The gypsy", 4.3);
        album.addSong("soulder of fortune", 4.1);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 4.8);
        album.addSong("I put the finger on you", 4.9);
        album.addSong("Lets go", 4.6);
        album.addSong("Inject the venom", 4.7);
        album.addSong("Snowballed", 4.5);
        album.addSong("Evil walks", 4.4);
        album.addSong("C.O.D", 4.3);
        album.addSong("Breaking the rules", 4.2);
        album.addSong("Night of the long knives", 4.1);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("you can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);              //doesn't exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);                  //There is not a track

        play(playList);

    }

    public static void play(LinkedList<Song> playList) {

        System.out.println("");
        boolean quit = false;
        boolean forward = true;
        ListIterator listIterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);
        Song song;

        if (playList.size() == 0) {
            System.out.println("The play list is empty");
            return;
        }else {
            song = (Song) listIterator.next();
            System.out.println("Now playing " + song.getTitle());
        }


        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {

                case 0:
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        listIterator.next();
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        song = (Song) listIterator.next();
                        System.out.println("Now playing " + song.getTitle());
                    }else {
                        System.out.println("There is no more songs");
                    }
                    break;
                case 2:
                    if (forward) {
                        listIterator.previous();
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        song = (Song) listIterator.previous();
                        System.out.println("Now playing " + song.getTitle());
                    }else {
                        System.out.println("This is the first song");
                    }
                    break;
            }
        }


    }
}

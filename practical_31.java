import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        // Create LinkedList for playlist
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist after adding songs:");
        displayPlaylist(playlist);

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        displayPlaylist(playlist);

        // 3. Play first song (remove from front)
        if (!playlist.isEmpty()) {
            String playedSong = playlist.removeFirst();
            System.out.println("\nNow Playing: " + playedSong);
        }

        System.out.println("Playlist after playing first song:");
        displayPlaylist(playlist);

        // 4. Skip last song (remove from end)
        if (!playlist.isEmpty()) {
            String skippedSong = playlist.removeLast();
            System.out.println("\nSkipped Song: " + skippedSong);
        }

        System.out.println("Playlist after skipping last song:");
        displayPlaylist(playlist);
    }

    // Method to display playlist
    public static void displayPlaylist(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}

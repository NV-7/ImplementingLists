public class Song {

    private String song;
    private String artist;
    private double length;

    public Song(String artist, String song, double length){

        this.artist = artist;
        this.song = song;
        this.length = length;

    }

    public String getSong() {
        return song;
    }

    public double getLength() {
        return length;
    }

    public String getArtist() {
        return artist;
    }

    public String toString(){
        return "Artist: " + getArtist() + ", Song Name: " + getSong() + ", Length: " + getLength();
    }
}

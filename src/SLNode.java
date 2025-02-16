public class SLNode{

    private Song song;
    private SLNode nextNode;



    public SLNode(){
        song = null;
        nextNode = null;
    }

    public void setNextNode(SLNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public SLNode getNextNode() {
        return nextNode;
    }

    public Song getSong() {
        return song;
    }
}

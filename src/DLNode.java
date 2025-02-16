public class DLNode {

    private Song song;
    private DLNode next;
    private DLNode prev;


        public DLNode(){
            song = null;
            next = null;
            prev = null;
        }

        public void setNextNode(DLNode nextNode) {
            this.next = nextNode;
        }
        public void setPrev(DLNode prevNode){
            this.prev = prevNode;
        }

        public void setSong(Song song) {
            this.song = song;
        }

        public DLNode getNext() {
            return next;
        }

        public Song getSong() {
            return song;
        }

        public DLNode getPrev() {
        return prev;
        }
}






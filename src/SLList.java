public class SLList {

    private SLNode head;


    public SLList(){
        this.head = null;
    }

    public void addy(Song song) {
        SLNode newNode = new SLNode();
        newNode.setSong(song);
        SLNode currNode;

        if (head == null) {
            head = newNode;
        }
        else{
            currNode = head;
            while(currNode.getNextNode() != null){
                currNode = currNode.getNextNode();
            }
            currNode.setNextNode(newNode);
        }
    }

    public void removy(int pos) {
        if(pos == 0){
            head = head.getNextNode();
        }
        SLNode curNode = head;
        SLNode prevNode = curNode;
        int i = 0;
        while (i < pos) {
            prevNode = curNode;
            curNode = curNode.getNextNode();
            i++;
        }
        prevNode.setNextNode(curNode.getNextNode());
    }

    public String stringToString(){
        String ret = "";
        SLNode currNode = head;
        while(currNode != null){
             ret = ret + currNode.getSong().toString() + "\n";
             currNode = currNode.getNextNode();
        }

        return ret;

    }

    public Song getheadSong(){
        return head.getSong();
    }

    public SLNode getHead() {
        return head;
    }
}

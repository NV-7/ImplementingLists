public class DLList {

    private DLNode head;

    public DLList(){
        this.head = null;
    }

    public String stringToString(){

        String res = "";
        DLNode curNode = head;

        while(curNode != null){
            res = res + curNode.getSong().toString() + "\n";
            curNode = curNode.getNext();
        }

        return res;
    }

    public void addy(Song song){

        DLNode newNode = new DLNode();
        DLNode preNode = new DLNode();

        newNode.setSong(song);
        if(head == null){
            head = newNode;
        }else {
            DLNode curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNextNode(newNode);
            newNode.setPrev(curNode);
        }
    }

    public void removy(int pos){
        if(pos == 0){
            head = head.getNext();
        }
        DLNode curNode = head;
        DLNode prevNode;
        int i = 0;
        while(i < pos){
            curNode = curNode.getNext();
            i++;
        }
        prevNode = curNode.getPrev();
        if(curNode.getNext() == null){
            prevNode.setNextNode(null);
        }
        else{
            prevNode.setNextNode(curNode.getNext());
            curNode = curNode.getNext();
            curNode.setPrev(prevNode);
        }

    }
}

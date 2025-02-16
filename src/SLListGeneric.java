public class SLListGeneric<T> {

    private SLNodeGeneric head;


    public SLListGeneric(){
        this.head = null;
    }

    public void addy(T obj) {
        SLNodeGeneric newNode = new SLNodeGeneric();
        newNode.setSong(obj);
        SLNodeGeneric currNode;

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
        SLNodeGeneric curNode = head;
        SLNodeGeneric prevNode = curNode;
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
        SLNodeGeneric currNode = head;
        while(currNode != null){
            ret = ret + currNode.getObj() + "\n";
            currNode = currNode.getNextNode();
        }

        return ret;

    }

    public SLNodeGeneric getHead() {
        return head;
    }
}

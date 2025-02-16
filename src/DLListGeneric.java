public class DLListGeneric<T> {

    private DLNodeGeneric head;

    public DLListGeneric(){
        this.head = null;
    }

    public String stringToString(){

        String res = "";
        DLNodeGeneric curNode = head;

        while(curNode != null){
            res = res + curNode.getObj() + "\n";
            curNode = curNode.getNext();
        }

        return res;
    }

    public void addy(T obj){

        DLNodeGeneric newNode = new DLNodeGeneric();
        DLNodeGeneric preNode = new DLNodeGeneric();

        newNode.setObj(obj);
        if(head == null){
            head = newNode;
        }else {
            DLNodeGeneric curNode = head;
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
        DLNodeGeneric curNode = head;
        DLNodeGeneric prevNode;
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

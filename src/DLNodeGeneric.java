public class DLNodeGeneric<T> {

    private T obj;
    private DLNodeGeneric next;
    private DLNodeGeneric prev;


    public DLNodeGeneric(){
        next = null;
        prev = null;
        obj = null;
    }

    public void setNextNode(DLNodeGeneric nextNode) {
        this.next = nextNode;
    }
    public void setPrev(DLNodeGeneric prevNode){
        this.prev = prevNode;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public DLNodeGeneric getNext() {
        return next;
    }

    public T getObj() {
        return obj;
    }

    public DLNodeGeneric getPrev() {
        return prev;
    }
}






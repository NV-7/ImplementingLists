public class SLNodeGeneric<T>{


    private T obj;
    private SLNodeGeneric nextNode;



    public SLNodeGeneric(){
        obj = null;
        nextNode = null;
    }

    public void setNextNode(SLNodeGeneric nextNode) {
        this.nextNode = nextNode;
    }

    public void setSong(T obj) {
        this.obj = obj;
    }

    public SLNodeGeneric getNextNode() {
        return nextNode;
    }

    public T getObj() {
        return obj;
    }
}

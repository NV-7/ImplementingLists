public class AListGeneric<T> {

    private int maxSize;
    private int currSize;
    T[] aList;

    public AListGeneric() {
        maxSize = 0;
        currSize = 0;
        aList = (T[]) new Object[maxSize];
    }

    public AListGeneric(int size){
        this.maxSize = size;
        currSize = 0;
        aList = (T[]) new Object[size];
    }

    public void addy(T obj){

        if(currSize == maxSize ){
            maxSize = maxSize * 2;
        }
        if(maxSize == 0){
            maxSize++;
        }

        T[] newAlist =  (T[]) new Object[maxSize];
        for(int i = 0; i < aList.length; i++){
            newAlist[i] = aList[i];
        }
        aList  = newAlist;
        aList[currSize] = obj;
        currSize++;
    }

    public T access(int index){
        return aList[index];
    }

    public void remove(int pos){

        for(int i = pos; i < currSize - 1; i++){
            aList[i] = aList[i + 1];
        }
        currSize--;
        aList[currSize] = null;
    }

    public String stringToString(){

        String list = "";

        for(int i = 0; i < currSize; i++){

            list = list + aList[i].toString() +  "\n";

        }
        return list;
    }

    public int getCurrSize() {
        return currSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public T[] getaList() {
        return aList;
    }
}


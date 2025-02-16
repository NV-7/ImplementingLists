public class AList {

    private int maxSize;
    private int currSize;
    Song[] aList;

    public AList() {
        maxSize = 0;
        currSize = 0;
         aList = new Song[maxSize];
    }

    public AList(int size){
        this.maxSize = size;
        currSize = 0;
        aList = new Song[size];
    }

    public void addy(Song song){

        if(currSize == maxSize ){
            maxSize = maxSize * 2;
        }
        if(maxSize == 0){
            maxSize++;
        }

        Song[] newAlist = new Song[maxSize];
        for(int i = 0; i < aList.length; i++){
            newAlist[i] = aList[i];
        }
        aList  = newAlist;
        aList[currSize] = song;
        currSize++;
    }

    public Song access(int index){
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

        String songsList = "";

        for(int i = 0; i < currSize; i++){

            songsList = songsList + aList[i].getArtist() + " " + aList[i].getSong() + " " + aList[i].getLength() + "\n";

        }
        return songsList;
    }

    public int getCurrSize() {
        return currSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Song[] getaList() {
        return aList;
    }
}


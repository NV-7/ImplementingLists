public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Keigo Hoashi", "Song of the Ancients - Fate", 5.18);
        Song song2 = new Song("Keigo Hoashi", "Grandma & Destruction", 6.43);
        Song song3 = new Song("Nobuo Uematsu", "One Winged Angel", 10.20);
        Song song4 = new Song("Lola Amour", "Raining In Manila", 4.51);

        String[] colors = {"red", "purple", "lilac"};

       AList aList = new AList();
        aList.addy(song1);
        aList.addy(song3);
        aList.addy(song4);
        System.out.println(aList.stringToString());
        aList.remove(2);
        System.out.println(aList.stringToString());

        AListGeneric aListG = new AListGeneric();
        aListG.addy(song1);
        aListG.addy(song2);
        aListG.addy(song3);
        System.out.println(aListG.stringToString());
        aListG.remove(1);
        System.out.println(aListG.stringToString());

        SLList sList = new SLList();
        sList.addy(song1);
        sList.addy(song2);
        sList.addy(song3);
        System.out.println(sList.stringToString());
        sList.removy(1);
        System.out.println(sList.stringToString());


        DLList dlList = new DLList();
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.removy(2);
        System.out.println(dlList.stringToString());

        SLListGeneric dlListG = new SLListGeneric();
        dlListG.addy(colors[1]);
        dlListG.addy(colors[0]);
        dlListG.addy(colors[2]);
        System.out.println(dlListG.stringToString());
        dlListG.removy(2);
        System.out.println(dlListG.stringToString());







    }
}
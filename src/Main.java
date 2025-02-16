public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Keigo Hoashi", "Song of the Ancients - Fate", 5.18);
        Song song2 = new Song("Keigo Hoashi", "Grandma & Destruction", 6.43);
        Song song3 = new Song("Nobuo Uematsu", "One Winged Angel", 10.20);
        Song song4 = new Song("Lola Amour", "Raining In Manila", 4.51);

        String[] colors = {"red", "purple", "lilac"};

        System.out.println("Array implementation of a List");
       AList aList = new AList();
        aList.addy(song1);
        aList.addy(song3);
        aList.addy(song4);
        System.out.println(aList.stringToString());
        aList.remove(2);
        System.out.println(aList.stringToString());

     System.out.println("Array implementation of a List using generic types");
     AListGeneric aListG = new AListGeneric();
     aListG.addy(song1);
     aListG.addy(song2);
     aListG.addy(song3);
     System.out.println(aListG.stringToString());
     aListG.remove(1);
     System.out.println(aListG.stringToString());


     AListGeneric aListColors = new AListGeneric();
     aListColors.addy(colors[0]);
     aListColors.addy(colors[1]);
     aListColors.addy(colors[2]);
     System.out.println(aListColors.stringToString());
     aListColors.remove(2);
     System.out.println(aListColors.stringToString());

     System.out.println("Single linked list implementation");
     SLList sList = new SLList();
     sList.addy(song1);
     sList.addy(song2);
     sList.addy(song3);
     System.out.println(sList.stringToString());
     sList.removy(1);
     System.out.println(sList.stringToString());

     System.out.println("Single Linked list implementation using Generic Types");

     SLList sListG = new SLList();
     sListG.addy(song1);
     sListG.addy(song2);
     sListG.addy(song3);
     System.out.println(sListG.stringToString());
     sListG.removy(1);
     System.out.println(sListG.stringToString());

     SLListGeneric sListColors = new SLListGeneric();
     sListColors.addy(colors[0]);
     sListColors.addy(colors[1]);
     sListColors.addy(colors[2]);
     System.out.println(sListColors.stringToString());
     sListColors.removy(1);
     System.out.println(sListColors.stringToString());

     System.out.println("Double Linked List implementation");
     DLList dlList = new DLList();
     dlList.addy(song1);
     dlList.addy(song2);
     dlList.addy(song3);
     dlList.removy(2);
     System.out.println(dlList.stringToString());

     System.out.println("Double linked list implementation using Generic Types");
       SLListGeneric dlListG = new SLListGeneric();
       dlListG.addy(song1);
       dlListG.addy(song2);
       dlListG.addy(song3);
       System.out.println(dlListG.stringToString());
       dlListG.removy(2);
       System.out.println(dlListG.stringToString());


        SLListGeneric dlListColors = new SLListGeneric();
        dlListColors.addy(colors[0]);
        dlListColors.addy(colors[1]);
        dlListColors.addy(colors[2]);
        System.out.println(dlListColors.stringToString());
        dlListColors.removy(2);
        System.out.println(dlListColors.stringToString());







    }
}
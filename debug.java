public class debug {
    public static void main(String[] args) {
        PlayList myList = new PlayList(10);

        // Creates some tracks
        Track track1 = new Track("Fernando", "ABBA", 354);
        Track track2 = new Track("Imagine", "John Lennon", 187);
        Track track3 = new Track("Creep", "Radiohead", 369);
        Track track4 = new Track("Thriller", "Michael Jackson", 222);
        Track track5 = new Track("Yesterday", "The Beatles", 125);

        // Adds the tracks to the List
        System.out.println("Adding tracks...");
        myList.add(track1);
        myList.add(track2);
        myList.add(track3);
        myList.add(track4);

        System.out.println(myList.toString());
        myList.sortedInPlace();
        System.out.println(myList.toString());

    }
}

/**
 * Класс работает с записями в блокнот
 */
public class Notepad {

    public static void main(String[] args) {
        NotepadEntry n1 = new NotepadEntry();

        n1.addEntry("1 entry");
        n1.addEntry("2 entry");
        n1.addEntry("3 entry");
        n1.addEntry("4 entry");
        n1.addEntry("5 entry");
        n1.addEntry("6 entry");
        n1.addEntry("7 entry");
        n1.addEntry("8 entry");
        n1.addEntry("9 entry");
        n1.addEntry("10 entry");


        n1.editEntry(2, "1654984984");
        n1.viewAllEntries();
    }

}


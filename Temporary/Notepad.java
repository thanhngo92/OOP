import java.util.ArrayList;

public class Notepad {
    private ArrayList<String> notes = new ArrayList<>();

    public void addNote(String note) {
        notes.add(note);
    }

    public void printNotes() {
        System.out.println("Notes:");
        for (String note : notes) {
            System.out.println("- " + note);
        }
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote("First note");
        notepad.addNote("Second note");
        notepad.printNotes();
    }
}
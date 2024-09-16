import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();
        characterList.add(new Jedi("Obi-Wan Kenobi", 35));
        characterList.add(new Sith("Palpatine", 304));
        characterList.add(new Droid("C3PO", 20));
        characterList.add(new Jedi("Yoda", 3000));

        // Kør alle karakterene igennem. Hvis karakteren er en jedi, beskriver vi også at han burde vinde.
        for (Character c : characterList) {
            c.showInfo();
            c.action();

            if (c instanceof Jedi) {
                System.out.println(STR."\{c.name} should win, since he's a jedi");
            }
        }
    }
}


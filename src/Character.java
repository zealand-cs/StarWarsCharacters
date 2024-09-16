public class Character {
    // Star Wars karakterens navn
    protected String name;
    protected int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // En function til at overskrive i nedarvede klasser.
    protected void action() {}

    // En function til print al generel info om en karakter ud.
    public final void showInfo() {
        System.out.println(name + " is " + age + " years old");
    }
}


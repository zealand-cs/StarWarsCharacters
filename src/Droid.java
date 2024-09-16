public class Droid extends Character {
    public Droid(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println(STR."\{super.name} hopefully doesn't use The Force, since it's a droid...");
    }
}

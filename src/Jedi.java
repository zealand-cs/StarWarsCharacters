public class Jedi extends Character {
    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println(STR."\{super.name} uses The Force for good");
    }
}


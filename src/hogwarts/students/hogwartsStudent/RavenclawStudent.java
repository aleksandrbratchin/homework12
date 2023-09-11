package hogwarts.students.hogwartsStudent;

public class RavenclawStudent extends HogwartsStudent {

    private final String title = "Когтевран";
    @Override
    String getTitle() {
        return title;
    }
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public RavenclawStudent(String name, String surname, int magicalPower, int transgressionRange, int mind, int wisdom, int wit, int creation) {
        super(name, surname, magicalPower, transgressionRange);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tСвойства факультета " + title + ": \n" +
                "\t\tУм: " + mind + "\n" +
                "\t\tМудрость: " + wisdom + "\n" +
                "\t\tОстроумие: " + wit + "\n" +
                "\t\tТворчество: " + creation + "\n";
    }
}

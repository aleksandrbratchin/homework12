package hogwarts.students.hogwartsStudent;

public class Ravenclaw extends Hogwarts {

    private final String title = "Когтевран";

    @Override
    String getTitle() {
        return title;
    }

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, String surname, int magicalPower, int transgressionRange, int mind, int wisdom, int wit, int creation) {
        super(name, surname, magicalPower, transgressionRange);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
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

    @Override
    public String compareByFacultyProperties(Hogwarts hogwarts) {
        if (hogwarts instanceof Ravenclaw ravenclaw) {
            return (mind + wisdom + wit + creation) > (ravenclaw.getMind() + ravenclaw.getCreation() + ravenclaw.getWit() + ravenclaw.getWisdom()) ?
                    getFullName() + " лучший " + title + "ец чем " + ravenclaw.getFullName() :
                    getFullName() + " хуже " + title + "ец чем " + ravenclaw.getFullName();
        }
        return getErrorMessage(hogwarts);
    }
}

package hogwarts.students.hogwartsStudent;

public class Gryffindor extends Hogwarts {

    private final String title = "Гриффиндор";

    @Override
    String getTitle() {
        return title;
    }

    private final int nobility;

    private final int honor;

    private final int bravery;


    public Gryffindor(String name, String surname, int magicalPower, int transgressionRange, int nobility, int honor, int bravery) {
        super(name, surname, magicalPower, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tСвойства факультета " + title + ": \n" +
                "\t\tБлагородство: " + nobility + "\n" +
                "\t\tЧесть: " + honor + "\n" +
                "\t\tХрабрость: " + bravery + "\n";
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String compareByFacultyProperties(Hogwarts hogwarts) {
        if (hogwarts instanceof Gryffindor gryffindor) {
            return (nobility + honor + bravery) > (gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery()) ?
                    getFullName() + " лучший " + title + "ец чем " + gryffindor.getFullName() :
                    getFullName() + " хуже " + title + "ец чем " + gryffindor.getFullName();
        }
        return getErrorMessage(hogwarts);
    }

}

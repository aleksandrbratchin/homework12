package hogwarts.students.hogwartsStudent;

public class GryffindorStudent extends HogwartsStudent {

    private final String title = "Гриффиндор";
    @Override
    String getTitle() {
        return title;
    }

    private final int nobility;

    private final int honor;

    private final int bravery;



    public GryffindorStudent(String name, String surname, int magicalPower, int transgressionRange, int nobility, int honor, int bravery) {
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
    public String compareByFacultyProperties(HogwartsStudent hogwartsStudent) {
        if (hogwartsStudent instanceof GryffindorStudent gryffindorStudent) {
            return (nobility + honor + bravery) > (gryffindorStudent.getNobility() + gryffindorStudent.getHonor() + gryffindorStudent.getBravery())?
                    getFullName() + " лучший " + title + "ец чем " + gryffindorStudent.getFullName() :
                    getFullName() + " хуже " + title + "ец чем " + gryffindorStudent.getFullName();
        }
        return "Нелязя сравнить студетнов из разных факультетов";

    }

}

package hogwarts.students.hogwartsStudent;

import hogwarts.students.Student;

public abstract class Hogwarts extends Student {
    private final int magicalPower;
    private final int transgressionRange;

    public Hogwarts(String name, String surname, int magicalPower, int transgressionRange) {
        super(name, surname);
        this.magicalPower = magicalPower;
        this.transgressionRange = transgressionRange;
    }

    abstract String getTitle();

    @Override
    public String toString() {
        return super.toString() +
                "\tОсновные свойства: \n" +
                "\t\tСила магии: " + magicalPower + "\n" +
                "\t\tТрансгрессия: " + transgressionRange + "\n";
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public String compareByHogwartsProperties(Hogwarts hogwarts) {
        return (magicalPower + transgressionRange) > (hogwarts.getMagicalPower() + hogwarts.getTransgressionRange()) ?
                getFullName() + " обладает большей мощностью магии чем " + hogwarts.getFullName() :
                getFullName() + " обладает меньшей мощностью магии чем " + hogwarts.getFullName();
    }

    public abstract String compareByFacultyProperties(Hogwarts hogwarts);

    protected String getErrorMessage(Hogwarts hogwarts) {
        return "Нельзя сравнить студетнов из разных факультетов. " +
                getFullName() + " - " + getTitle() + "ец, a " + hogwarts.getFullName() + " - " + hogwarts.getTitle() + "ец";
    }

}

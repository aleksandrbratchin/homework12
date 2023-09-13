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

    public String compare(Hogwarts hogwarts) {
        return (magicalPower + transgressionRange) > (hogwarts.getMagicalPower() + hogwarts.getTransgressionRange()) ?
                getFullName() + " обладает большей мощностью магии чем " + hogwarts.getFullName() :
                getFullName() + " обладает меньшей мощностью магии чем " + hogwarts.getFullName();
    }

}

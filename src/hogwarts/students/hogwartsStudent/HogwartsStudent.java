package hogwarts.students.hogwartsStudent;

import hogwarts.students.Student;

public abstract class HogwartsStudent extends Student {
    private int magicalPower;
    private int transgressionRange;

    public HogwartsStudent(String name, String surname, int magicalPower, int transgressionRange) {
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

    public String compareByHogwartsProperties(HogwartsStudent hogwartsStudent){
        return (magicalPower + transgressionRange) > (hogwartsStudent.getMagicalPower() + hogwartsStudent.getTransgressionRange())?
                getFullName() + " обладает большей мощностью магии чем " + hogwartsStudent.getFullName() :
                getFullName() + " обладает меньшей мощностью магии чем " + hogwartsStudent.getFullName();
    }

    public abstract String compareByFacultyProperties(HogwartsStudent hogwartsStudent);

}

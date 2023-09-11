package hogwarts.students;

public abstract class Student {
    private final String name;
    private final String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }


    @Override
    public String toString() {
        return getFullName() + "\n";
    }
}

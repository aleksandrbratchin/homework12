package hogwarts.students.hogwartsStudent;

public class SlytherinStudent extends HogwartsStudent {
    private final String title = "Слизерин";
    @Override
    String getTitle() {
        return title;
    }
    private int cunning;
    private int determination;
    private int lustForPower;
    private int resourcefulness;
    private int ambition;

    public SlytherinStudent(String name, String surname, int magicalPower, int transgressionRange, int cunning, int determination, int lustForPower, int resourcefulness, int ambition) {
        super(name, surname, magicalPower, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.lustForPower = lustForPower;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tСвойства факультета " + title + ": \n" +
                "\t\tХитрость: " + cunning + "\n" +
                "\t\tРешительность: " + determination + "\n" +
                "\t\tЖажда власти: " + lustForPower + "\n" +
                "\t\tНаходчивость: " + resourcefulness + "\n" +
                "\t\tАмбициозность: " + ambition + "\n";
    }
}

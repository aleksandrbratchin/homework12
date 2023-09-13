package hogwarts.students.hogwartsStudent;

public class Slytherin extends Hogwarts {
    private final String title = "Слизерин";

    @Override
    String getTitle() {
        return title;
    }

    private final int cunning;
    private final int determination;
    private final int lustForPower;
    private final int resourcefulness;
    private final int ambition;

    public Slytherin(String name, String surname, int magicalPower, int transgressionRange, int cunning, int determination, int lustForPower, int resourcefulness, int ambition) {
        super(name, surname, magicalPower, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.lustForPower = lustForPower;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAmbition() {
        return ambition;
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

    public String compare(Slytherin slytherin) {
        return (cunning + determination + lustForPower + resourcefulness + ambition) >
                (slytherin.getCunning() + slytherin.getDetermination() + slytherin.getLustForPower() + slytherin.getAmbition() + slytherin.getResourcefulness()) ?
                getFullName() + " лучший " + title + "ец чем " + slytherin.getFullName() :
                getFullName() + " хуже " + title + "ец чем " + slytherin.getFullName();
    }

}

package hogwarts.students.hogwartsStudent;

public class Hufflepuff extends Hogwarts {

    private final String title = "Пуффендуй";

    @Override
    String getTitle() {
        return title;
    }

    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String surname, int magicalPower, int transgressionRange, int hardWork, int loyalty, int honesty) {
        super(name, surname, magicalPower, transgressionRange);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tСвойства факультета " + title + ": \n" +
                "\t\tТрудолюбие: " + hardWork + "\n" +
                "\t\tВерность: " + loyalty + "\n" +
                "\t\tЧестность: " + honesty + "\n";
    }

    public String compare(Hufflepuff hufflepuff) {
        return (hardWork + loyalty + honesty) > (hufflepuff.getHonesty() + hufflepuff.getHardWork() + hufflepuff.getLoyalty()) ?
                getFullName() + " лучший " + title + "ец чем " + hufflepuff.getFullName() :
                getFullName() + " хуже " + title + "ец чем " + hufflepuff.getFullName();
    }

}

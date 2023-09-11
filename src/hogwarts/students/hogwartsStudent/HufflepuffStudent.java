package hogwarts.students.hogwartsStudent;

public class HufflepuffStudent extends HogwartsStudent {

    private final String title = "Пуффендуй";
    @Override
    String getTitle() {
        return title;
    }
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String name, String surname, int magicalPower, int transgressionRange, int hardWork, int loyalty, int honesty) {
        super(name, surname, magicalPower, transgressionRange);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tСвойства факультета " + title + ": \n" +
                "\t\tТрудолюбие: " + hardWork + "\n" +
                "\t\tВерность: " + loyalty + "\n" +
                "\t\tЧестность: " + honesty + "\n";
    }

}

import hogwarts.students.hogwartsStudent.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри", "Поттер", rand(), rand(), rand(), rand(), rand()),
                new Gryffindor("Гермиона", "Грейнджер", rand(), rand(), rand(), rand(), rand()),
                new Gryffindor("Рон", "Уизли", rand(), rand(), rand(), rand(), rand()),
                new Slytherin("Драко", "Малфой", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new Slytherin("Грэхэм", "Монтегю", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new Slytherin("Грегори", "Гойл", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new Hufflepuff("Захария", "Смит", rand(), rand(), rand(), rand(), rand()),
                new Hufflepuff("Седрик", "Диггори", rand(), rand(), rand(), rand(), rand()),
                new Hufflepuff("Джастин", "Финч-Флетчли", rand(), rand(), rand(), rand(), rand()),
                new Ravenclaw("Чжоу", "Чанг", rand(), rand(), rand(), rand(), rand(), rand()),
                new Ravenclaw("Падма", "Патил", rand(), rand(), rand(), rand(), rand(), rand()),
                new Ravenclaw("Маркус", "Белби", rand(), rand(), rand(), rand(), rand(), rand())
        };

        System.out.println("Вывод всех учеников Хогвартса\n");
        for (Hogwarts gryffindorStudent : hogwarts) {
            System.out.println(gryffindorStudent);
        }

        System.out.println("Сравнение учеников из одного факультета по параметрам факультета\n");

        System.out.println(((Gryffindor) hogwarts[0]).compare((Gryffindor) hogwarts[1]));
        System.out.println(((Slytherin) hogwarts[3]).compare((Slytherin) hogwarts[5]));
        System.out.println(((Hufflepuff) hogwarts[6]).compare((Hufflepuff) hogwarts[8]));
        System.out.println(((Ravenclaw) hogwarts[9]).compare((Ravenclaw) hogwarts[11]));

        System.out.println();
        System.out.println("Сравнение учеников из разных факультетов\n");
        System.out.println(hogwarts[0].compare(hogwarts[hogwarts.length - 1]));

        System.out.println();
        System.out.println("Сравнение учеников по общим параметрам\n");
        System.out.println(hogwarts[hogwarts.length - 1].compare(hogwarts[rand(hogwarts.length - 1)]));
    }

    private static int rand() {
        return rand(101);
    }

    private static int rand(int max) {
        return new Random().nextInt(max);
    }

}
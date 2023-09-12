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
        System.out.println(hogwarts[0].compareByFacultyProperties(hogwarts[1]));
        System.out.println(hogwarts[3].compareByFacultyProperties(hogwarts[5]));
        System.out.println(hogwarts[6].compareByFacultyProperties(hogwarts[8]));
        System.out.println(hogwarts[9].compareByFacultyProperties(hogwarts[11]));

        System.out.println();
        System.out.println("Сравнение учеников из разных факультетов по параметрам факультета\n");
        System.out.println(hogwarts[0].compareByFacultyProperties(hogwarts[hogwarts.length - 1]));

        System.out.println();
        System.out.println("Сравнение учеников по общим параметрам\n");
        System.out.println(hogwarts[hogwarts.length - 1].compareByHogwartsProperties(hogwarts[rand(hogwarts.length - 1)]));
    }

    private static int rand() {
        return rand(101);
    }

    private static int rand(int max) {
        return new Random().nextInt(max);
    }

}
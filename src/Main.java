import hogwarts.students.hogwartsStudent.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent[] hogwartsStudents = {
                new GryffindorStudent("Гарри", "Поттер", rand(), rand(), rand(), rand(), rand()),
                new GryffindorStudent("Гермиона", "Грейнджер", rand(), rand(), rand(), rand(), rand()),
                new GryffindorStudent("Рон", "Уизли", rand(), rand(), rand(), rand(), rand()),
                new SlytherinStudent("Драко", "Малфой", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new SlytherinStudent("Грэхэм", "Монтегю", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new SlytherinStudent("Грегори", "Гойл", rand(), rand(), rand(), rand(), rand(), rand(), rand()),
                new HufflepuffStudent("Захария", "Смит", rand(), rand(), rand(), rand(), rand()),
                new HufflepuffStudent("Седрик", "Диггори", rand(), rand(), rand(), rand(), rand()),
                new HufflepuffStudent("Джастин", "Финч-Флетчли", rand(), rand(), rand(), rand(), rand()),
                new RavenclawStudent("Чжоу", "Чанг", rand(), rand(), rand(), rand(), rand(), rand()),
                new RavenclawStudent("Падма", "Патил", rand(), rand(), rand(), rand(), rand(), rand()),
                new RavenclawStudent("Маркус", "Белби", rand(), rand(), rand(), rand(), rand(), rand())
        };
        for (HogwartsStudent gryffindorStudent : hogwartsStudents) {
            System.out.println(gryffindorStudent);
        }

    }

    public static int rand(){
        return new Random().nextInt(100);
    }
}
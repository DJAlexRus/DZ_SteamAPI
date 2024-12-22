import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1:");
        char b='М';
        Stream<String> products= Stream.of("Хлеб","Молоко","Сыр","Масло","Конфеты");
            products = products.filter(s -> s.charAt(0)==b);
            long countProduct = products.count();
            System.out.println("Продуктов на букву '" + b + "':" +countProduct+ "шт.");

        //Задание №2
        System.out.println('\n'+"Задание №2:");
        Stream<Person> personStream = Stream.of(
                new Person("Иван",  45),
                new Person("Петр",  23),
                new Person("Александр",  28),
                new Person("Сергей",  33),
                new Person("Коля",  25),
                new Person("Дима",  23),
                new Person("Александр",  55),
                new Person("Вася",  33),
                new Person("Толя",  40),
                new Person("Маша",  29),
                new Person("Даша",  21),
                new Person("Алексей",  38)
        );
        System.out.println("Список людей с возрастом более 30лет:");
        personStream
                .filter(ages -> ages.age >30)
                .forEach(System.out::println);


    }
}
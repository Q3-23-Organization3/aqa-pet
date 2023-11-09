package homework11.user;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Valeriia", "Shyshko", 28);
        User user2 = new User("Elaine", "Benes", 30);
        User user3 = new User("Jennifer", "Aniston", 54);
        User user4 = new User("Larry", "David", 76);
        User user5 = new User("Kris", "Jenner", 68);
        User user6 = new User("Beyonce", "Knowles", 8);
        User user7 = new User("Jerry", "Seinfeld", 40);
        User user8 = new User("Tony", "Soprano", 13);
        User user9 = new User("Saul", "Goodman", 45);
        User user10 = new User("Elaine", "Smith", 10);

        System.out.println("Sorted by age:");
        Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);
        System.out.println();

        double averageAge = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age of the users: " + averageAge);
        System.out.println();

        System.out.println("Users sorted by first name and age: ");
        Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
                .sorted(Comparator.comparing(User::getFirstName).thenComparingInt(User::getAge))
                .toList()
                .forEach(System.out::println);
        System.out.println();

        boolean secondNameStartsWithSOrA = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
                .anyMatch(user -> user.getSecondName().startsWith("A") || user.getSecondName().startsWith("S"));
        System.out.println("The list has users with the last name that starts with `A` or `S`: " + secondNameStartsWithSOrA);
        System.out.println();

        boolean allUsersAdults = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
                .allMatch(user -> user.getAge() > 18);
        System.out.println("All users over 18 years old: " + allUsersAdults);
    }
}
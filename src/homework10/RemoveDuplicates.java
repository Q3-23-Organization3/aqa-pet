package homework10;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> mainList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(-20, 20);
            mainList.add(number);
        }

        System.out.println("Original list of numbers: " + mainList);

        Set<Integer> duplicatesRemoved = new HashSet<>(mainList);
        System.out.println("List with unique numbers: " + duplicatesRemoved);

        System.out.println("Duplicated removed: " + (mainList.size() - duplicatesRemoved.size()));

    }
}

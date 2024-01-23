package homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);
        originalList.add(4);
        originalList.add(2);
        originalList.add(8);
        originalList.add(9);
        originalList.add(1);
        originalList.add(6);
        int x = 4;

        sortedList(originalList, x);

        System.out.println("Sorted List: " + originalList);
    }

    public static void sortedList(List<Integer> list, int X) {
        List<Integer> lessThanX = new ArrayList<>();
        List<Integer> greaterThanX = new ArrayList<>();

        for (Integer num : list) {
            if (num < X) {
                lessThanX.add(num);
            } else {
                greaterThanX.add(num);
            }
        }

        list.clear();
        list.addAll(lessThanX);
        list.addAll(greaterThanX);

        list.sort(Comparator.naturalOrder());
    }
}

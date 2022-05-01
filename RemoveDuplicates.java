//The time complexity for the following approach would be O(n^2) as it has nested for-loops although Comparable is used.

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static <T extends Comparable<T>> List<T> removeDuplicates(T[] input) {
        // TODO: your implementation goes here
        List<T> duplicate = new ArrayList<T>();
        List<T> duplicate2 = new ArrayList<T>();
        int lisLength = input.length;

        for (T t : input) {
            duplicate.add(t);
        }

        for (int iter = 0; iter < input.length; iter++) {
            int count = 0;
            for (int iter2 = 0; iter2 < input.length; iter2++) {
                if (input[iter].compareTo(input[iter2]) == 0) {
                    count += 1;
                }
                if (count > 1) {
                    duplicate.remove(input[iter]);
                    duplicate2.add(input[iter]);
                }
            }
        }

        for (int i = 0; i < duplicate2.size(); i++) {
            if (!duplicate.contains(duplicate2.get(i))) {
                duplicate.add(duplicate2.get(i));
            }
        }

        // duplicate.removeAll(duplicate2);
        return duplicate;


    }


    public static void main(String[] args) {
        // TODO: insert some test cases to show that your method works
        Integer[] array = new Integer[]{2, 4, 5, 5, 2, -8, 8, 5};
        RemoveDuplicates rem = new RemoveDuplicates();
        //System.out.println(rem.removeDuplicates(array));


    }

}

//Done together by Pritha Ghosal(239466) , Preetam Naik(240014) and Jeffy Elson(239463)
/**********************************************************
 * 1. The given array is int[] a = { 5,3,4,7,1,2}. In merge sort we divide the
 * array in 2 equal parts and then divide the 2 parts to to two equal parts till
 * we have single elements. Then we combine the elements as we had broken down
 * but we sort and then combine them and then at the end we have our sorted
 * array. Here the two arrays are {5,3,4} and {7,1,2} which is broken down to
 * {5} and {3,4} and then to {7} and {1,2} again the {3,4} is broken down to {3}
 * and {4} and {1,2} to {1} and {2}. At the end we have {5} {3} {4} {7} {1} {2}
 * Now we re group again but sorting them before placing them back so we have
 * {5} and {3,4} after comparison and {7} and{1,2} after comparison. Next we
 * have {3,4,5} and {1,2,7} and then finally we get {1,2,3,4,5,7}.
 * 2. 1. In Divide and Conquer we usually try to break the big complex problem into
 * smaller sub problems and then try to solve these sub problems and then
 * combine them to get our results
 * 2.
 * 3.The given mergesort is stable as <= will help in not swapping the elements which are same. If there is a same
 * valued element in both halves then the operator < will make the same valued
 * numbers to exchange and hence it wouldn't be stable. But as the given code has
 * <= it checks for the equality and then doesn't exchange the same valued .
 */

import java.util.Arrays;
import java.util.Comparator;


public class MergeSort {

    @SuppressWarnings("unchecked")


    public static <T> void mergeSort(T[] a, Comparator<T> c) {
// TODO: mergesort for generics

        _mergesort(a, (T[]) new Object[a.length], 0, a.length - 1, c);
    }


    private static <T> void _mergesort(T[] array, T[] copy, int first, int last, Comparator<T> c) {
        if (first < last) {
            int mid = (last + first) / 2;
            _mergesort(array, copy, first, mid, c);
            _mergesort(array, copy, mid + 1, last, c);
            merge(array, copy, first, mid, last, c);
        }
    }


    private static <T> void merge(T[] array, T[] copy, int first, int middle, int last, Comparator<T> c) {
        int i_iter = 0;
        int j_iter = 0;
        int k_iter = 0;
        if (last > first) {
            for (i_iter = middle + 1; i_iter > first; i_iter--) {
                copy[i_iter - 1] = array[i_iter - 1];
            }
            for (j_iter = middle; j_iter < last; j_iter++) {
                copy[last + middle - j_iter] = array[j_iter + 1];
            }
            for (k_iter = first; k_iter <= last; k_iter++) {
                if (c.compare(copy[i_iter], copy[j_iter]) < 0) {
                    array[k_iter] = copy[i_iter++];
                } else {
                    array[k_iter] = copy[j_iter--];
                }
            }
        }
    }


    public static void main(String[] args) {
// TODO: test for Strings (sort ascending and descanding)


        String[] nameList = {"ghosal", "naik", "jeffy", "mohan", "ghadwal", "kundu", "sharma", "saha"};
        System.out.println(Arrays.toString(nameList));
        System.out.println();
        Comparator<String> ascendinglist = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        mergeSort(nameList, ascendinglist);
        System.out.println("Ascending list : " + Arrays.toString(nameList));

        Comparator<String> descendinglist = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        mergeSort(nameList, descendinglist);
        System.out.println("Descending list : " + Arrays.toString(nameList));
    }
}
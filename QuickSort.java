/*********************************************************
 //Done together by Pritha Ghosal(239466) , Preetam Naik(240014) and Jeffy Elson(239463)
 * 1.The given array is int [] = {5, 3, 4, 8, 7, 1, 2} Firstly select a pivot
 * which can be anything for now. For our case I consider pivot as 2( last
 * element of the array) We partition our array on the basis of this pivot
 * element that is we have all the values lesser than the pivot on the left and
 * the values greater than our pivot element to be on the right side of the
 * pivot element.We consider a incrementer from start and a decrementer from end
 * and compare the values with the pivot. if the value is lesser than the pivot
 * then we bring to the element to the left side of the pivot and if it is
 * bigger than the pivot we bring it to the right side of the pivot element by
 * using swap operation and stop once the incrementer has crossed the
 * decrementer value. it would look something like this int[] = {
 * 1,2,3,5,4,8,7}. Now we have 2 at the right postion and we sort our two other
 * arrays which are partioned. The two partioned arrays are {1} and {3,5,
 * 4,8,7}. Then we do the same procedure again by considering the last element
 * as the pivot and compare this element with the rest and sort. As{1} is the
 * only value we know that it is sorted. {3,5,4,8,7} needs to be sorted and we
 * consider 7 as our pivot and compare values with this pivot and we get twp
 * arrays as {3,5,4} and {8}. We again apply our Quicksort Algorithm and
 * consider 4 as the pivot and we get {3} and {5} and as {8} is already sorted
 * we know that it is at the right postion. After all the steps are done, we get
 * our final sorted array as {1,2,3,4,5,7,8}
 *
 * 2. The average time complexity of the Quick sort algorithm is O(Nlog(N)). We
 * can get the best case complexity of Quick sort when we usually choose the
 * pivot element as the mean of all the elements in the array. As we consider
 * the mean as our pivot the array will be divided in equal lengths so that the
 * height of the recursive tree is minimum. We get worst case complexity for
 * Quick sort as O(N^2) when we consider the smallest or the largest element of
 * the array. As we consider smaller or biggest element, the height of the tree
 * would be N and our Top node would have to do N operations and then N-1 and
 * finally 1 operations to find the perfectly sorted array.
 *
 **********************************************************/

import java.util.Arrays;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] a) {
        // TODO: quicksort-algorithm for generics
        quickSort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] a, int left, int right) {
        if (right > left) {
            int pivot = partition(a, left, right);
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] a, int left, int right) {
        T pivot = a[right];
        int middle = left;
        for (int i = middle; i < right; i++) {
            if (a[i].compareTo(pivot) <= 0) {
                swap(a, i, middle++);
            }
        }
        swap(a, right, middle);
        return middle;
    }

    private static <T extends Comparable<T>> void swap(T[] a, int first, int second) {
        if (first != second) {
            T swap = a[first];
            a[first] = a[second];
            a[second] = swap;
        }
    }

    public static void main(String[] args) {

    }

}

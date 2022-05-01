/*
Worked in a group - Sunil Ghadwal, Preetam Naik, Jeffy Elson, and Pritha Ghosal
*/

import java.util.*;

public class MaxHeap<T extends Comparable<T>> {

	public String toString() {
		return heap_.toString();
	}

	private List<T> heap_;

	public MaxHeap() {
		heap_ = new ArrayList<T>();
	}

	public MaxHeap(T[] arr) {
		heap_ = new ArrayList<T>();
		for (int i = 0; i < arr.length; i++) {
			heap_.add(arr[i]);
		}
		for (int i = getSize() - 1; i >= 0; i--) {
			sink(i);
		}
	}

	public List<T> getHeap() {
		return this.heap_;
	}

	public int getSize() {
		return heap_.size();
	}

	public boolean isEmpty() {
		return heap_.size() == 0;
	}

	public void sink(int n) {
		int childToSwap;

		while (n < getSize()) {
			int leftChild = getChild(n, true);
			int rightChild = getChild(n, false);

			if (leftChild < getSize()) {
				if (rightChild >= getSize()) {
					childToSwap = leftChild;
				} else {
					childToSwap = (heap_.get(leftChild).compareTo(heap_.get(rightChild)) > 0 ? leftChild : rightChild);
				}
				if (heap_.get(n).compareTo(heap_.get(childToSwap)) < 0) {
					T tmp = heap_.get(n);
					heap_.set(n, heap_.get(childToSwap));
					heap_.set(childToSwap, tmp);
				} else {
					break;
				}
				n = childToSwap;
			} else {
				break;
			}

		}

	}

	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private int getChild(int index, boolean left) {
		return 2 * index + (left ? 1 : 2);
	}

	public void insert(T obj) {
		heap_.add(obj);
		swim(getSize() - 1);
	}

	private void swim(int n) {
		T newValue = heap_.get(n);

		while (n > 0 && newValue.compareTo(heap_.get(getParent(n))) > 0) {
			heap_.set(n, heap_.get(getParent(n)));
			n = getParent(n);
		}

		heap_.set(n, newValue);
	}

	public static void main(String[] args) {

		Character[] charArray = { 'X', 'T', 'O', 'G', 'S', 'M', 'N', 'A', 'E', 'R', 'A', 'I' };
		Integer[] intArray = { 8, 3, 7, 1, 5, 6, 18, 9 };

		MaxHeap<Character> maxHeapChar = new MaxHeap<Character>();

		for (int i = 0; i < 3; i++) {
			maxHeapChar.insert(charArray[i]);
			System.out.println(maxHeapChar.getSize());
		}

		System.out.println(maxHeapChar.toString());

		MaxHeap<Integer> maxHeapInt = new MaxHeap<Integer>(intArray);

//		for (int i = 0; i < intArray.length; i++) {
//			maxHeapInt.insert(intArray[i]);
//			System.out.println(maxHeapInt.getSize());
//		}

		System.out.println(maxHeapInt.toString());
	}
}

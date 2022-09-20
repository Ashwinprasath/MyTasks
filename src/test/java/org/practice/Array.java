package org.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Array {

	public void printDuplicateElementsInArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		System.out.println("Print the duplicate elements of array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}System.out.println();
	}

	public void removeDuplicateElementsInArray() {
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			ls.add(a[i]);
		}
		System.out.println(ls);
	}

	public void sortingArrayUsingMethod() {
		int[] a = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void sortingArrayinAscendingOrder() {
		int[] a = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void sortingArrayinDescendingOrder() {
		int[] a = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void reverseOrder() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Array a = new Array();
		a.printDuplicateElementsInArray();
//		a.removeDuplicateElementsInArray();
//		a.sortingArrayinAscendingOrder();
//		a.sortingArrayinDescendingOrder();
//		a.reverseOrder();
	}
}

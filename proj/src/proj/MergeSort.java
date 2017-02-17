package proj;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] a = { 2, 6, 3, 5, 1 };
		mergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(a, left, middle);
			mergeSort(a, middle + 1, right);

			merge(a, left, middle, right);
		}
	}

	public static void merge(int[] a, int left, int middle, int right) {
		int n1 = middle - left + 1; 
		int n2 = right - middle;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = a[left+ i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = a[middle + j + 1];
		}
		
		int i = 0 ,j = 0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				a[k++] = L[i++];
			}
			else {
				a[k++] = R[j++];
			}
		}
		
		while(i < n1) {
			a[k++] = L[i++];
		}
		while(j < n2) {
			a[k++] = R[j++];
		}
		
		
		
	}
}

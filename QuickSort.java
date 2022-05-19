import java.util.Random;

public class QuickSort {
	
	public static void quickSort(double[] A, int p, int r) {
		
		if (p<r) {
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q + 1, r);
		}
	}
	
	public static int partition(double[] A, int p, int r) {
		
		// int x is equal to pivot, highest index value
		double x = A[r];
		
		// int i is equal to the index of smaller element
		// Indicates the right position of pivot found so far
		int i = p - 1;
		
		
		for (int j=p; j <= r - 1; j++) {
			
			// if current element is smaller
			// than the pivot
			if(A[j] < x) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}
	
	// This function swaps array values at given indexes
	public static void swap(double[] A, int i, int j) {
		
		double temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		
	}
	
	
	public static void main(String[] args) {
		
		// Repeating terms:
		double [] list1 = {11, 1, 51, 1, 5, 3};
		System.out.println("Repeating Terms Test: ");
		// Print unsorted before
		System.out.println("Before sort: ");
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
		
		//Sort
		quickSort(list1, 0, list1.length - 1);
		
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
		
		
		
		
		
		// Negative number:
		double [] list2 = {1, 1, -5, 6};
		System.out.println("Negative Number Test: ");
		// Print unsorted before
		System.out.println("Before sort: ");
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
		
		//Sort
		quickSort(list2, 0, list2.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
		
		
		
		
		
		// Double, Int's, and Neagtive Test:
		double [] list3 = {11, -4, 20, 15, 13.5, -20};
		System.out.println("Double, Int's, and Neagtive Test: ");
		// Print unsorted before
		System.out.println("Before sort: ");
		for (int i = 0; i < list3.length; i++) {
			System.out.println(list3[i]);
		}
		
		//Sort
		quickSort(list3, 0, list3.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list3.length; i++) {
			System.out.println(list3[i]);
		}
		
		
		// Already Sorted Array Test (Negatives, Floats):
		double [] list4 = {-4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15.25, 16.25};
		System.out.println("Already Sorted Array Test: ");
		// Print unsorted before
		System.out.println("Before sort: ");
		for (int i = 0; i < list4.length; i++) {
			System.out.println(list4[i]);
		}
		
		//Sort
		quickSort(list4, 0, list4.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list4.length; i++) {
			System.out.println(list4[i]);
		}
		
		
		
		
		// Reversed Order
		double [] list5 = {50, 0, -5};
		System.out.println("Reversed Order Test: ");
		// Print unsorted before
		System.out.println("Before sort: ");
		for (int i = 0; i < list5.length; i++) {
			System.out.println(list5[i]);
		}
		
		//Sort
		quickSort(list5, 0, list5.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list5.length; i++) {
			System.out.println(list5[i]);
		}
		
		
		
		
		// Large Input
		Random randNum = new Random();
		double[] list6 = new double[100];
		System.out.println("Large Input Test: ");
		// Print and populate unsorted array
		System.out.println("Before sort: ");
		for (int i = 0; i < list6.length; i++) {
			list6[i] = randNum.nextDouble();
			System.out.println(list6[i]);
		}
		
		//Sort
		quickSort(list6, 0, list6.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list6.length; i++) {
			System.out.println(list6[i]);
		}
		
	}
	
	
}

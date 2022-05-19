import java.util.Random;

public class InsertionSort {
	
	public static double[] insertionSort(double[] A) {
		int i = 0;
		
		// Traverse the list or array from index 1 to n-1.
		for (int j=1; j < A.length; j++) {
			double key = A[j];
			
			// Insert A[i] into the sorted subarray a[0:i].
			// Compare stored key with the already sorted values to its left.
			// Move each item one position to the right until we find the 
			// position for the key or fall off the left end of the list or array. 
			i = j - 1;
			while (i >= 0 && A[i] > key) {
				A[i+1] = A[i];
				i = i - 1;
			}
			// Insert key at the correct position in the list or array.
			A[i + 1] = key;
		}
		
		return A;
		
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
		double[] list1Test = insertionSort(list1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list1Test.length; i++) {
			System.out.println(list1Test[i]);
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
		double[] list2Test = insertionSort(list2);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list2Test.length; i++) {
			System.out.println(list2Test[i]);
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
		double[] list3Test = insertionSort(list3);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list3Test.length; i++) {
			System.out.println(list3Test[i]);
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
		double[] list4Test = insertionSort(list4);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list4Test.length; i++) {
			System.out.println(list4Test[i]);
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
		double[] list5Test = insertionSort(list5);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list5Test.length; i++) {
			System.out.println(list5Test[i]);
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
		double[] list6Test = insertionSort(list6);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list6Test.length; i++) {
			System.out.println(list6Test[i]);
		}
		
		
		
	}
}

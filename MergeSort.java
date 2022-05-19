import java.util.Random;

// Divide and Conquer Algorithm

public class MergeSort {
	
	
	public static void merge(double[] A, int l, int m, int r) {
		
		// Get size of two subarrays
		int sizeOfSubArrayOne = m - l + 1;
		int sizeOfSubArrayTwo = r - m;
		
		// Create two temp arrays L[],R[]
		double[] L = new double[sizeOfSubArrayOne + 1];
		double[] R = new double[sizeOfSubArrayTwo + 1];
		
		// Copy left half of array into subarray one
		for(int i=0; i < sizeOfSubArrayOne; i++) {
			L[i] = A[l + i];
		}
		
		// Copy right half of array into subarray two
		for(int j=0; j < sizeOfSubArrayTwo; j++) {
			R[j] = A[m + j + 1];
		}
		
		// Set sential values at end of temp arrays
		L[sizeOfSubArrayOne] = Integer.MAX_VALUE;
		R[sizeOfSubArrayTwo] = Integer.MAX_VALUE;
		
		// Reitialize array indexs
		int i = 0, j = 0;
		
		// Copy subarrays back to one array
		for(int k = l; k < r + 1; k++) {
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;
			}
			else {
				A[k] = R[j];
				j++;
			}
			
		}
	}
	
	//
	static void mergeSort(double[] A, int l, int r) {
		
		int m;
		
		if(l < r) {
			
			// Find half way point
			m = l + (r - l) / 2;
			
			// Sort two halfs
			mergeSort(A, l, m);
			mergeSort(A, m + 1, r);
			
			// merge two halfs
			merge(A, l, m, r);
		}
	}
	
    /* A utility function to print array of size n */
    static void printArray(double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
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
		mergeSort(list1, 0, list1.length - 1);
		
		
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
		mergeSort(list2, 0, list2.length - 1);
		
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
		mergeSort(list3, 0, list3.length - 1);
		
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
		mergeSort(list4, 0, list4.length - 1);
		
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
		mergeSort(list5, 0, list5.length - 1);
		
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
		mergeSort(list6, 0, list6.length - 1);
		
		// Print sorted array
		System.out.println("After sort: ");
		for (int i = 0; i < list6.length; i++) {
			System.out.println(list6[i]);
		}
		
	}
	
	
	
	
	
}

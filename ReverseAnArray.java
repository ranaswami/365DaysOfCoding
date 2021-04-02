package final450Questions.arrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("The array is: ");
		printArray(a);
		System.out.println();
		reverseArray(a);
		System.out.print("The reversed array is: ");
		printArray(a);
	}
	public static void printArray(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void reverseArray(int[] a) {
		int start=0,end=a.length-1;
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
}

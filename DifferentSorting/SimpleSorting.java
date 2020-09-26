import java.util.Scanner;

public class SimpleSorting{
	public static void sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr){
		System.out.print("[ ");
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number for list :");
		int total = sc.nextInt();
		int[] arr = new int[total];
		System.out.println("Enter the number for the list");
		for(int i = 0; i < total; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted list : ");
		printArray(arr);
		sort(arr);
		System.out.println("Sorted list : ");
		printArray(arr);
	}
	
}
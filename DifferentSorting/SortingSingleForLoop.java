import java.util.Scanner;

public class SortingSingleForLoop{
	public static void sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				//As when the for loop continues, (i = -1) will increment back to zero and the sorting will start from start.
				i = -1;
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
		System.out.println("Enter the number of element in the list you want to sort");
		int total = sc.nextInt();
		int[] arr = new int[total];
		System.out.println("Enter the number you want to sort");
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
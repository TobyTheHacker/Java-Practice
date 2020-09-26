import java.util.Scanner;

public class BubbleSort{
	public static void sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			boolean flag = false;
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false){
				break;
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
		System.out.println("Enter the total number for the list to be sorted: ");
		int total = sc.nextInt();
		int[] arr = new int[total];
		System.out.println("Enter the number for the list: ");
		for(int i = 0; i < total; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Unsorted list : ");
		printArray(arr);
		sort(arr);
		System.out.print("Sorted list : ");
		printArray(arr);
	}
}
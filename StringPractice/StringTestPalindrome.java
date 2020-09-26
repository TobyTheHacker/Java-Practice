import java.util.Scanner;

public class StringTestPalindrome{
	
	public static boolean checkPalindrome(String value){
		boolean flag = false;
		String reverse = "";
		for(int i = value.length()-1; i >= 0; i--){
			reverse = reverse+value.charAt(i);
		}
		System.out.println("Entered text is : "+value);
		System.out.println("Reversed text is : "+reverse);
		if(value.equalsIgnoreCase(reverse)){
			flag = true;
		}
		return flag;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text you want to check : ");
		String text = sc.nextLine();
		
		if(checkPalindrome(text)){
			System.out.println("Number is palindrome");
		}else{
			System.out.println("Number is not a palindrome");
		}
	}
}
import java.util.Scanner;

public class StringTest{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the String");
			String string = sc.nextLine();
			String reverse = "";
			for(int i = string.length()-1; i >= 0; i--){
				reverse = reverse+string.charAt(i);
			}
			System.out.println("Entered text is : "+string);
			System.out.println("Reverse of text is : "+reverse);
	}
}
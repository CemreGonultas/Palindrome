import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		//kasaylabalyasak
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle giriniz: ");
		String cumle = scan.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i< cumle.length() / 2; i++) {
			stack.push(cumle.charAt(i));
		}
		if(isPalindrome(cumle,stack)) {
			System.out.println("Bu cümle palindromdur.");
		}else {
			System.out.println("Bu cümle palindrom değil.");
		}

	}
	public static boolean isPalindrome(String cumle,Stack<Character> stack) {
		for(int i=(cumle.length()/2)+1; i<cumle.length(); i++) {
			if(cumle.charAt(i) != stack.pop()) {
				return false;
			}
			
			}return true;
		}
	
}




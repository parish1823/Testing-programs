package practice_set;

public class Assmt179_arraydigit {

	public static void main(String[] args) {
		
		String str="Pa2ri4sh";
		
	char arr[]=	str.toCharArray();

	for(char i:arr) {
		if(Character.isDigit(i)) {
			System.out.println("string contains digit "+ i);
		}
	}
	}

}

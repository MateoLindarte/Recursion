package recursion;

public class Palindromo {

	public static void main(String[] args) {
		
		int array[] = new int [] {3, 5, 8, 5};
		
		

	
	public static boolean Palindromo(array[], int indice  ) {
		
		for(int i = 0; i < array.length; i++);{
			if(array[indice] != array.length - indice - 1 ) {
				return false;
			}
		}
		if (Palindromo(array) == true) {
			System.out.println("1");  // es palindromo
		   }
		else {
			System.out.println("0"); // no es palindromo
		}
		return true;
		
	}
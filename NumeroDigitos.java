package recursion;

public class NumeroDigitos {

	public static void main(String[] args) {
		
		int num = 900898;
		while(num<=0);
		System.out.println("Numero de cifras" + numeroCifras(num));

	}
	public static int numeroCifras(int n) {
		if(n<10) {
			return 1;
		} 
		else {
			return 1 + numeroCifras(n/10);
		}
	}

}

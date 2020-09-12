package recursion;

public class numeroPrimo {
	
	public static void main(String[] args) {
		int n = 17;
		int m = 18;
		System.out.println(primo(n,n-1));
		System.out.println(primodos(m,m-1));
	}
	public static boolean primo(int n, int div) {
		if(div==1) {
			return true;
		}
		if(n%div==0) {
			return false;
		}
		return primo (n, div-1); // 	Caso base
	}
	public static boolean primodos(int m, int div) {
		if(div==1) {
			return true;
		}
		if(m%div ==0) {
			return false;
		}
		return primo(m, div-1); // caso base
	}

}

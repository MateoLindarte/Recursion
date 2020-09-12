package recursion;

public class MayorArray {

	public static void main(String[] args) {
		
		int array[] = new int[] {3, 7, 25, 13,678};
		
		System.out.println("Maximo " + mayor(array, 0, array[0]));
		
	

    }
	public static int mayor(int[] array, int indice, int nummax) {
		if(indice != array.length) {
			
			if(array[indice]>nummax) {
				nummax = mayor(array, indice + 1, array[indice]);
			}
			else {
				nummax = mayor(array, indice + 1, nummax);
			}
			
		}
		return nummax;
	}
}

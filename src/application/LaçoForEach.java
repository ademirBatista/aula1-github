package application;

public class LaçoForEach {

	public static void main(String[] args) {
		

		String [] vect = new String [] {"Maria", "Bob", "Alex"};
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);/* imprimi cada elemento do vetor*/
		}
		System.out.println("/////////////////////////////");
		/* para cada obj do bjeto contino no vetor vect faça*/
		for(String obj : vect) {
			System.out.println(obj);
		}
	}
}
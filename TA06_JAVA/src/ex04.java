import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double factorial;
		
		Scanner numero = new Scanner( System.in );
		System.out.print("Introduce un número: ");
		 num=numero.nextInt();
		 factorial=1; 
		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;

		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);
		
	}

}

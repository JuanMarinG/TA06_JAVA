import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1=sc.nextInt();
  
        System.out.println("Introduce el segundo numero: ");
        int numero2=sc.nextInt();
        
        System.out.println("Que cantidad de numeros aleatorios quieres?: ");
        int cantidad=sc.nextInt();
        
        for (int i=0;i<cantidad;i++){
            int generador=(int)Math.floor(Math.random()*(numero1-numero2)+numero2);
            System.out.println("Los numeros aleatorios son: ");
            System.out.println(generador);
        }
		
	}

}

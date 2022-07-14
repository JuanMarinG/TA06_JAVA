import java.util.Scanner;
public class ex01 {

	//Solicitar al usuario que area quiere calcular
	//Leer dato 
	//Reconocer dato, solicitar valor o valores segun la figura y ejecutar el metodo
	//Mostrar el resultado
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio=0;
		double lado=0;
		double altura=0;
		double base=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Que area quieres calcular de las siguientes opciones?: Circulo, Cuadrado y Triangulo: ");
		String respuesta = sc.nextLine();
		switch (respuesta){
		
		case "Circulo": 
			System.out.println("Introduce el valor del radio: ");
			radio = sc.nextDouble();
			areaCirculo(radio);
			break;
			
		case "Cuadrado": 
			System.out.println("Introduce el valor del lado: ");
			lado = sc.nextDouble();
			areaCuadrado(lado);
			break;
			
		case "Triangulo": 
			System.out.println("Introduce el valor de la base: ");
			base = sc.nextDouble();
			
			System.out.println("Introduce el valor de la altura: ");
			altura = sc.nextDouble();
			
			System.out.println("El area del triangulo es: "+(base*altura)/2);
			break;
			default:
			System.out.println("No has introducido un valor correcto");
			}
		sc.close();
		
	}
			

//Metodos
		
	public static void areaCirculo (double newradio){
		final double PI = 3.1416;
		double area = PI*(newradio*newradio);
		System.out.println("El resultado del area del circulo es: "+area);
	}
	
	public static void areaCuadrado (double newlado){
		double area = newlado*newlado;
		System.out.println("El resultado del area del cuadrado es: "+area);
	}
	
	public static void areaTriangulo ( double  newaltura, double newbase){
		double area = (newbase*newaltura)/2;
		System.out.println("El resultado del triangulo area es: "+area);
		
	}
	
}
	


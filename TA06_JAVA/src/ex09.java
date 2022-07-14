import javax.swing.JOptionPane;
import java.util.Random;
public class ex09 {
 
    public static void main(String[] args) {
 
       
        String tamaño=JOptionPane.showInputDialog("Tamaño del array");
        int num[]=new int[Integer.parseInt(tamaño)];

        rellenar(num, 1, 20);
        mostrar(num);
        
    }
 
    public static void rellenar(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            lista[i]=((int)Math.floor(Math.random()*(13-1)+5));
           
        }
    }
 
    public static void mostrar(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("El indice "+i+" tiene un valor de "+lista[i]);
            
        }
    }
 }

    	
    	

import javax.swing.JOptionPane;
public class ex08 {
 
    public static void main(String[] args) {
 
        final int limite=10;
        int num[]=new int[limite];
 
        valor(num);
        mostrar(num);
    }
 
    public static void valor(int lista[]){
        for(int i=0;i<lista.length;i++){
            String entrada=JOptionPane.showInputDialog("Introduce un valor: ");
            lista[i]=Integer.parseInt(entrada);
        }
    }
 
    public static void mostrar(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("El indice "+i+" tiene un valor de "+lista[i]);
        }
    }
}
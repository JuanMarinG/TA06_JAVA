import javax.swing.JOptionPane;
public class ex11 {
 
    public static void main(String[] args) {
 
      
        String texto=JOptionPane.showInputDialog("Introduce un valor para definir el numero de filas: ");
        int LONG=Integer.parseInt(texto);
 
     
        int array1[]=new int [LONG];
        int array2[];
 
        random(array1, 10, 100);
        array2=array1;
        array1=new int[LONG];
        random(array1, 10, 100);
        int multiplicador[]=multiplicador(array1, array2);
 
       //MOSTRAR RESULTADOS
 
        System.out.println("Array1");
        mostrar(array1);
 
        System.out.println("Array2");
        mostrar(array2);
 
        System.out.println("Resultado de la multiplicacion entre arrays");
        mostrar(multiplicador);
 
        //METODOS
 
    }
    public static void random(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrar(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
 
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}
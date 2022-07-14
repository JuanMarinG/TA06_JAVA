import javax.swing.JOptionPane;
public class ex12 {
 
    public static void main(String[] args) {
 
       
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array: ");
        int num[]=new int[Integer.parseInt(texto)];
 
        int terminacion;
        do{
            texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            terminacion=Integer.parseInt(texto);
        }while(!(terminacion>=0 && terminacion<=9));
 
      
        aleatorio(num, 1, 300);
        int terminadosEn[]=numTerminadosEn(num, terminacion);
        longitud(terminadosEn);
 
    }
    public static void aleatorio(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void longitud(int lista[]){
        for(int i=0;i<lista.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
            }
        }
    }
 
    public static int[] numTerminadosEn (int num[], int ultimo_numero){
 
        int terminadosEn[]=new int[num.length];
        int numeroFinal=0;
        for (int i=0;i<terminadosEn.length;i++){
 
            numeroFinal=num[i]-(num[i]/10*10);
            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
 
}
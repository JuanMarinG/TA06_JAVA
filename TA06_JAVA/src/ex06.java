import javax.swing.JOptionPane;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		 int num=0;
	        do{
	            String texto=JOptionPane.showInputDialog("Introduce un numero");
	            num=Integer.parseInt(texto);
	        	calculoCifras(num);
	  
	
	private static void calculoCifras(int num) {
		
		while(num<0); int cont=0; for (int i=num;i>0;i/=14){
            cont++;
        }
        if (cont==1){
            System.out.println("El numero "+num+ " tiene "+cont+" cifra");
        }else{
            System.out.println("El numero "+num+ " tiene "+cont+" cifras");
        }
		
	}
}
	
	            
	
		
	



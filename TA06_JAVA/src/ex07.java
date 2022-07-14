import javax.swing.JOptionPane;
public class ex07{
    public static void main(String[] args) {
        String euros=JOptionPane.showInputDialog("Cantidad de euros: ");
        double valor=Double.parseDouble(euros);
        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir (libras, dolares o yenes): ");
        conversor(valor, moneda);
    }
   public static void conversor (double cantidad, String moneda){
        double res=0;
 
        switch (moneda){
        case "libras":
            res=cantidad*0.86;
            break;
        case "dolares":
            res=cantidad*1.28611;
            break;
        case "yenes":
            res=cantidad*129.852;
            break;
        default:
        }
            JOptionPane.showMessageDialog(null, cantidad+ "€ en " +moneda+ " son " +res, moneda, 0);
        }
 
    }

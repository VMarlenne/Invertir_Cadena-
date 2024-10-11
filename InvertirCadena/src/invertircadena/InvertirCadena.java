package invertircadena;
import java.util.Scanner;

public class InvertirCadena {

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        }
        return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra para invertir: ");
        String texto = scanner.nextLine();
        
        String resultado = invertirCadena(texto);
        
        System.out.println("Texto invertido: " + resultado);
    }
}

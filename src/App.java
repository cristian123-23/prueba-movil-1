import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa un nombre: ");
        String nombre = scanner.nextLine();

        
        char[] nombreArray = nombre.toLowerCase().toCharArray();

        
        char[] nombreInvertidoArray = new char[nombreArray.length];
        for (int i = 0; i < nombreArray.length; i++) {
            nombreInvertidoArray[i] = nombreArray[nombreArray.length - 1 - i];
        }

        
        String nombreInvertido = new String(nombreInvertidoArray);

        
        System.out.println("Nombre invertido: " + nombreInvertido);

        
        scanner.close();
    }
}

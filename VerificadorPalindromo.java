import java.util.Scanner;
import java.util.Stack;

public class VerificadorPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    private static boolean esPalindromo(String palabra) {
        Stack<Character> pila = new Stack<>();

        // Agregar cada caracter de la palabra a la pila
        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        // Construir una nueva palabra invirtiendo la pila
        StringBuilder palabraInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            palabraInvertida.append(pila.pop());
        }

        // Comparar la palabra original con la palabra invertida
        return palabra.equals(palabraInvertida.toString());
    }
}

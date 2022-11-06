import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila mipila = new Pila();
        int valorUsuario = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        mipila.push(valorUsuario);

        System.out.println("Selecione un operador");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        valorUsuario = sc.nextInt();

        int numerador1 = mipila.pop();
        int numerador2 = mipila.pop();
        int resultado = 0;

        switch (valorUsuario){
            case 1:
                resultado = numerador1 + numerador2;
                break;
            case 2:
                resultado= numerador1 - numerador2;
                break;
            case 3:
                resultado = numerador1 * numerador2;
                break;
            case 4:
                resultado = numerador1 / numerador2;
                break;
            default:
                System.out.println("No ha puesto lo que se le pide");
                break;
        }
        System.out.println("el Resultado de la operacion es: " +resultado);
    }
}
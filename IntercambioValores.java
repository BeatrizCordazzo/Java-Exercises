package intercambiovalores;

import java.util.Scanner;


public class IntercambioValores {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduza el valor de a: ");
        a = sc.nextInt();
        System.out.println("Introduzca el valor de b: ");
        b = sc.nextInt();
        
        int aux = a;
        a = b;
        b = aux;
        
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        
    }
    
}

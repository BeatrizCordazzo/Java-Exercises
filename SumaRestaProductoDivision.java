package sumarestaproductodivision;

import java.util.Scanner;


public class SumaRestaProductoDivision {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduzca dos numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        double suma = a + b;
        double resta = a - b;
        double producto = a * b;
        double division = a / b;
        
        System.out.println("La suma de los dos numeros es: "+suma+". \nLa resta es: "+resta+". \nEl producto es: "+producto+". \nY la division es: "+division);
    }
    
}

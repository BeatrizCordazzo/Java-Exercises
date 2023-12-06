package mayoroigual;

import java.util.Scanner;


public class MayorOIgual {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primero numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println(num1+" Es mayor que "+num2);
        } else if(num1 < num2){
            System.out.println(num2+" Es mayor que "+num1);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }
}
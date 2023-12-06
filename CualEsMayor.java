package cualesmayor;

import java.util.Scanner;

public class CualEsMayor {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primero numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca el tercero numero: ");
        int num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El numero "+num1+" es el mayor.");
        } else if(num2 > num1 && num2 > num3){
            System.out.println("El numero "+num2+" es el mayor.");
        } else {
            System.out.println("El numero "+num3+" es el mayor.");
        }
    }
    
}

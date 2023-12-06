package s_o_n;

import java.util.Scanner;


public class S_o_N {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = " ";
        while (true) {
            System.out.println("Por favor, introduce 'S' o 'N':");
            resp = sc.nextLine().toUpperCase();

            if (resp.equals("S") || resp.equals("N")) {
                System.out.println("Has introducido: "+resp);
                break;
            } else {
                System.out.println("Error: Solo se permiten los caracteres 'S' o 'N'.");
            }
        }
    }    
}
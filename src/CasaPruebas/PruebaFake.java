package CasaPruebas;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PruebaFake {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {


            System.out.println("***********************************************");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Mostrara tu nombre");
            System.out.println("2 - Mostrara tus apellidos");
            System.out.println("3 - Mostrara el año de tu nacimiento");
            System.out.println("***********************************************");
            System.out.print("Indica la opcion que desees realizar: ");
            opcion = sc.nextInt();


            switch (opcion) {

                case 0:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA...");
                    break;

                case 1:
                    System.out.println("Tu nombre es Sergio...");
                    break;

                case 2:
                    System.out.println("Tus apellidos son Cervera Jimenez");
                    break;

                case 3:
                    System.out.println("Tu año de nacimiento es el 21 - 10 - 2002");
                    break;

                default:
                    System.out.println("ERROR, HAS DE MARCAR UNA OPCION VALIDA...");


            }
        } while (opcion != 0);






    }
}

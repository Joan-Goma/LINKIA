package m09.joangoma.dev;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validate = false;

        do{
            System.out.println("Que ejercicio deseas lanzar? - 0 para salir\n1.- Ejercicio 01 | Calculadora de la letra del DNI");
            int opMenu = scanner.nextInt();
            switch (opMenu) {
                case 0 -> {System.out.println("Gracias por utilizar el Launcher, hasta otra!");validate =true;}

                default -> throw new IllegalStateException("No se ha podido reconocer el DNI, compruebalo e intentalo de nuevo");
            }
        } while (validate == false);
    }
}

package m09.joangoma.dev.EJ01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numDNI;
        Scanner scanner = new Scanner(System.in);       
        do {
            System.out.println("Por favor introduce el DNI sin letra, 0 para salir");     
            numDNI = Integer.parseInt(scanner.nextLine());
            if(numDNI == 0){ return;}
            System.out.println(numDNI + calcDNI(numDNI));
        } while (true);
    }

    public static String calcDNI(int DNI){
        int result = DNI % 23;
        return switch (result) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> throw new IllegalStateException("Valor no de: " + result);
        };
    }

}

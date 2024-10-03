package etg.example.com;

import java.util.Scanner;

public class VanillaApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println( "Saludos, ingresa tu nombre: " );
        String myName = myScanner.nextLine();

        System.out.println( "Hola, " + myName + " Porfavor introduce tu edad: " );
        int myAge = myScanner.nextInt();

        System.out.print("Porfavor ingresa tu año de nacimiento: ");
        int myBirth = myScanner.nextInt();

        myScanner.close();

        System.out.println( "Hola, " + myName + " Tu tienes " + myAge + " años y eres del " + myBirth);
    }
}
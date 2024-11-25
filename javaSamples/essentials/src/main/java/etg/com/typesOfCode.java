package etg.com;

import java.util.Scanner; 

public class typesOfCode {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          System.out.println("Porfavor ingresa tu nombre:");
          String name = scan.nextLine();

          System.out.println("Bienvenido " + name + " :)");

          scan.close();
     }
     
}

package etg.example.com.packs;

import java.time.LocalTime;
import java.util.Scanner;

public class HourPack {
     public void hour() {
          Scanner etgScanner = new Scanner(System.in);

          LocalTime etgTiempo = LocalTime.now();

          System.out.print("Ingresa tu nombre: ");
          String name = etgScanner.nextLine(); // Reading a line of text  
          
          // Printing the user's name
          System.out.println("Hola " + name);
          System.out.println("Son a las: ");
          System.out.println(etgTiempo.getHour() + ":" + etgTiempo.getMinute());

          etgScanner.close(); // Closing the scanner
     }
          
}

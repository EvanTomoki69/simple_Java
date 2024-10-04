package etg.com;

//permite generar una lista de arrays
import java.util.ArrayList;
//permite registrar un input externo
import java.util.Scanner; 

public class Examples {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Create an ArrayList to store the input from the keyboard
        ArrayList<Integer> inputList = new ArrayList<>();

        // Ask for the input from the keyboard
        System.out.println("Porfavor ingresa algunos integer y escribe listo cuando hayas terminado :");

        while (true) {
            String input = in.nextLine();

            if (input.equalsIgnoreCase("listo")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                inputList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Input invalida, ingresa un integer");
            }
        }

        // Print the input list
        for (int number : inputList) {
            System.out.println(number);
        }

        in.close();
        
    }
}
public class casting {
     public static void main(String[] args) {
          
          // Ajusta el monto maximo de la banca movil
          int maxCash = 24000;

          // El monto actual del Titular es
          int holderCash = 300;

          /* Calculate the percantage of the user's score in relation to the maximum available score.
          Convert userScore to float to make sure that the division is accurate */
          float percentage = (float) holderCash / maxCash * 100.0f;

               System.out.println("User's percentage is " + percentage);
  }
}

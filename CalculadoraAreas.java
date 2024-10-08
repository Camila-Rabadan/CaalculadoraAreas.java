
// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    for (;;) {
    System.out.println("Escoje una operación a realizar:");

    System.out.println("1.Suma");
    System.out.println("2.Resta");
    System.out.println("3.Multiplicación");
    System.out.println("4.División");
    System.out.println("5.Geometria");



      int numEntero = Integer.parseInt(stdIn.readLine());


      if (numEntero == 1) {
        // Suma
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 + num2));
      }else if (numEntero == 2) {
        // Resta
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 - num2));
      }else if (numEntero == 3) {
        // Multiplicación
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 * num2));
      }else if (numEntero == 4) {
        // División 
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        if(num2==0){
          System.out.println("Error");
        }else{
        System.out.println("El resultado es:" + (num1 / num2));
        }
      }else if (numEntero<1 && numEntero>5){
        System.out.println("Error");
      }


      if(numEntero == 5){
        System.out.println("Escoje una figura:");
          
          System.out.println("1.Circulo");
          System.out.println("2.Cuadrado");
          System.out.println("3.Triangulo");

            int numeEntero = Integer.parseInt(stdIn.readLine());


            if (numeEntero == 1) {
              // Circulo
              System.out.println("Ingresa el radio:");
              int num1 = Integer.parseInt(stdIn.readLine());
              System.out.println("El resultado es:" + (3.14* (num1 *num1)));
            }else if (numeEntero == 2) {
              // Cuadrado
              System.out.println("Ingresa la medida del lado:");
              int num1 = Integer.parseInt(stdIn.readLine());
              System.out.println("El resultado es:" + (num1 * num1));
            }else if (numeEntero == 3) {
              // Triangulo
              System.out.println("Ingresa la base:");
              int num1 = Integer.parseInt(stdIn.readLine());
              System.out.println("Ingresa la altura:");
              int num2 = Integer.parseInt(stdIn.readLine());
              System.out.println("El resultado es:" + ((num1 * num2) /2));
            }else if ( numeEntero != 3 ||numEntero != 2 || numEntero != 1){
              System.out.println("Error");
            }
      }
    }
  }
}

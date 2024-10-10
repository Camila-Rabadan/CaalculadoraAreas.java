
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
    System.out.println("5.Rectangulo");
    System.out.println("6.Circulo");
    System.out.println("7.Triangulo");
    double num1,num2;
    num1=0;
    num2=0;


      double numEntero = Integer.parseInt(stdIn.readLine());
      System.out.println("Ingresa el primer número:");
      num1 = Integer.parseInt(stdIn.readLine());
      System.out.println("Ingresa el segundo número:");
      num2 = Integer.parseInt(stdIn.readLine());
      
      if (numEntero == 1) {
        // Suma
        System.out.println("El resultado es:" + (num1 + num2));
      }else if (numEntero == 2) {
        // Resta
        System.out.println("El resultado es:" + (num1 - num2));
      }else if (numEntero == 3) {
        // Multiplicación
        System.out.println("El resultado es:" + (num1 * num2));
      }else if (numEntero == 4) {
        // División 
        num2 = Integer.parseInt(stdIn.readLine());
        if(num2==0){
          System.out.println("Error");
        }else{
        System.out.println("El resultado es:" + (num1 / num2));
        }
      }else if (numEntero<1 && numEntero>7){
        System.out.println("Error");
      }else if(numEntero == 5){
        // Rectangulo
        System.out.println(rectangulo(num1,num2));
      }else if(numEntero == 6){
        // Circulo
        System.out.println(circulo(num1));
      }else if(numEntero == 7){
        // Triangulo
        System.out.println(triangulo(num1,num2));
      }

      
      
    }
  }
  public static double rectangulo(double num1,double num2){
    double resultado=num1*num2;
    return resultado; 
  }
  
  public static double circulo(double num1){
    double resultado=num1*num1*3.14;
    return resultado; 
  }
  public static double triangulo(double num1,double num2){
    double resultado=(num1*num2)/2;
    return resultado; 
  }
  
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    double A;
    double B;

    Scanner input = new Scanner(System.in);
    System.out.print("Informe o primeiro número: ");
    A = input.nextDouble();
    System.out.println("");
    System.out.print("Informe o segundo número: ");
    B = input.nextDouble();
    input.close();

    if (A > B) {
      System.out.println("");
      System.out.print( "O maior número entre os números informados é: " + A);
    } else if (B > A) {
      System.out.println("");
      System.out.print( "O maior número entre os números informados é: " + B);
    }
      else {
        System.out.println("");
        System.out.print( "Os números informados são iguais");
    }
  }
}
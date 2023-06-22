import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = input.nextDouble();
        
        if (num == Math.floor(num)) {
            System.out.println(num + " é um número inteiro.");
        } else {
            System.out.println(num + " é um número decimal.");
        }
        input.close();
    }
}

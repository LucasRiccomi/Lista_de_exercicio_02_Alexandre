import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        System.out.print("Telefonou para a vítima? (sim/não): ");
        String resp1 = input.nextLine().toLowerCase();
        if (resp1.equals("sim")) {
            count++;
        }
        
        System.out.print("Esteve no local do crime? (sim/não): ");
        String resp2 = input.nextLine().toLowerCase();
        if (resp2.equals("sim")) {
            count++;
        }
        
        System.out.print("Mora perto da vítima? (sim/não): ");
        String resp3 = input.nextLine().toLowerCase();
        if (resp3.equals("sim")) {
            count++;
        }
        
        System.out.print("Devia para a vítima? (sim/não): ");
        String resp4 = input.nextLine().toLowerCase();
        if (resp4.equals("sim")) {
            count++;
        }
        
        System.out.print("Já trabalhou com a vítima? (sim/não): ");
        String resp5 = input.nextLine().toLowerCase();
        if (resp5.equals("sim")) {
            count++;
        }
        
        if (count == 2) {
            System.out.println("Você é considerado(a) SUSPEITO.");
        } else if (count >= 3 && count <= 4) {
            System.out.println("Você é considerado(a) CÚMPLICE.");
        } else if (count == 5) {
            System.out.println("Você é considerado(a) ASSASSINO.");
        } else {
            System.out.println("Você é considerado(a) INOCENTE.");
        }
        
        input.close();
    }
}

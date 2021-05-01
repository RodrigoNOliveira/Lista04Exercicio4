import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println();
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        System.out.println();
        if (numero % 2 == 0) {
            
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é impar!");
        }
        System.out.println();
        input.close();
    }
}

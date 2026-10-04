
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, pow = 2;
        double resultado;

        num1 = leia.nextInt();

        if (num1 % 2 != 0) {
            num1++;
        }
        for (int i = 2; i <= num1; i += 2) {
            resultado = Math.pow(i, 2);
            System.out.printf(pow + "^2 = %.0f\n", resultado);
            pow += 2;
        }
    }

}

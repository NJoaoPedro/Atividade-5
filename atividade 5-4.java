import java.util.Scanner;

public class ContagemFaixasNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorMaior200 = 0;

        System.out.println("Digite 20 numeros:");
        for (int i = 1; i <= 20; i++) {
            System.out.print("Numero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else {
                contadorMaior200++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Entre 0 e 100: " + contador0a100);
        System.out.println("Entre 101 e 200: " + contador101a200);
        System.out.println("Maiores que 200: " + contadorMaior200);
    }
}

import java.util.Scanner;

public class IdadeEmDiasCompleta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite sua idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite quantos dias do mes atual voce ja viveu: ");
        int diasMesAtual = scanner.nextInt();

        int diasEmAnos = anos * 365;
        int diasEmMeses = meses * 30;
        int idadeEmDias = diasEmAnos + diasEmMeses + diasMesAtual;

        System.out.println("Sua idade em dias e: " + idadeEmDias);
    }
}

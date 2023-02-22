import java.util.Scanner;
public class DesafioLojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int doces = 2;

        System.out.println("O cliente obteve " + dinheiro * doces + " doces");

    }

}

import java.util.Scanner;
//psvm = "p"ublic "s"tatic "v"oid "m"ain
public class DesafioDownloadPacotes {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        int tamanho = leitor.nextInt();

        if (tamanho <= 10) {


            String barra = "";

            for (int i = 0; i < tamanho; i++) {
                barra = barra + "/";
                // barra = barra.concat("/");
            }
            System.out.println(barra);
        }
    }
}

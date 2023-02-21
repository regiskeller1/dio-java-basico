import java.util.Scanner; 
    
public class DesafioMesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        int entrada = leitor.nextInt();
        int mesada = 50;

        System.out.println("Você terá " + entrada * mesada + " reais.");
    }
}        
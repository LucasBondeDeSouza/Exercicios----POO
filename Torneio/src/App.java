import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Torneio torneio = new Torneio();
        
        
        System.out.println("Digite o nome: ");
        torneio.setNome(sc.next());
        System.out.println("Digite a idade: ");
        torneio.setIdade(sc.nextInt());
        System.out.println("****************************************");
        torneio.imprimeDados(); 
    }
}
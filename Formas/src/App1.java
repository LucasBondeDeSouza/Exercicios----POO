import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Circunferencia circunferencia = new Circunferencia();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();

        System.out.println("************** Cinrcunferência ***************");
        System.out.println("Digite o Raio da circunfrencia: ");
        circunferencia.setRaio(sc.nextFloat());
        circunferencia.mostra();

        System.out.println("************** Triângulo ***************");
        System.out.println("Digite a Base do Triângulo: ");
        retangulo.setBase(sc.nextFloat());
        System.out.println("Digite a Altura do Retângulo: ");
        retangulo.setAltura(sc.nextFloat());
        retangulo.mostra();
    }
}

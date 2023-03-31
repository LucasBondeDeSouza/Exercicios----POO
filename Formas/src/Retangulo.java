public class Retangulo extends Triangulo {

    public Retangulo() {
    }

    public Retangulo(float base, float altura) {
        super(base, altura);
    }



    @Override
    public float area() {
        return getBase() * getAltura();
    }

    @Override
    public void mostra() {
        System.out.println("\n************ Retângulo ************\n");
        System.out.println("àrea: " +area());
        System.out.println("Perímetro: " +perimetro());
        System.out.println("\n**********************************\n");
    }

    @Override
    public float perimetro() {
        return (getBase() * getAltura()) * 2;
    }
}

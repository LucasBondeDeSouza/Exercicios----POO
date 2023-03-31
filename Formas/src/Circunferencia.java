public class Circunferencia implements Forma{
    
    private float raio;

    public Circunferencia() {
    }

    public Circunferencia(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        return 3.14f * (getRaio() * getRaio());
    }

    @Override
    public void mostra() {
        System.out.println("\n************ Circunferência ************\n");
        System.out.println("Raio: " +area());
        System.out.println("Perímetro: " +perimetro());
        System.out.println("\n**********************************\n");
        
    }

    @Override
    public float perimetro() {
        return 2 * 3.14f *getRaio();
    }
}
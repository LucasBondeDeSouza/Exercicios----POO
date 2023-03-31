public class Triangulo implements Forma{

    private float base;
    private float altura ;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float area() {
        
        return 0;
    }

    @Override
    public void mostra() {
        
        
    }

    @Override
    public float perimetro() {
        
        return 0;
    }
}

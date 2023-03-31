public class Torneio {
    private String nome;
    private int idade;

    public Torneio() {
    }

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaCategoria(){
        if(getIdade() > 30){
            return "Sênior";
        } else if((getIdade() >=16 && getIdade() <= 30)){
            return "Adulto";
        } else if((getIdade() >= 11 && getIdade() <= 15)){
            return "Adolescente";
        } else if(getIdade() >= 8 && getIdade() <= 10){
            return  "Juvenil";
        } else if (getIdade() >= 5 && getIdade() <= 7) {
            return  "Infantil";
        } 
        return "Valor Inválido";
    } 

    public void imprimeDados(){
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Categoria: "+verificaCategoria());
    }
}

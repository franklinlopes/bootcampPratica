package exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        setAltura(altura);
        setPeso(peso);
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getID() {
        return ID;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2));
        if(imc < 20) {
            return -1;
        } else if(imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean ehMaiorIdade() {
        boolean maior = false;
        if(this.idade >= 18) {
            maior = true;
        }
        return maior;
    }
}

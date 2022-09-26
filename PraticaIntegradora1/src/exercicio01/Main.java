package exercicio01;

public class Main {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        Pessoa ciclano = new Pessoa("Ciclano", 40, "1");
        Pessoa beltrano = new Pessoa("Beltrano", 35, "7", 80.0, 1.80);

        if(beltrano.calcularIMC() == -1) {
            System.out.println(beltrano.getNome() + " está abaixo do peso");
        } else if(beltrano.calcularIMC() == 0) {
            System.out.println(beltrano.getNome() + " está com peso saudável");
        } else {
            System.out.println(beltrano.getNome() + " está acima do peso");
        }
    }
}

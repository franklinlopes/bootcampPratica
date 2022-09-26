package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        int temperaturas[][] = new int[10][2];
        String cidades[] = new String[] {
          "Londres",
          "Madrid",
          "Nueva York",
          "Buenos Aires",
          "Assuncion",
          "São Paulo",
          "Lima",
          "Santiago de Chile",
          "Lisboa",
          "Tokio",
        };

        temperaturas[0][0] = -2;
        temperaturas[0][1] = 33;
        temperaturas[1][0] = -3;
        temperaturas[1][1] = 32;
        temperaturas[2][0] = -8;
        temperaturas[2][1] = 27;
        temperaturas[3][0] = 4;
        temperaturas[3][1] = 37;
        temperaturas[4][0] = 6;
        temperaturas[4][1] = 42;
        temperaturas[5][0] = 5;
        temperaturas[5][1] = 43;
        temperaturas[6][0] = 0;
        temperaturas[6][1] = 39;
        temperaturas[7][0] = -7;
        temperaturas[7][1] = 26;
        temperaturas[8][0] = -1;
        temperaturas[8][1] = 31;
        temperaturas[9][0] = -10;
        temperaturas[9][1] = 35;

        int temperaturaMenor;
        int temperaturaMaior;
        String cidadeMaior, cidadeMenor;
        temperaturaMenor = temperaturas[0][0];
        temperaturaMaior = temperaturas[0][0];
        cidadeMaior = cidades[0];
        cidadeMenor = cidades[0];


        for (int i = 0; i <= 9 ; i++) {
            for (int j = 0; j <= 1 ; j++) {
                if(temperaturaMenor > temperaturas[i][j]) {
                    temperaturaMenor = temperaturas[i][j];
                    cidadeMenor = cidades[i];
                }
                if(temperaturaMaior < temperaturas[i][j]) {
                    temperaturaMaior = temperaturas[i][j];
                    cidadeMaior = cidades[i];
                }
            }
        }
        System.out.println(cidadeMenor + " com " + temperaturaMenor + " graus");
        System.out.println(cidadeMaior + " com " + temperaturaMaior + " graus");

    }
}

package exemplo.media;

public class App {
    public static void main(String[] args) {
        double listaNotas[] = {9.8, 7.0, 4.0, 8.7};
        double media = media(listaNotas);

        if(media < 4.0)
            System.out.println("Reprovado");
        else if (media <= 7.0) {
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
    }

    public static double media(double listaNotas[]) {
        if(listaNotas == null || listaNotas.length < 1) {
            throw new RuntimeException();
        }

        double soma = 0.0;
        
        for(int i = 0; i < listaNotas.length; i++) {
            soma += listaNotas[i];
        }
        return soma / listaNotas.length;
    }
}

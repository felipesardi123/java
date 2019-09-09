package exemplo.media;

public class App {
    public static void main(String[] args) {
        Double nota1 = 7.0;
        Double nota2 = 8.0;
        Double media = (nota1+nota2)/2;
        if(media < 4.0) {
            System.out.println("Reprovado");
        } else if (media <= 7.0) {
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
    }
}

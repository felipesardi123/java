package exemplo.cvc;

public class App {
    public static void main(String[] args) {
        Double precoEtanol = 3.12;
        Double precoGasolina = 4.12;
        Double vantagem = precoEtanol / precoGasolina;

        if(vantagem > 7.0) {
            System.out.println("Abasteça com Gasolina");
        } else {
            System.out.println("Abasteça com Etanol");
        }
    }
}

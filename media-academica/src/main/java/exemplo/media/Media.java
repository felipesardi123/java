package exemplo.media;

public class Media {
    public float calcularMedia(int vetor[], int inicioInterv, int fimInterv) {
        if (/*1*/inicioInterv < 0 || /*2*/fimInterv < 0) {
            return -1; /*3*/
        }
        if (/*4*/inicioInterv >= fimInterv) {
            return -1; /*5*/
        }
        float soma = 0, n = 0; /*6*/
        for (int i = 0/*7*/; /*8*/i < vetor.length; /*9*/i++) {
            if (/*10*/vetor[i] >= inicioInterv && /*11*/vetor[i] <= fimInterv) {
                soma = soma + vetor[i];/*12*/
                n++;
            }
        }
        return soma / n; /*13*/
    }
}
package com.livro_estrutura_de_dados;
public class Ordenacao_por_selecao {
    public static void main(String[] args) {
        int vetor[] = {23, 4, 33, 45, 19, 12, 28, 40};
        int menor;
        for(int i  = 0 ; i < vetor.length - 1; i++)
        {

            for(int j = i + 1 ; j< vetor.length;j++)
            {
                menor = vetor[i];
                if(vetor[j] < vetor[i])
                {
                    vetor[i] = vetor[j];
                    vetor[j] = menor;
                }
            }
        }
        for (int elemento : vetor) {
            System.out.printf("%d ", elemento);
        }
    }
}

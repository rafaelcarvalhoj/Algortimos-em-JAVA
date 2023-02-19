package com.livro_estrutura_de_dados;

public class ordenacao_por_trocas {
    public static void main(String[] args) {
        int vetor[] = {23, 4, 33, 45, 19, 12, 28, 40, 2, 99, 32};
        int maior;
        for(int i = 1 ; i < vetor.length ; i++)
        {
            for(int j = vetor.length - 1 ; j >= i ; j--)
            {
                maior = vetor[j-1];
                if(vetor[j-1] > vetor[j])
                {
                    vetor[j-1] = vetor[j];
                    vetor[j] = maior;
                }
            }
        }
        for(int elemento : vetor)
        {
            System.out.printf("%d ", elemento);
        }
    }
}

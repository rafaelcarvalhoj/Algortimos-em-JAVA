package com.livro_estrutura_de_dados;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Busca_binaria {

    public static boolean buscaBinaria(int[] vetor, int x){
        int inicio = 0, fim = vetor.length -1, meio;
        //System.out.println(fim);
        System.out.println("Efetuando a busca...");
        while(inicio <= fim)
        {
            meio = (fim+inicio)/2;
            if(x == vetor[meio]) {
                System.out.println("Numero encontrado");
                return true;
            }
            else if(vetor[meio] < x){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        System.out.println("Numero nao encontrado");
        return false;
    }

    public static void main(String[] args) {
        //DECLARAR VARIAVEIS
        int[] vetor = {118, 399, 861, 834, 777, 295, 431, 907, 2, 841, 795, 713, 744, 834, 108, 688, 225, 878, 666, 731, 661, 818, 280, 244, 529, 734, 110, 726, 103, 734, 71, 131, 593, 738, 166, 803, 623, 627, 399, 785, 112, 871, 218, 958, 468, 921, 697, 119, 582, 726, 524, 961, 282, 706, 936, 88, 890, 250, 580, 95, 289, 776, 117, 831, 874, 33, 80, 678, 80, 889, 59, 851, 450, 848, 429, 212, 77, 458, 344, 707, 985, 586, 501, 457, 607, 70, 422, 187, 782, 72, 409, 689, 139, 288, 467, 302, 625, 594, 218, 30};
        int x;
        Scanner scanner = new Scanner(System.in);

        //ORDENAR VETOR
        Arrays.sort(vetor);

        //ESCANER O NUMERO QUE DESEJAMOS PROCURAR
        x = scanner.nextInt();

        //EFETUAR BUSCA BINARIA
        boolean achou = buscaBinaria(vetor, x);
        System.out.println(achou);
    }
}

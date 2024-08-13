package view;

import controller.Ex4;

public class main {
    public static void main(String[] args) {
        int N = 5;

        if(N > 0 && N % 2 == 1) {
            int resultado = Ex4.FatorialDuplo(N);
                    System.out.printf("O fatotial duplo de %d é %d", N, resultado);
        }else {
            System.out.printf("Insira um valor ímpar");
        }
    }
}

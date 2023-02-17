package org.example;

public class Main {
    public static void main(String[] args) {

        int[][] matrizA = {
                {2,5,1},
                {1,3,2}
        };
        int[][] matrizB = {
                {5,3},
                {2,1},
                {7,9}
        };
        int[][] producto = new int[matrizA.length][matrizB[0].length];

        for (int a = 0; a < matrizB[0].length; a++) {
            for (int i = 0; i < matrizA.length; i++) {
                int suma = 0;
                for (int j = 0; j < matrizA[0].length; j++) {
                    suma += matrizA[i][j] * matrizB[j][a];
                }
                producto[i][a] = suma;
            }
        }

        System.out.print("Imprimiendo la matriz resultante\n");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("%d ", producto[i][j]);
            }
            System.out.print("\n");
        }
    }
}
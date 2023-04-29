import java.util.Arrays;

public class Ejercicio10RetosMatrices {

    public static void sumaDeM(int[][] matrizA, int[][] matrizB) {
        int[][] sumaGeneral = new int[matrizA.length][matrizB.length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int e = 0; e < matrizA[i].length; e++) {
                sumaGeneral[i][e] = matrizA[i][e] - matrizB[i][e];

            }
        }
        for (int i = 0 ; i < sumaGeneral.length; i++) {
            System.out.println(Arrays.toString(sumaGeneral[i]));
        }

    }

    public static void main(String[] args) {
        int[][]  matrizA = {{3, 8, 6}, {4, 6, 10}, {5, 8, 7}};
        int[][] matrizB = {{2, 5, 3}, {2, 3, 7}, {4, 6, 2}};
        sumaDeM(matrizA, matrizB);

    }


}

//Crea dos matrices cuadradas nxn de enteros y encuentra la diferencia entre las dos matrices para crear una nueva matriz.
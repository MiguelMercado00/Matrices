import java.util.Arrays;

public class Ejercicio3RetosMatrices {
    public static void sumaDeM(int[][] matrizA, int[][] matrizB) {
        int[][] sumaGeneral = new int[matrizA.length][matrizB.length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int e = 0; e < matrizA[i].length; e++) {
                sumaGeneral[i][e] = matrizA[i][e] + matrizB[i][e];

            }
        }
        for (int i = 0 ; i < sumaGeneral.length; i++) {
            System.out.println(Arrays.toString(sumaGeneral[i]));
        }

    }

    public static void main(String[] args) {
        int[][]  matrizA = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        int[][] matrizB = {{3, 5, 6}, {4, 6, 7}, {4, 8, 2}};
        sumaDeM(matrizA, matrizB);

    }
}

//Crea dos matrices cuadradas nxn de enteros y suma los elementos correspondientes de
// las dos matrices para crear una nueva matriz.
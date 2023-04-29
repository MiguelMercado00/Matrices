public class Ejercicio2RetosMatrices {
    public static void Arr(int[][] matrizC) {
        int suma = 0;
        for (int i = 0; i < matrizC.length; i++) {
            suma += matrizC[i][i];
        }

        System.out.println(suma);
    }

    public static void main(String[] args) {
        int[][] x = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        Arr(x);
    }
}

//Crea una matriz cuadrada nxn de números reales y calcula la suma de los elementos en la diagonal principal.
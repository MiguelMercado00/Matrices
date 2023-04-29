public class Ejercicio4RetosMatrices {
    public static void Arr(int[][] matrizDiagonal) {
        int multiplicacion = 1;
        for (int i = 0; i < matrizDiagonal.length; i++) {
            multiplicacion *= matrizDiagonal[i][matrizDiagonal.length - i - 1];
        }

        System.out.println(multiplicacion);
    }

    public static void main(String[] args) {
        int[][] x = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        Arr(x);
    }
}

//Crea una matriz cuadrada nxn de enteros y encuentra el producto de los elementos en la diagonal secundaria.
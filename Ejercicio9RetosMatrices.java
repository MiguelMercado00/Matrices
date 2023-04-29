public class Ejercicio9RetosMatrices {


    public static void Arr(int[][] matrizColumnas) {
        for (int i = 0; i < matrizColumnas[0].length; i++) {
            int sumaColumnas = 0;
            for (int e = 0; e < matrizColumnas.length; e++) {
                sumaColumnas += matrizColumnas[e][i];

            }
            System.out.println("La suma de los elementos de la columna " + i + " es: " + sumaColumnas);
        }


    }

    public static void main(String[] args) {
        int[][] x = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        Arr(x);
    }
}


//Crea una matriz cuadrada nxn de enteros y encuentra la suma de los elementos por columnas.
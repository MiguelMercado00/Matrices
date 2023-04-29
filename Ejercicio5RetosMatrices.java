public class Ejercicio5RetosMatrices {

    public static void Arr(int[][] matrizMedia) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < matrizMedia.length; i++) {
            for (int e = 0; e < matrizMedia[i].length; e++) {
                suma += matrizMedia[i][e];
                media = suma / 9;
            }
        }

        System.out.println(media);
    }

    public static void main(String[] args) {
        int[][] x = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        Arr(x);
    }
}


//Crea una matriz cuadrada nxn de números reales y calcula la media de los elementos de la matriz.
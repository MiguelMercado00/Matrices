public class Ejercicio7RetosMatrices {

        public static void Arr(int[][] matrizMultiplos) {
        int media = 0;
        int contador = 0;
        for (int i = 0; i < matrizMultiplos.length; i++) {
            for (int e = 0; e < matrizMultiplos[i].length; e++) {
                if (matrizMultiplos[i][e] % 3 == 0) {
                    contador++;
                }
            }
        }

        System.out.println(contador);
    }

        public static void main(String[] args) {
        int[][] x = {{2, 8, 3}, {2, 3, 10}, {5, 6, 7}};
        Arr(x);
    }
}



//Crea una matriz cuadrada nxn de enteros y encuentra el número de elementos en la matriz que son múltiplos de 3.
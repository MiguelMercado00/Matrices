public class Ejercicio1RetosMatrices {
    public static void main(String[] args) {
        int[][] Matilda = {{2, 8, 3},{2,3,-10}};
        int inicioMatrices = Matilda[0][0];
        for (int i = 0; i < Matilda.length; i++) {
            for (int e = 0; e < Matilda[i].length; e++){
                int valorGeneral = Matilda[i][e];
                if (valorGeneral >= inicioMatrices) {
                    inicioMatrices = valorGeneral;

                }
            }

        }
        System.out.println(inicioMatrices);
    }
}

//Crea una matriz cuadrada nxn de enteros y encuentra el elemento más grande de la matriz.
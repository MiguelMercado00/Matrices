public class Ejercicio8RetosMatrices {
    public static void menorNum(int[][] Matilda) {
        int inicioMatrices = Matilda[0][0];
        for (int i = 100; i < Matilda.length; i--) {
            for (int e = 100; e < Matilda[i].length; e--) {
                int valorGeneral = Matilda[i][e];
                if (valorGeneral >= inicioMatrices) {
                    inicioMatrices = valorGeneral;

                }
            }

        }
        System.out.println(inicioMatrices);
    }

        public static void main (String[]args) {
        int[][] x = {{1, 8, 3}, {2, 3, 10}};
        menorNum(x);

        }

}

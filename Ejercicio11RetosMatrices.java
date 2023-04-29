public class Ejercicio11RetosMatrices {
    public static Persona personaMenor(Persona[][] matrizPersonas) {

        Persona menor = matrizPersonas[0][0];
        for (int i = 0; i < matrizPersonas.length; i++) {
            for (int e = 0; e < matrizPersonas[i].length; e++) {
                if (matrizPersonas[i][e].edad < menor.edad) {
                    menor = matrizPersonas[i][e];
                }
            }
        }
        return menor;
    }


        public static void main(String[] args) {
            Persona[][] matrizPersonas = new Persona[3][3];
            matrizPersonas[0][0] = new Persona("Juan", 25);
            matrizPersonas[0][1] = new Persona("Maria", 30);
            matrizPersonas[0][2] = new Persona("Pedro", 35);
            matrizPersonas[1][0] = new Persona("Luis", 40);
            matrizPersonas[1][1] = new Persona("Ana", 20);
            matrizPersonas[1][2] = new Persona("Carla", 50);
            matrizPersonas[2][0] = new Persona("Pablo", 18);
            matrizPersonas[2][1] = new Persona("Sofia", 45);
            matrizPersonas[2][2] = new Persona("Jorge", 28);

            Persona menor = personaMenor(matrizPersonas);
            System.out.println("La persona menor es " + menor.nombre + " con " + menor.edad);
        }

}


class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}


//Cree una matriz nxn de objetos de tipo Persona cuyos atributo son nombre y edad.
// Cree una función para recibir una función de este tipo y devolver a la persona menor de la matriz.

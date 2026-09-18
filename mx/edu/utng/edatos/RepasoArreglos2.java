package mx.edu.utng.edatos;

public class RepasoArreglos2 {

    public static void main(String[] args) {
        String[][] nombres = new String[7][3];

        nombres[0][0] = "Jonathan Venancio";
        nombres[0][1] = "Aguilar Hernandez";
        nombres[0][2] = "18";

        nombres[1][0] = "JOSE EMMANUEL";
        nombres[1][1] = "ARREDONDO ESCALANTE";
        nombres[1][2] = "22";

        nombres[2][0] = "YANELI";
        nombres[2][1] = "SANCHEZ CARDENAS";
        nombres[2][2] = "19";

        System.out.println("--- Apellidos registrados ---");
        
        // Recorremos solo las filas que tienen datos (en este caso del 0 al 2)
        for (int i = 0; i < 3; i++) {
            // Imprimimos el valor de la columna 1 (apellidos)
            System.out.println(nombres[i][1]);
        }
    }
}
package libreria;

//import java.util.Scanner;

public class funciones {

    String[][] delete(String libros[][], String cod) {
        for (int i = 0; i < libros.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (cod.equals(libros[i][0])) {
                    libros[i][0] = "libro eliminado";
                    libros[i][1] = "libro eliminado";
                    libros[i][2] = "libro eliminado";
                    libros[i][3] = "libro eliminado";
                    libros[i][4] = "libro eliminado";

                    System.out.println("Libro eliminado con exito");
                }
            }
        }

        return libros;
    }

    String[][] update(String libros[][], int campo, int libro , String actualizacion) {
        try {
            for (int i = 0; i < libros.length; i++) {
                for (int j = 0; j < 5; j++) {   
                    libros[libro][campo] = actualizacion;  
                }
            }
            System.out.println("LIBRO ACTUALIZADO CON EXITO");
            
        }catch (Exception e) {
            System.err.println("");
        }
        return libros; 
    }

    String[][] table(String libros[][]) {

        for (int i = 0; i < libros.length; i++) {
            System.out.println("\nLIBRO N " + (i + 1) + " \n ");
            for (int j = 0; j < 5;) {
                System.out.println("Codigo : " + libros[i][0]);
                j++;

                System.out.println("Nombre : " + libros[i][1]);
                j++;

                System.out.println("Autor :" + libros[i][2]);
                j++;

                System.out.println("Materia :" + libros[i][3]);
                j++;

                System.out.println("Numero de paginas :" + libros[i][4]);
                j++;
            }

        }
        return libros;
    }

    void ordenamiento(int opc, int col, String libros[][]) {
        System.out.println("vant " + libros.length);

        switch (opc) {
            //Método burbuja
            case 1:
                String[] auxiliar = new String[libros.length];

                for (int i = 0; i < libros.length; i++) {
                    for (int j = 0; j < libros.length - 1; j++) {
                        if (libros[j][col].compareTo(libros[j + 1][col]) > 0) {
                            auxiliar = libros[j];
                            libros[j] = libros[j + 1];
                            libros[j + 1] = auxiliar;
                        }
                    }
                }

                System.out.println("Productos ordenados: ");

                for (int i = 0; i <= libros.length - 1; i++) {
                    System.out.println(libros[i][0] + ", " + libros[i][1] + ", " + libros[i][2] + ", " + libros[i][3] + ", " + libros[i][4]);
                }
                break;
            //Método Inserción
            case 2:
                String aux[] = new String[libros.length];
                int pos = 0;

                for (int i = 0; i < libros.length; i++) {
                    for (int j = 0; j < 4; j++) {
                        pos = i;
                        aux = libros[i];

                        if ((libros[pos + 1][col].charAt(0) > libros[pos][col].charAt(0))) {
                            aux = libros[pos];
                        }

                    }
                    System.out.println(aux);
                }
                break;
            //Metodo de Seleccion
            case 3:
                String auxx = "";
                int minimo = 0;

                for (int i = 0; i < libros.length; i++) {
                    minimo = i;
                    for (int j = i + 1; j < libros.length; j++) {
                        if (libros[j][col].compareTo(libros[minimo][col]) > 0) {
                            minimo = j;
                        }
                    }
                    /*auxx = libros[i];
                    libros[i] = libros[minimo];
                    libros[minimo] = auxx;*/
                }

                break;

        }

    }
}
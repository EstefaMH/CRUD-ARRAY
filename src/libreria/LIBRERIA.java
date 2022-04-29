package libreria;

import java.util.Scanner;

public class LIBRERIA {

    public static void main(String[] args) {

        // DECLARACION DE MATRIZ PARA GUARDAR DATOS 
        String libros[][] ;

        // CREACION OBJETO PARA LA CLASE funciones
        
        funciones fx = new funciones();
        //CLASE PARA LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        int menu;
        int add;

        System.out.println("----------------------- BIENVENIDO A LA BIBLIOTECA -------------------");
        System.out.println("Cuantos libros desea agregar : ");
        add = sc.nextInt();
        libros = new String[add][5];
        insert(libros, add);
        

        // MENU DE OPCIONES
        do {

            System.out.println("----------------------- BIENVENIDO A LA BIBLIOTECA -------------------");
            System.out.println("1. Borrar un libro");
            System.out.println("2. Actualizar un libro");
            System.out.println("3. Ver la biblioteca de libros");
            System.out.println("4. Ordenar los libros\n");
            System.out.println("SELECCIONE UNA OPCION");

            //LECTURA DE OPCION SELECCIONADA
            int opc = sc.nextInt();
            int seg = 0;

            switch (opc) {

                case 1:

                case 2:
                    System.out.println("cant" + libros.length );
                    break;

                case 3:
                    fx.table(libros);
                    break;

                case 4:

                    System.out.print("Desde cual campo va a organizar los datos: ");
                    System.out.println("0. Codigo");
                    System.out.println("1. Nombre");
                    System.out.println("2. Autor");
                    System.out.println("3. Materia");
                    System.out.println("4. N de paginas");
                    int col = sc.nextInt();

                    System.out.println("\n---- METODO ---- ");
                    System.out.println("1. Burbuja");
                    System.out.println("2. Insercion");
                    System.out.println("3. Seleccion\n");
                    System.out.println("Ingrese una opcion");
                    int opt = sc.nextInt();

                    fx.ordenamiento(opt , col , libros);
                    break;

                default:
                    System.out.println("La opcion seleccionada es incorrecta");

            }

            System.out.println("Desea volver al menu principal   1. si     2.no");
            menu = sc.nextInt();

        } while (menu == 1);
    }

    public static String[][] insert(String libros[][], int add) {

        //DECLARACION DE SCANNER 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < add; i++) {
            System.out.println("\nLIBRO N " + (i+ 1) + " \n ");
            for (int j = 0; j < 5;) {
                System.out.println("Ingrese el codigo :");
                libros[i][0] = sc.next();
                j++;

                System.out.println("Ingrese el nombre :");
                libros[i][1] = sc.next();
                j++;

                System.out.println("Ingrese el autor :");
                libros[i][2] = sc.next();
                j++;

                System.out.println("Ingrese la materia :");
                libros[i][3] = sc.next();
                j++;

                System.out.println("Ingrese el numero de paginas :");
                libros[i][4] = sc.next();
                j++;
            }
        }
        return libros;
    }

}

package libreria;

import java.util.Scanner;
import org.omg.CORBA.AnySeqHelper;

public class LIBRERIA {

    public static void main(String[] args) {

        //CLASE PARA LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);

        // DECLARACION DE MATRIZ PARA GUARDAR DATOS 
        String libros[][] = new String[100][5];
        
        
        funciones fx = new funciones();
        
        
        int menu = 0;

        // MENU DE OPCIONES
        do {
            System.out.println("----------------------- BIENVENIDO A LA BIBLIOTECA -------------------");
            System.out.println("1. Ingresar nuevo libro");
            System.out.println("2. Borrar un libro");
            System.out.println("3. Actualizar un libro");
            System.out.println("4. Ver la biblioteca de libros\n");
            System.out.println("SELECCIONE UNA OPCION");

            //LECTURA DE OPCION SELECCIONADA
            int opc = sc.nextInt();
            int seg = 0;
            int cantidad = 0;
           

            switch (opc) {

                case 1:
                        
                    do {
                        fx.insert();
                        System.out.println("Desea agregar mas libros :    1. si   2. no");
                        seg = sc.nextInt();
                    } while (seg == 1);
                    
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                  /*  for (int i = 0; i < cantidad; i++) {
                        System.out.println("LIBRO N " + (i + 1) + " \n ");
                        for (int j = 0; j < 5;) {
                            System.out.println("Codigo :" + );
                            j++;

                            System.out.println("Nombre :" + libros[i][1]);
                            j++;

                            System.out.println("Autor :" + libros[i][2]);
                            j++;

                            System.out.println("Materia :" + libros[i][3]);
                            j++;

                            System.out.println("Numero de paginas :" + libros[i][4]);
                            j++;

                        }
                    }
                    break;
                    */
                    
                    fx.table();
                    break;
                
                default:
                    System.out.println("La opcion seleccionada es incorrecta");

            }

            System.out.println("Desea volver al menu principal   1. si     2.no");
            menu = sc.nextInt();

        } while (menu == 1);
    }


}

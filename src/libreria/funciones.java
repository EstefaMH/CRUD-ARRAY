package libreria;

import java.util.Scanner;

public class funciones {

    int add;
    int cantidad =0;
    String libros[][] = new String[100][5];

    String[][] insert() {

        //DECLARACION DE SCANNER 
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos libros desea agregar : ");
        add = sc.nextInt();
        

        for (int i = 0 ; i < add ; i++) {
            System.out.println("\nLIBRO N " + (cantidad+1) + " \n ");
            for (int j = 0; j < 5;) {
                System.out.println("Ingrese el codigo :");
                libros[cantidad][0] = sc.next();
                j++;

                System.out.println("Ingrese el nombre :");
                libros[cantidad][1] = sc.next();
                j++;

                System.out.println("Ingrese el autor :");
                libros[cantidad][2] = sc.next();
                j++;

                System.out.println("Ingrese la materia :");
                libros[cantidad][3] = sc.next();
                j++;

                System.out.println("Ingrese el numero de paginas :");
                libros[cantidad][4] = sc.next();
                j++;
            }
            cantidad++;
        }
        return libros;
    }                            

    /*  String[][] delete() {

        return libros;
    }

    String[][] update() {

        return libros;
    }*/
    String[][] table() {
        System.out.println("can"+cantidad);
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nLIBRO N " + (i+1)  + " \n ");
            for (int j = 0; j < 5;) {
                System.out.println("Ingrese el codigo : " + libros[i][0]);
                j++;

                System.out.println("Ingrese el nombre : " + libros[i][1]);
                j++;

                System.out.println("Ingrese el autor :" + libros[i][2]);
                j++;

                System.out.println("Ingrese la materia :" + libros[i][3]);
                j++;

                System.out.println("Ingrese el numero de paginas :" + libros[i][4]);
                j++;
            }
             
        }
        return libros;
    }
}     

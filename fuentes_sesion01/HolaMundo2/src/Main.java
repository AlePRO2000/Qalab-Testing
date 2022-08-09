import java.util.Scanner;  //Importando una libreria para agregar más funcionalidades
//nextLine, nextInt, nextDouble

//TIP: Una buena práctica de programación es declarar variables e inicializarlas siempre.

public class Main {
    public static void main(String[] args) {
        //Codigo requerido para usar la funcionalidad de ingreso de valores
        Scanner cmd = new Scanner(System.in); //Crea un objeto "cmd" para acceder a la consola
        String nombre = ""; //Declaramos una variable "nombre" y asigmos vacio
        String claveIngresada = "";
        String claveSystema = "1234";

        //Solicito la clave:
        System.out.println("Ingresa la clave del Sistema");
        claveIngresada = cmd.nextLine();
        if(claveIngresada.contentEquals(claveSystema) == true){  //COMPARANDO LA CLAVE INGRESADA VS LA REGISTRADA
            System.out.println("Acceso Correcto");
            //Solicitar al Usuario su nombre
            System.out.println("Ingresa tu nombre");
            nombre = cmd.nextLine(); // cambiando el valor de "nombre" con el valor ingresado por el usuario


            //Imprimo en pantalla un saludo
            System.out.println("Hola " + nombre + "!!! Bienvenido");

            //Impromo en pantalla que ingrese su edad
            System.out.println();
            System.out.println("\nIngresa tu edad");
            int edad = cmd.nextInt();
            System.out.println("Tu edad ingresada es: " + edad);
        }else{
            System.out.println("Acceso Denegado");
        }



    }
}
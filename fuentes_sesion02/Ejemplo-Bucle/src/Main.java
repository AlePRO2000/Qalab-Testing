public class Main {
    public static void main(String[] args) {

        //CODIGO QUE SE REPETIRA UN NUMERO DE VECES
        //UNA ESTRUCTURA DE CONDICION DE REPETICION
        //TIPOS DE BUCLES:
        //While
        //Do-While
        //For

        int edad = 0;

        //Primero Evalua y luego Ejecuta:
        while (edad > 0 ){
            edad = edad -1;
            System.out.println("Hello world!");
        }

        //Primero ejecuta 1 Vez y luego evalua:
        do{
            edad = edad -1;
            System.out.println("Hello world!");
        }while (edad > 0 );
    }
}
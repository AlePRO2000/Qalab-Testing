public class Main {
    public static void main(String[] args) {
        String nombre = "Hola a todos!";

        System.out.println(nombre.length());
        System.out.println(nombre.substring(7));
        System.out.println(nombre.substring(7,13));
        System.out.println(nombre.substring(0,1));

        System.out.println(nombre.substring(nombre.indexOf("to")));

        //Buscar los espacios, y contar palabras.
        //Texto con espacios y vacios


    }
}
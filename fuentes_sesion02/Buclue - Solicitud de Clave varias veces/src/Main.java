import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        String sClaveIngresada = "";
        String sClaveAlmacenada = "123456";
        boolean bClaveOK = false;


        //Primero muestre un mensaje solicitando una clave
        //Reciba la clave
        //Comparar con la clave almacenada
        //Si la clave es correcta: Mostrar mensaje de OK
        //Si es incorrecta, nuevamente va a solicitar la clave.


        do {
            System.out.println("Ingrese su Clave");
            sClaveIngresada = cmd.nextLine();
            if (sClaveIngresada.equals(sClaveAlmacenada)) {
                bClaveOK = true;
            } else {
                bClaveOK = false;
                System.out.println("Clave Incorrecta.");
            }
        }while(bClaveOK == false);

        if(bClaveOK){
            System.out.println("Bienvenido al Sistema XYZ");
        }


    }
}
public class Main {
    public static void main(String[] args) {

      String nombres[][] = {
           //  [i][j]
           //  0        1       2
           {"jose", "maria", "raul"},     //0   ... nombres[0]
           {"jean", "vicente", "lucia"},  //1   ... nombres[1]
           {"junior", "saul", "laura"}    //2   ... nombres[2]
      };
        //saul: System.out.println(nombres[2][1]);


        //for(int j=0;j<nombres[0].length;j++){
        //    System.out.println(nombres[0][j]);
        //}


        for(int i=0;i< nombres.length;i++){ //Primero i=0

            for(int j=0;j<nombres[i].length;j++){ //Para i = 1, j = 0 .... j=1..... j=2
                System.out.println(nombres[i][j]);
            }
            System.out.println();
        }


    }
}
public class Main {

    public static void main(String[] args) {

        Aritmetica arithmetic1 = new Aritmetica();
        System.out.println("arithmetic1 a: " + arithmetic1.a);
        System.out.println("arithmetic1 b: " + arithmetic1.b);


        Aritmetica arithmetic2 = new Aritmetica(5,8);
        System.out.println("arithmetic2 a: " + arithmetic2.a);
        System.out.println("arithmetic2 b: " + arithmetic2.b);

        /*arithmetic1.a=1;
        arithmetic1.b=2;
        
        arithmetic1.sumar();
        int result_Multi = arithmetic1.multiplicar(4,5);
        System.out.println("el resultado de la multiplicacion es = " + result_Multi);*/


    }

}

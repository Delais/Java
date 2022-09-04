public class Main {

    public static void main(String[] args) {

        Aritmetica arithmetic1 = new Aritmetica();

        arithmetic1.a=1;
        arithmetic1.b=2;
        
        arithmetic1.sumar();
        int result_Multi = arithmetic1.multiplicar();
        System.out.println("el resultado de la multiplicacion es = " + result_Multi);
    }

}

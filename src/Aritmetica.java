public class Aritmetica {

    //Atributos de la clase
    int a,b;


    // sobrecarga de constructores
    //Constructor vacio
    public Aritmetica() {
        System.out.println("Esto se esta ejecutando desde el constructor");
    }

    // Contructor con arg
    public Aritmetica(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Esto se esta ejecutando desde el constructor con arg");
    }
    //Metodos
    public void sumar() {
        int resultado = a+b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public int multiplicar(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return this.a * this.b;
    }
}

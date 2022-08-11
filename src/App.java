public class App {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.agregarpuerta();
        System.out.println(miCoche.puertas);

        var valor = suma(2, 4,6);
         System.out.println(valor);
    }


    public static int suma ( int a, int b, int c){
    return a + b + c; 
}
}


class coche {
    public int puertas = 5;

    public void agregarpuerta(){
        this.puertas ++;
    }
}
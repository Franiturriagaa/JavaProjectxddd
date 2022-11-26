public class App {
    public static void main(String[] args) {
       var resultado = suma(5,8,7);
       System.out.println("suma: " + resultado);
       Coche miCoche = new Coche();
       miCoche.AnadirPuerta();
       System.out.println("puertas: " + miCoche.puertas);

    }
   public static int suma(int a, int b, int c) {
    return a+b+c;
   }
}
class Coche {
    public int puertas = 5;

    public void AnadirPuerta(){
        this.puertas++;
    }
}


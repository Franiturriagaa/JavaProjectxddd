public class App2 {
    public static void main(String[] args) {
       var estacion = "Verano";
       switch(estacion) {
        case "Verano":
        System.out.println("es verano");
        break;
        case "verano":
        System.out.println("es verano");
        break;
        case "Invierno":
        System.out.println("es invierno");
        break;
        default:
        System.out.println("te haces el chistoso?");
       }
    }
}

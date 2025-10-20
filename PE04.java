import java.util.Scanner;
public class PE04 {
    public static void main(String[] args) {
    boolean menu = true;
    String cmenu, menullums ="";
    Scanner entrada = new Scanner(System.in);
    while (menu) {
    System.out.println("SELECCIONA LA TEMÀTICA:");
    cmenu = entrada.nextLine();
    switch (cmenu) {
        case "llums":
            System.out.println("Que vols fer?");
            System.out.println("A) Engegar/Apagar a una habitació");
            System.out.println("B) Engegar/Apagar a totes les habitacions");
            System.out.println("C) Veure l'estat de les llums");

            menullums = entrada.nextLine();
            switch (menullums) {
                case "a" :
                    
                    break;
            
                default:
                    break;
            }
            break;
    
        default:
            break;
    }
        
    }    
    }
}

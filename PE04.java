import java.util.InputMismatchException;
import java.util.Scanner;
public class PE04 {
    static boolean cuina = false;
    static boolean h1 = false;
    static boolean h2 = false;
    static boolean wc = false;
    static boolean menjador= false;
    static boolean h3 = false;
    public static void main(String[] args) {
    boolean menu = true;
    boolean exitllums = false;
    String cmenu ="", menullums ="";
    String triarhabitacio ="";
    String onOff ="";
    Scanner entrada = new Scanner(System.in);
   
    do {
    System.out.println("SELECCIONA LA TEMÀTICA:");
    try {
    cmenu = entrada.nextLine();
    }
    catch (InputMismatchException e) {
            System.out.println("Introdueix valors vàlids");
    }
    catch (Exception e) {
            System.out.println("Error inesperat");
    }
    switch (cmenu) {
        case "llums":
            System.out.println("Que vols fer?");
            System.out.println("A) Engegar/Apagar a una habitació");
            System.out.println("B) Engegar/Apagar a totes les habitacions");
            System.out.println("C) Veure l'estat de les llums");
            System.out.println("D) Tornar enrere");

            try {
            menullums = entrada.nextLine();
            }
            catch (InputMismatchException e) {
            System.out.println("Introdueix valors vàlids");
            }
            catch (Exception e) {
            System.out.println("Error inesperat");
            }
            switch (menullums) {
                case "a" :
                    do {
                        System.out.println("Amb quina habitació vols interactuar? (escriu exit per sortir)");
                        System.out.println("Cuina /Menjador /Habitació 1 /Habitació 2 / Habitació 3/ wc");
                        try{
                        triarhabitacio = entrada.nextLine();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");
                        } 
                        if (triarhabitacio.equals("exit")) {
                            exitllums = true;
                            break;
                        }
                        System.out.println("Vols engegar o apagar? (on/off)");
                        try{
                        onOff = entrada.nextLine();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");
                        }  
                        unallum(triarhabitacio, onOff);
                        
                        
                    }
                    while (!exitllums);
                break;
            case "b": 
                        System.out.println("Vols engegar o apagar? (on/off)");
                        try{
                        onOff = entrada.nextLine();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");}
                        totesLlums (onOff);
            case "c":
                    veureEstat();
                default:
                    break;
            }
            break;
    
        default:
            break;
    }
        
    }
    while (menu);    
    }
    public static void unallum(String a, String b) {
    if (a.equalsIgnoreCase("Cuina") && b.equals("on")) {
        cuina = true;
    } else if (a.equalsIgnoreCase("Cuina") && b.equals("off")) {
        cuina = false;
    } else if (a.equalsIgnoreCase("Menjador") && b.equals("on")) {
        menjador = true;
    } else if (a.equalsIgnoreCase("Menjador") && b.equals("off")) {
        menjador = false;
    } else if (a.equalsIgnoreCase("Habitació 1") && b.equals("on")) {
        h1 = true;
    } else if (a.equalsIgnoreCase("Habitació 1") && b.equals("off")) {
        h1 = false;
    } else if (a.equalsIgnoreCase("Habitació 2") && b.equals("on")) {
        h2 = true;
    } else if (a.equalsIgnoreCase("Habitació 2") && b.equals("off")) {
        h2 = false;
    } else if (a.equalsIgnoreCase("Habitació 3") && b.equals("on")) {
        h3 = true;
    } else if (a.equalsIgnoreCase("Habitació 3") && b.equals("off")) {
        h3 = false;
    } else if (a.equalsIgnoreCase("wc") && b.equals("on")) {
        wc = true;
    } else if (a.equalsIgnoreCase("wc") && b.equals("off")) {
        wc = false;
    }
    if (a.equalsIgnoreCase("Cuina") || a.equalsIgnoreCase("wc") || a.equalsIgnoreCase("Habitació 1") || a.equalsIgnoreCase("Habitació 2") || a.equalsIgnoreCase("Menjador") || a.equalsIgnoreCase("Habitactó 3")) {
    if (b.equals("on")){
    b = "encesos";
    
    }
    if (b.equals("off")){
    b = "apagats";
    }
    System.out.println("L'habitació " + a + " ara te els llums " + b + ".");
    }
    else {
        System.out.println("Introdueix un paràmetre vàlid");
    }
    
}
    public static void totesLlums(String status){
        if (status.equals("on")){
        cuina = true;
        menjador = true;
        h3 =  true;
        h1 = true;
        h2 = true;
        wc = true;
        System.out.println("Totes les llums s'han encés correctament");
    }
    else if (status.equals("off")){
        cuina = false;
        menjador = false;
        h3 =  false;
        h1 = false;
        h2 = false;
        wc = false;
        System.out.println("Totes les llums s'han apagat correctament");
    }}
    public static void veureEstat() {
    System.out.println("Estat actual de les llums:");
    System.out.println("Cuina: " + (cuina ? "encesa" : "apagada"));
    System.out.println("Menjador: " + (menjador ? "encesa" : "apagada"));
    System.out.println("Habitació 1: " + (h1 ? "encesa" : "apagada"));
    System.out.println("Habitació 2: " + (h2 ? "encesa" : "apagada"));
    System.out.println("Habitació 3: " + (h3 ? "encesa" : "apagada"));
    System.out.println("WC: " + (wc ? "encesa" : "apagada"));
}


    }


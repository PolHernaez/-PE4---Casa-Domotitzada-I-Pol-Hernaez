import java.util.InputMismatchException;
import java.util.Scanner;
public class PE04 {
    static boolean cuina;
    static boolean h1;
    static boolean h2;
    static boolean wc;
    static boolean menjador;
    static boolean h3;
    public static void main(String[] args) {
    boolean menu = true;
    boolean exitllums = false;
    String cmenu ="", menullums ="";
    String triarhabitacio ="";
    String onOff ="";
    Scanner entrada = new Scanner(System.in);
   
    boolean totesLlums = false;
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
                    while (exitllums);
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
    if (a.equals("Cuina") || a.equals("wc") || a.equals("Habitació 1") || a.equals("Habitació 2") || a.equals("Menjador") || a.equals("Habitactó 3")) {
    if (b.equals("on")){
    b = "encesos";
    }
    if (b.equals("off")){
    b = "apagats";
    }
    System.out.println("L'habitació " + a + " ara te les llums " + b + ".");
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
    }
    }


    }


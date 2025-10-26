import java.util.InputMismatchException;
import java.util.Scanner;
public class PE04 {
    static boolean cuina = false;
    static boolean h1 = false;
    static boolean h2 = false;
    static boolean wc = false;
    static boolean menjador= false;
    static boolean h3 = false;
    static String triarhabitacio ="";
    static Scanner entrada = new Scanner(System.in);
    static boolean exitllums = false;
    static String reprodueix;
    static String elementReproduir;
    static boolean sortirHabitacio = false;
    static String queReproduir;
    public static void main(String[] args) {
    boolean menu = true;
    
    String cmenu ="", menullums ="";
    
    String onOff ="";
   boolean musica = true;
   boolean llumsmenu = true;
    do {
    System.out.println("SELECCIONA LA TEMÀTICA:");
    System.out.println("(llums/musica)");
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
            do {
            llumsmenu = true;
            System.out.println("Què vols fer?");
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
                        exitllums = false;
                        chooseRoom();
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
                        break;
            case "c":
                    veureEstat();
                    break;
            case "d":
                    llumsmenu = false;
                default:
                    break;
                        }
            }
            while (llumsmenu);
            break;
        case "musica":
        
            musica = true;
            do {
                 sortirHabitacio = false;
            chooseRoom();
            if (triarhabitacio.equals("exit")) {
                            musica = false;
                            break;
            }
            do {
               
            System.out.println("Que vols reproduir?");
            System.out.println("A) Reproduir una cançó en concret");
            System.out.println("B) Reproduir un àlbum en concret");
            System.out.println("C) Reproduir un artista en concret");
            System.out.println("D) Reproduir música aleatòria");
            System.out.println("E) Tornar enrere");
            System.out.println("(a/b/c/d/e)");
            try {
            reprodueix = entrada.nextLine();
            }
            catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");
                        } 
                switch (reprodueix) {
                    case "a":
                        
                        System.out.println("Quina cançó vols que soni?");
                        queReproduir = "la cançó";
                        menuMusica (queReproduir);
                        break;
                    case "e":
                    sortirHabitacio = true;
                    break;

                    case "b":
                    System.out.println("Quin àlbum vols que soni?");
                        queReproduir = "l'àlbum";
                    menuMusica (queReproduir);
                        break;
                    case "c":
                    System.out.println("Quin artista vols escoltar?");
                    queReproduir = "l'artista";
                    menuMusica (queReproduir);
                    break;
                    case "d":
                    System.out.println("S'està reproduint música aleatòria a " + triarhabitacio);
                    break;

                    default:
                    System.out.println("Escriu una lletra vàlida");
                        break;
                }
            } while (!sortirHabitacio) ;
                
            
            }
            while (musica);
             
        default:
        System.out.println("Escriu una opció vàlida");
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
    } else if (a.equalsIgnoreCase("Habitacio1") && b.equals("on")) {
        h1 = true;
    } else if (a.equalsIgnoreCase("Habitacio1") && b.equals("off")) {
        h1 = false;
    } else if (a.equalsIgnoreCase("Habitacio2") && b.equals("on")) {
        h2 = true;
    } else if (a.equalsIgnoreCase("Habitacio2") && b.equals("off")) {
        h2 = false;
    } else if (a.equalsIgnoreCase("Habitacio3") && b.equals("on")) {
        h3 = true;
    } else if (a.equalsIgnoreCase("Habitacio3") && b.equals("off")) {
        h3 = false;
    } else if (a.equalsIgnoreCase("wc") && b.equals("on")) {
        wc = true;
    } else if (a.equalsIgnoreCase("wc") && b.equals("off")) {
        wc = false;
    }
    if (a.equalsIgnoreCase("Cuina") || a.equalsIgnoreCase("wc") || a.equalsIgnoreCase("Habitacio1") || a.equalsIgnoreCase("Habitacio2") || a.equalsIgnoreCase("Menjador") || a.equalsIgnoreCase("Habitacio3")) {
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
        System.out.println("Totes les llums s'han encès correctament");
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
    if (cuina) {
    System.out.println("Cuina: encesa");
    } else {
    System.out.println("Cuina: apagada");
    }

    if (menjador) {
    System.out.println("Menjador: encesa");
    } else {
    System.out.println("Menjador: apagada");
    }

    if (h1) {
    System.out.println("Habitació1: encesa");
    } else {
    System.out.println("Habitació1: apagada");
    }

    if (h2) {
    System.out.println("Habitació2: encesa");
    } else {
    System.out.println("Habitació2: apagada");
    }

    if (h3) {
    System.out.println("Habitació3: encesa");
    } else {
    System.out.println("Habitació3: apagada");
    }

    if (wc) {
    System.out.println("WC: encesa");
    } else {
    System.out.println("WC: apagada");
    }

}
    public static void chooseRoom () {
        System.out.println("Amb quina habitació vols interactuar? (escriu exit per sortir)");
                        System.out.println("Cuina /Menjador /Habitacio1 /Habitacio2 / Habitacio3/ wc");
                        try{
                        triarhabitacio = entrada.nextLine();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");
                        } 
                        
                        
    }
    public static void menuMusica (String a) {
        try {
                        elementReproduir= entrada.nextLine();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Introdueix valors vàlids");
                        }
                        catch (Exception e) {
                        System.out.println("Error inesperat");
                        } 
                        System.out.println();
                        System.out.println("Està sonant " + a + " "+ elementReproduir + " a l'habitació "+ triarhabitacio);
    }
    }


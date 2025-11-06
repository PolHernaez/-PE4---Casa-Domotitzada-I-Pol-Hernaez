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
    static int rajoles;
    static boolean netCuina = false;
    static boolean netMenjador = false;
    static boolean netWc = false;
    static boolean netH1 = false;
    static boolean netH2 = false;
    static boolean netH3 = false;
    static String netBrut = "";
    static int temperatura = 0;
    static int tempCuina = 21;
    static int tempMenjador = 22;
    static int tempWC = 20;
    static int tempH1 = 19;
    static int tempH2 = 23;
    static int tempH3 = 18;
    static int novaTemp = 0;
    static int tempsMins = 0;
    static int tempsHores = 0;
    static int tempsSegons = 0;
    public static void main(String[] args) {
    boolean menu = true;
    
    String cmenu ="", menullums ="";
    
    String onOff ="";
   boolean musica = true;
   boolean llumsmenu = true;
    do {
    System.out.println("SELECCIONA LA TEMÀTICA:");
    System.out.println("(llums/musica/roomba/temperatura)");
    boolean correcteCmenu = false;
    do {
        try {
            cmenu = entrada.nextLine();
            correcteCmenu = true;
        }
        catch (InputMismatchException e) {
            System.out.println("Introdueix valors vàlids");
            entrada.nextLine();
        }
        catch (Exception e) {
            System.out.println("Error inesperat");
            entrada.nextLine();
        }
    } while (!correcteCmenu);
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
                         boolean correcteOnOff = false;
                        do {
                            try {
                                onOff = entrada.nextLine();
                                correcteOnOff = true;
                            }
                            catch (InputMismatchException e) {
                                System.out.println("Introdueix valors vàlids");
                                entrada.nextLine();
                            }
                            catch (Exception e) {
                                System.out.println("Error inesperat");
                                entrada.nextLine();
                            }
                        } while (!correcteOnOff);
                        
                        unallum(triarhabitacio, onOff);
                    }
                    while (!exitllums);
                break;
            case "b": 
                        System.out.println("Vols engegar o apagar? (on/off)");
                        boolean correcteOnOff2 = false;
                        do {
                            try {
                                onOff = entrada.nextLine();
                                correcteOnOff2 = true;
                            }
                            catch (InputMismatchException e) {
                                System.out.println("Introdueix valors vàlids");
                                entrada.nextLine();
                            }
                            catch (Exception e) {
                                System.out.println("Error inesperat");
                                entrada.nextLine();
                            }
                        } while (!correcteOnOff2);
                        totesLlums(onOff);
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
            System.out.println("E) Pausar la reproducció");
            System.out.println("F) Tornar enrere");
            System.out.println("(a/b/c/d/e/f)");
            boolean correcteReprodueix = false;
            do {
                try {
                    reprodueix = entrada.nextLine();
                    correcteReprodueix = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Introdueix valors vàlids");
                    entrada.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Error inesperat");
                    entrada.nextLine();
                }
            } while (!correcteReprodueix);
                switch (reprodueix) {
                    case "a":
                        
                        System.out.println("Quina cançó vols que soni?");
                        queReproduir = "la cançó";
                        menuMusica (queReproduir);
                        break;
                    case "f":
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

                    case "e":
                    System.out.println("S'ha pausat la música a " + triarhabitacio);
                    System.out.println();
                    break;

                    default:
                    System.out.println("Escriu una lletra vàlida");
                        break;
                }
            } while (!sortirHabitacio) ;
             
            
            }
            while (musica);
            break;
        case "roomba":
        boolean menuRoomba = true;
        boolean menuRoomba2 = true;    
                   
            do {
                menuRoomba2 = false;
               System.out.println("Que vols fer?");
            System.out.println("A) Veure l'estat de la sala");
            System.out.println("B) Natejar habitació");
            System.out.println("C) Programar temps de nateja a una habitació");
            System.out.println("D) Enrere");
            System.out.println("(a/b/c)");
            String ferRoomba = "";
            boolean correcteFerRoomba = false;
            do {
                try {
                    ferRoomba = entrada.nextLine();
                    correcteFerRoomba = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Introdueix valors vàlids");
                    entrada.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Error inesperat");
                    entrada.nextLine();
                }
            } while (!correcteFerRoomba);
            switch (ferRoomba) {
                case "a":
                do    {
            
            chooseRoom();
            menuRoomba2 = false;
            if (triarhabitacio.equals("exit")) {
                            menuRoomba2 = true;
                            break;
            }
            else if (!menuRoomba2){
                estatRoomba (triarhabitacio);
                System.out.println("La sala " + triarhabitacio + " està " + netBrut);
                System.out.println();
            }
            } while (!menuRoomba2);
            
                
                    break;
                case "b":
                do    {
            
            chooseRoom();
            menuRoomba2 = false;
            if (triarhabitacio.equals("exit")) {
                            menuRoomba2 = true;
                            break;
            }
            else if (!menuRoomba2){
                rajolesRoomba(triarhabitacio);
                recorregutRoomba(rajoles, triarhabitacio);
            }
            } while (!menuRoomba2);
                
                break;
                case "d":
                menuRoomba2 = false;
                menuRoomba = false;
                System.out.println();
                    break;
                case "c":          
                        do    {
            
            chooseRoom();
            menuRoomba2 = false;
            if (triarhabitacio.equals("exit")) {
                            menuRoomba2 = true;
                            break;
            }
            else if (!menuRoomba2){
                timer();
                
                rajolesRoomba(triarhabitacio);
            }
            } while (!menuRoomba2);
            menuRoomba2 = true;
                break;
                
            } 
           
            
            
        }               
        while (menuRoomba);
        break; 
        case "temperatura":
        boolean menuTemperatura = true;
        do {
        String ferTemperatura = "";
        System.out.println("Que vols fer?");
        System.out.println("A) Modificar la temperatura d'una habitació");
        System.out.println("B) Veure la temperatura de totes les habitacions");
        System.out.println("C) Modificar la temperatura de totes les habitacions");
        System.out.println("D) Tornar enrere");
        System.out.print("(a/b/c/d): ");
             boolean correcteFerTemperatura = false;
        do {
            try {
                ferTemperatura = entrada.nextLine();
                correcteFerTemperatura = true;
                
            }
            catch (InputMismatchException e) {
                System.out.println("Introdueix valors vàlids");
                entrada.nextLine();
            }
            catch (Exception e) {
                System.out.println("Error inesperat");
                entrada.nextLine();
            }
        } while (!correcteFerTemperatura);
            boolean menuTemperatura2 = true;
            do {
             switch (ferTemperatura) {
            
                case "a":
                    chooseRoom();
                    if (triarhabitacio.equals("exit")) {
                            menuTemperatura2 = false;
                            break;
                    }
                    System.out.println("Quina temperatura vols?");
                    
                    boolean correcteTemperatura = false;
                    do {
                        correcteTemperatura = false;
                        try {
                            temperatura = entrada.nextInt();
                            entrada.nextLine();
                            correcteTemperatura = true;
                            if (temperatura < 15 || temperatura > 30) {
                            System.out.println("Introdueix una temperatura entre 15 °C i 30 °C");
                            correcteTemperatura = false;
                            } else {
                            correcteTemperatura = true;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Introdueix valors vàlids");
                            entrada.nextLine();
                            
                        }
                        catch (Exception e) {
                            System.out.println("Error inesperat");
                            entrada.nextLine();
                        }
                    } while (!correcteTemperatura);
                    switch (triarhabitacio.toLowerCase()) {
                        
                    case "wc":
                    novaTemp = temperatura; 
                    canviTemperatura("WC", tempWC, novaTemp);
                    tempWC = temperatura;
                    
                    
                    break;
                    case "cuina":
                    novaTemp = temperatura;
                    canviTemperatura("Cuina", tempCuina, novaTemp);
                    tempCuina = temperatura;
                    break;

                     case "menjador":
                    novaTemp = temperatura;
                    canviTemperatura("Menjador", tempMenjador, novaTemp);
                    tempMenjador = novaTemp;
                    break;

                    case "habitacio1":
                    novaTemp = temperatura;
                    canviTemperatura("Habitació 1", tempH1, novaTemp);
                    tempH1 = novaTemp;
                    break;

                    case "habitacio2":
                    novaTemp = temperatura;
                    canviTemperatura("Habitació 2", tempH2, novaTemp);
                    tempH2 = novaTemp;
                    break;

                    case "habitacio3":
                    novaTemp = temperatura;
                    canviTemperatura("Habitació 3", tempH3, novaTemp);
                    tempH3 = novaTemp;
                    break;

                    case "exit":
                    System.out.println("Sortint de la modificació d’habitacions...");
                    break;

    default:
        System.out.println("Habitació no reconeguda. Torna-ho a provar.");
        break;
                    }
                break;
                case "b": 
                menuTemperatura2 = false;
                System.out.println("Cuina: " + tempCuina + "ºC");
                System.out.println("Menjador: " + tempMenjador + "ºC");
                System.out.println("Habitació 1: " + tempH1 + "ºC");
                System.out.println("Habitació 2: " + tempH2 + "ºC");
                System.out.println("Habitació 3: " + tempH3 + "ºC");
                System.out.println("WC: " + tempWC + "ºC");
                
                break;  

                case "c":
    boolean bucleTemp = true;
    do {
        System.out.println("Quina temperatura vols establir a totes les habitacions?");
        boolean correcteTempGlobal = false;
        do {
            try {
                temperatura = entrada.nextInt();
                
                if (temperatura < 15 || temperatura > 30) {
                    System.out.println("Introdueix una temperatura entre 15 °C i 30 °C");
                } else {
                    correcteTempGlobal = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introdueix valors vàlids");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperat");
                entrada.nextLine();
            }
        } while (!correcteTempGlobal);
        entrada.nextLine();

        canviTemperatura("Cuina", tempCuina, temperatura);
        canviTemperatura("Menjador", tempMenjador, temperatura);
        canviTemperatura("Habitació 1", tempH1, temperatura);
        canviTemperatura("Habitació 2", tempH2, temperatura);
        canviTemperatura("Habitació 3", tempH3, temperatura);
        canviTemperatura("WC", tempWC, temperatura);

        tempCuina = temperatura;
        tempMenjador = temperatura;
        tempH1 = temperatura;
        tempH2 = temperatura;
        tempH3 = temperatura;
        tempWC = temperatura;

        System.out.println("S'ha establert la temperatura de totes les habitacions a " + temperatura + "ºC.");

        String tempSiNo = "";
        boolean respostaValida = false;

        while (!respostaValida) {
            try {
                System.out.println("Vols sortir? (si/no)");
                tempSiNo = entrada.nextLine();
                if (tempSiNo.equalsIgnoreCase("si")) {
                    bucleTemp = false;
                    respostaValida = true;
                    System.out.println("Tornant al menú de temperatura...");
                    System.out.println();
                } else if (tempSiNo.equalsIgnoreCase("no")) {
                    respostaValida = true;
                    System.out.println("D'acord, pots introduir una nova temperatura.");
                    System.out.println();
                } else {
                    System.out.println("Posa només 'si' o 'no'");
                }
            } catch (Exception e) {
                System.out.println("Error en la lectura. Torna-ho a provar.");
                entrada.nextLine();
            }
        }
    } while (bucleTemp);
    menuTemperatura2 = false;
    break;


    
                case "d":     
                menuTemperatura2 = false;
                menuTemperatura= false;
                break;   
                default:
                    break;
            }   
            } while (menuTemperatura2);
            
        } while (menuTemperatura);

        

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
        boolean menuChooseRoom = false;
                        do {
        System.out.println("Amb quina habitació vols interactuar? (escriu exit per sortir)");
                        System.out.println("Cuina /Menjador /Habitacio1 /Habitacio2 / Habitacio3/ wc");
                        boolean correcteTriarHabitacio = false;
            do {
                try {
                    triarhabitacio = entrada.nextLine();
                    correcteTriarHabitacio = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Introdueix valors vàlids");
                    entrada.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Error inesperat");
                    entrada.nextLine();
                }
            } while (!correcteTriarHabitacio);
                        if (triarhabitacio.equalsIgnoreCase("Cuina") ||
            triarhabitacio.equalsIgnoreCase("Menjador") ||
            triarhabitacio.equalsIgnoreCase("Habitacio1") ||
            triarhabitacio.equalsIgnoreCase("Habitacio2") ||
            triarhabitacio.equalsIgnoreCase("Habitacio3") ||
            triarhabitacio.equalsIgnoreCase("wc") || triarhabitacio.equalsIgnoreCase("exit")) {
                        menuChooseRoom = true;    
                        }      
                        else {
                            System.out.println("Selecciona una habitació real");
                            
                        }
                    }    while (!menuChooseRoom);   
    }
    public static void menuMusica (String a) {
        boolean correcteElement = false;
        do {
            try {
                elementReproduir = entrada.nextLine();
                correcteElement = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Introdueix valors vàlids");
                entrada.nextLine();
            }
            catch (Exception e) {
                System.out.println("Error inesperat");
                entrada.nextLine();
            } 
        } while (!correcteElement);
                        System.out.println();
                        System.out.println("Està sonant " + a + " "+ elementReproduir + " a l'habitació "+ triarhabitacio);
    }
    public static void rajolesRoomba(String habitacio) {
    
    if (habitacio.equalsIgnoreCase("Cuina")) {
    rajoles = 40;
    netCuina = true;
    
} else if (habitacio.equalsIgnoreCase("Menjador")) {
     rajoles = 60;
     netMenjador = true;
} else if (habitacio.equalsIgnoreCase("Habitacio1")) {
     rajoles = 30;
     netH1 = true;
} else if (habitacio.equalsIgnoreCase("Habitacio2")) {
     rajoles = 25;
     netH2 = true;
} else if (habitacio.equalsIgnoreCase("Habitacio3")) {
     rajoles = 20;
     netH3 = true;
     
} else if (habitacio.equalsIgnoreCase("wc")) {
     rajoles = 15;
     netWc = true;
} else {
    System.out.println("Habitació no reconeguda.");
}
    
    }
public static void recorregutRoomba(int rajoles, String triarhabitacio) {
    System.out.println("Total de rajoles: " + rajoles);
    for (int i = 0; i <= rajoles; i++){
    System.out.println("Rajola " + i + " neta");
    }
    System.out.println("S'ha escombrat correctament " + triarhabitacio);
    System.out.println();
    
}
public static void estatRoomba(String habitacio) {   
if (habitacio.equalsIgnoreCase("cuina")) {
    estatTerra(netCuina);
} else if (habitacio.equalsIgnoreCase("menjador")) {
    estatTerra(netMenjador);
} else if (habitacio.equalsIgnoreCase("wc")) {
    estatTerra(netWc);
} else if (habitacio.equalsIgnoreCase("habitacio1")) {
    estatTerra(netH1);
} else if (habitacio.equalsIgnoreCase("habitacio2")) {
    estatTerra(netH2);
} else if (habitacio.equalsIgnoreCase("habitacio3")) {
    estatTerra(netH3);
}
}
public static void estatTerra(boolean habitacio) {
     if (habitacio) {
        netBrut = "neta";
    } else {
        netBrut = "bruta";
    }

    
    }
public static void canviTemperatura(String nomHabitacio, int tempActual, int novaTemp) {
    String pujarBaixar = "";

    if (novaTemp < tempActual) {
        pujarBaixar = "baixat";
        for (int i = tempActual - 1; i >= novaTemp; i --){
            System.out.println("Baixat a " + i + "º");
        }
    } else if (novaTemp > tempActual) {
        pujarBaixar = "augmentat";
        for (int i = tempActual+1; i <= novaTemp; i ++){
            System.out.println("Augmentat a " + i + "º");
        }
    } else {
        System.out.println("L'habitació " + nomHabitacio + " ja està a aquesta temperatura (" + tempActual + "ºC)");
        return;
    }
    

    System.out.println("La temperatura de " + nomHabitacio + " ha " + pujarBaixar +" de " + tempActual + "ºC a " + novaTemp + "ºC.");
}
public static void timer() {
    boolean errorTemps = false;
    do {
        System.out.print("Itrodueix les hores: ");
                boolean correcteHores = false;
            do {
                try {
                    tempsHores = entrada.nextInt();
                    entrada.nextLine();
                    correcteHores = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Introdueix valors vàlids");
                    entrada.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Error inesperat");
                    entrada.nextLine();
                }
            } while (!correcteHores);
                    if (tempsHores < 0 || tempsHores > 5) {
                        System.out.println("Escull entre 0 i 5 hores");
                        System.out.println();
                        errorTemps = true;
                    }
                    else {
                        errorTemps = false;
                    }
    } while (errorTemps);
                do {
                System.out.print("El programa ara dura " + tempsHores + " hores, quants minuts mès vols? ");
                boolean correcteMins = false;
            do {
                try {
                    tempsMins = entrada.nextInt();
                    entrada.nextLine();
                    correcteMins = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Introdueix valors vàlids");
                    entrada.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Error inesperat");
                    entrada.nextLine();
                }
            } while (!correcteMins);
                    if (tempsMins < 0 || tempsMins >= 60) {
                        System.out.println("Escull entre 0 i 59 minuts");
                        System.out.println();
                        errorTemps = true;
                    }
                    else {
                        errorTemps = false;
                    }    
                } while (errorTemps);
                        int hores = 0;
    for (int i = 0; i < tempsHores; i++){
        for (int y= 0; y < 60; y++){
        System.out.println(i + " hores i " + y + " Minuts");
        }
    hores++;
    }
    for (int y= 0; y <= tempsMins; y++){
        System.out.println(hores + " hores i " + y + " Minuts");
        }

    
}}
    
    


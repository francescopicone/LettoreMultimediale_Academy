package App;

import Classi.LettoreMultimediale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("########## BENVENUTO NEL LETTORE MULTIMEDIALE ##########");
        // Creo un lettore multimediale con una dimensione memoria (numero di elementi multimediali memorizzabili nell'array) = 5
        LettoreMultimediale lettore = new LettoreMultimediale(5);
        lettore.addElementiMultimediali();
        lettore.printElementi();


        int scelta;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci il numero corrispondente all'elemento da riprodurre (0 per uscire):  ");
            scelta = scanner.nextInt();
            lettore.riproduci(scelta);
        } while (scelta != 0);

        System.out.println("########## GRAZIE PER AVER UTILIZZATO IL LETTORE MULTIMEDIALE ##########");
    }
}
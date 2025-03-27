package Classi;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LettoreMultimediale {


    private ElementoMultimediale[] elementiMultimediali;

    public LettoreMultimediale(int dimensioneMemoria){
        this.elementiMultimediali = new ElementoMultimediale[dimensioneMemoria];
    }

    private ElementoMultimediale createElementoMultimediale() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci tipo di elemento (1: Immagine, 2: Audio, 3: Video): ");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci titolo: ");
            String titolo = scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci luminosita: ");
                    int luminositaImmagine = scanner.nextInt();
                    return new Immagine(titolo, luminositaImmagine);
                case 2:
                    System.out.println("Inserisci durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci volume: ");
                    int volumeAudio = scanner.nextInt();
                    return new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                case 3:
                    System.out.println("Inserisci durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci luminosita: ");
                    int luminositaVideo = scanner.nextInt();
                    return new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                default:
                    System.out.println("Scelta non valida, riprova.");
                    return null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Il dato inserito è errato: " + e.getMessage());
            return null;
        }
    }
    public void addElementiMultimediali(){
        for (int i = 0; i < elementiMultimediali.length; i++){
            elementiMultimediali[i] = createElementoMultimediale();
            if(elementiMultimediali[i] == null){
                i--;
            }
        }
    }

    public void riproduci(int numElemento){
        if (numElemento-1 < elementiMultimediali.length && numElemento > 0)
            elementiMultimediali[numElemento-1].esegui();
        else
            System.out.println("Elemento non esistente!");
    }

    public void printElementi(){
        System.out.println("########## ELEMENTI MULTIMEDIALI DISPONIBILI ##########");
        for (int i = 0; i < elementiMultimediali.length; i++){
            System.out.println("[Num. Elemento: " + (i+1) + "] " + elementiMultimediali[i].toString());
        }
    }

}

package Classi;

public class Video extends ElementoMultimediale implements Riproducibile, RegolabileVolume, RegolabileLuminosita {

    private int volume;
    private int durata;
    private int luminosita;
    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    @Override
    public void alzaVolume(int qt){
        if (this.volume + qt <= 100)
            this.volume += qt;
        else
            this.volume = 100;
    }
    @Override
    public void abbassaVolume(int qt){
        if(this.volume - qt >= 0)
            this.volume--;
        else
            this.volume = 0;
    }

    @Override
    public void aumentaLuminosita(int qt) {
        if(this.luminosita + qt <= 100)
            this.luminosita += qt;
        else
            this.luminosita = 100;
    }

    @Override
    public void diminuisciLuminosita(int qt) {
        if(this.luminosita - qt >= 0)
            this.luminosita -= qt;
        else
            this.luminosita = 0;
    }

    @Override
    public String toString(){
        return "Titolo: " + this.getTitolo() + " Durata: " + this.durata + " Tipo: " + getTipo();
    }

    @Override
    public String getTipo(){
        return "Video";
    }

    public void play(){
        for (int i = 0; i < durata; i++)
            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        play();
    }
}
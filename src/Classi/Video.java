package Classi;

public class Video extends ElementoMultimediale implements Riproducibile, RegolabileVolume, RegolabileLuminosita {


    private int durata;
    private int volume = 0;
    private int luminosita = 0;

    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo);
        setDurata(durata);
        aumentaLuminosita(luminosita);
        alzaVolume(volume);
    }

    @Override
    public void alzaVolume(int qt){
        if (this.volume + qt <= MAXVOLUME)
            this.volume += qt;
        else
            this.volume = MAXVOLUME;
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
        if(this.luminosita + qt <= MAXLUMINOSITA)
            this.luminosita += qt;
        else
            this.luminosita = MAXLUMINOSITA;
    }

    @Override
    public void diminuisciLuminosita(int qt) {
        if(this.luminosita - qt >= 0)
            this.luminosita -= qt;
        else
            this.luminosita = 0;
    }

    @Override
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public int getLuminosita() {
        return this.luminosita;
    }

    public int getVolume(){
        return this.volume;
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
package Classi;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolabileVolume {

    private int volume = 0;
    private int durata;
    public RegistrazioneAudio(String titolo, int durata, int volume){
        super(titolo);
        setDurata(durata);
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
    public int getDurata(){
        return this.durata;
    }

    @Override
    public void setDurata(int durata){
        this.durata = durata;
    }

    public int getVolume(){
        return this.volume;
    }

    @Override
    public String getTipo(){
        return "Registrazione Audio";
    }

    public void play(){
        for (int i = 0; i < durata; i++)
            System.out.println(getTitolo() + "!".repeat(volume));
    }

    @Override
    public String toString(){
        return "Titolo: " + this.getTitolo() + " Durata: " + this.durata + " Tipo: " + getTipo();
    }

    @Override
    public void esegui() {
        play();
    }
}

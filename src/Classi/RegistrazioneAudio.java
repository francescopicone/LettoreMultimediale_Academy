package Classi;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolabileVolume {

    private int volume;
    private int durata;
    public RegistrazioneAudio(String titolo, int durata){
        super(titolo);
        this.durata = durata;
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

    public int getDurata(){
        return this.durata;
    }

    public void setDurata(){
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

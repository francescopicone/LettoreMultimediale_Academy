package Classi;

public class Immagine extends ElementoMultimediale implements RegolabileLuminosita {

    private int luminosita = 0;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        aumentaLuminosita(luminosita);
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
    public int getLuminosita(){
        return this.luminosita;
    }

    @Override
    public String toString(){
        return "Titolo: " + this.getTitolo() + " Tipo: " + getTipo();
    }

    @Override
    public String getTipo(){
        return "Immagine";
    }

    private void show(){
        System.out.println(this.getTitolo() + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}

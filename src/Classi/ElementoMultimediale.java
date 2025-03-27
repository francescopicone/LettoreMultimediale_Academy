package Classi;

public abstract class ElementoMultimediale {

    private String titolo;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    public String getTitolo(){
        return this.titolo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public abstract String getTipo();
    public abstract void esegui();

}

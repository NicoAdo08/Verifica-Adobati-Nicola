package giocoPersonaggi;

public abstract class personaggio {
    protected String nome;
    protected int puntiVita;
    protected int livello;
    
    //Metodo utilizzato per inizializzare gli attributi della classe personaggio
    public personaggio(String nome, int puntiVita, int livello) {
        this.nome=nome;
        this.puntiVita=puntiVita;
        this.livello=livello;
    }
    //Metodo utilizzato per prendere il nome del personaggio
    public String getNome() {
        return nome;
    }
    //Metodo utilizzato per prendere i punti vita del personaggio
    public int getPuntiVita() {
        return puntiVita;
    }
    //Metodo utilizzato per prendere il livello del personaggio
    public int getLivello() {
        return livello;
    }

    //Metodo astratto per attaccare
    public abstract void attacca();
    //Metodo astratto per difendere
    public abstract void difendi();
}

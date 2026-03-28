package personaggio;

public abstract class personaggio {
    protected String nome;
    protected int puntiVita;
    protected int livello;
    
    //Costruttore per inizializzare gli attributi della classe personaggio
    public personaggio(String nome, int puntiVita, int livello) {
        this.nome=nome;
        this.puntiVita=puntiVita;
        this.livello=livello;
    }
    //Metodo astratto per attaccare
    public String attacca() {
        return nome + "attacca";
    }
    //Metodo astratto per difendere
    public String difendi() {
        return nome + "si difende";
    }
}

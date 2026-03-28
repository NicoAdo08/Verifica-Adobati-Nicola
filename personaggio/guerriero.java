package personaggio;

public class guerriero extends personaggio {
    
    //Costruttore per inizializzare gli attributi della classe guerriero
    public guerriero(String nome, int puntiVita, int livello) {
        super(nome, puntiVita, livello);
    }
    
    //Implementazione del metodo attacca() per il guerriero
    @Override
    public String attacca() {
        return nome +"attacca";
    }
    
    //Implementazione del metodo difendi() per il guerriero
    @Override
    public String difendi() {
        return nome +"si difende";
    }
    
}

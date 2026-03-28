package personaggio;

public class mago extends personaggio {
    //Costruttore per inizializzare gli attributi della classe guerriero
    public mago(String nome, int puntiVita, int livello) {
        super(nome, puntiVita, livello);
    }
    
    //Implementazione del metodo attacca() per il mago
    @Override
    public String attacca(){
        return nome+"attacca";
    }

    //Implementazione del metodo difendi() per il mago
    @Override
    public String difendi(){
        return nome+"si difende";
    }
}

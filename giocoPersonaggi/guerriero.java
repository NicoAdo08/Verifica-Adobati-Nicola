package giocoPersonaggi;

public class guerriero extends personaggio {
    
    //Costruttore per inizializzare gli attributi della classe guerriero
    public guerriero(String nome, int puntiVita, int livello) {
        super(nome, puntiVita, livello);
    }
    
    //Implementazione del metodo attacca() per il guerriero
    @Override
    public void attacca() {
        System.out.println(nome + "attacca");
    }
    
    //Implementazione del metodo difendi() per il guerriero
    @Override
    public void difendi() {
        System.out.println(nome + "si difende");
    }    
}

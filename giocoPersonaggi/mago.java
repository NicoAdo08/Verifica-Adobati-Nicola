package giocoPersonaggi;

public class mago extends personaggio {
    //Costruttore per inizializzare gli attributi della classe guerriero
    public mago(String nome, int puntiVita, int livello) {
        super(nome, puntiVita, livello);
    }

    //Implementazione del metodo attacca() per il mago
    @Override
    public void attacca(){
        System.out.println(nome+ "attacca");
    }

    //Implementazione del metodo difendi() per il mago
    @Override
    public void difendi(){
        System.out.println(nome+ "si difende");
    }
}

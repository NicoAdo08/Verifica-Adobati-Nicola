package giocoUtils;
import giocoPersonaggi.*;   //Il simbolo "*" serve per importare tutte le classi di giocoPersonaggi"

public class Main {
    public static void main(String[] args){
        
        //creazione di un guerriero e un mago
        guerriero g1=new guerriero("Conan",100,5);
        mago m1=new mago("Merlino",75,7);
        
        //creazione di una lista di personaggi
        personaggio[] personaggi={g1,m1};
        
        //stampa dello stato di ogni personaggio
        for(personaggio p:personaggi){
            Utils.stampaStatus(p);
            p.attacca();
            p.difendi();
            System.out.println();
        }
    }
}

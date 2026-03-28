//Creare una classe statica GiocoUtils con metodi utili, ad esempio stampaStatus(Personaggio p) 
// per stampare tutte le informazioni del personaggio.

package giocoUtils;
import giocoPersonaggi.personaggio;

public class Utils {
    public static void stampaStatus(personaggio p) {
        System.out.println("Nome: " + p.getNome());
        System.out.println("Punti Vita: " + p.getPuntiVita());
        System.out.println("Livello: " + p.getLivello());
    }
}

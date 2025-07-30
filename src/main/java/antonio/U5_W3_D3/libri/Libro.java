package antonio.U5_W3_D3.libri;

import java.util.List;

public class Libro {
    private List<String> autori;
    private double prezzo;
    private List<InterfacciaLibro> elementi;

    public Libro(List<String> autori, double prezzo, List<InterfacciaLibro> elementi) {
        this.autori = autori;
        this.prezzo = prezzo;
        this.elementi = elementi;
    }

    public void stampa() {
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: " + prezzo + "€");
        for (InterfacciaLibro el : elementi) {
            el.stampa();
        }
    }

    public int getNumeroTotalePagine() {
        int totale = 0;
        for (InterfacciaLibro el : elementi) {
            totale += el.getNumerPagine();
        }
        return totale;
    }
}

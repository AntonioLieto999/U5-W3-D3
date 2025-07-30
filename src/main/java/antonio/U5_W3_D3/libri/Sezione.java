package antonio.U5_W3_D3.libri;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements InterfacciaLibro {
    private String titolo;
    private List<InterfacciaLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }
    public void aggiungiElemento(InterfacciaLibro elemento) {
        elementi.add(elemento);
    }
    @Override
    public void stampa(){
        System.out.println("Sezione: " + titolo);
        for (InterfacciaLibro elemento : elementi) {
            elemento.stampa();
        }
    }

    @Override
    public int getNumerPagine() {
        int totale = 0;
        for (InterfacciaLibro el : elementi){
            totale += el.getNumerPagine();
        }
        return totale;
    }

}

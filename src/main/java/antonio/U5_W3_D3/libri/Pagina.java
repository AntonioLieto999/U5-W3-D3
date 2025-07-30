package antonio.U5_W3_D3.libri;

public class Pagina implements InterfacciaLibro {
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println(contenuto);
    }

    @Override
    public int getNumerPagine() {
        return 1; // Ritorno ogni pagina come 1
    }
}

package negozio;

public class Libro extends Prodotto{
    private String ISBN;
    private String titolo;
    private String categoria;
    private int pagine;

    public Libro(double costo, double peso, String ISBN, String titolo, String categoria, int pagine){
        super(costo, peso);
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.categoria = categoria;
        this.pagine = pagine;
    }

    public int getPagine() {
        return pagine;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitolo() {
        return titolo;
    }
}

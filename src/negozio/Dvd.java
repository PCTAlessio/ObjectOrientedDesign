package negozio;

public class Dvd extends Prodotto {

    private String titolo;
    private String categoria;
    private double durata;

    public Dvd(double costo, double peso, double durata, String titolo, String categoria) {
        super(costo, peso);
        this.durata = durata;
        this.titolo = titolo;
        this.categoria = categoria;


    }

    public double getDurata() {
        return durata;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitolo() {
        return titolo;
    }

}


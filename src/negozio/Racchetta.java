package negozio;

public class Racchetta extends Prodotto {

    public String marca;
    public String forma;

    public Racchetta(double costo, double peso, String marca, String forma) {
        super(costo, peso);
        this.marca = marca;
        this.forma = forma;
    }

    public String getMarca() {
        return marca;
    }

    public String getForma() {
        return forma;
    }
}


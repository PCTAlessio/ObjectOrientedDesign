package negozio;

public class Prodotto {
    private double costo;
    private double peso;

    public Prodotto(double costo, double peso){
        this.costo = costo;
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }
    public double getPeso() {
        return peso;
    }
}

package negozio;

import java.util.ArrayList;

public class Negozio {

    private ArrayList<Prodotto> stock;
    private ArrayList<Libro> libreria;
    private ArrayList<Racchetta> racchette;

    public static void main(String[] args){
        Libro l1 = new Libro(12, 0.2, "9788806228644", "La Dieta Dukan", "Horror", 256 );
        Libro l2 = new Libro(9, 1.7, "5355073773321", "La Bibbia", "Fantasy", 1281);
        Libro l3 = new Libro(15,0.1, "6402936509125",
                "Anamnesi psichiatrica di un concorrente del Grande Fratello VIP", "Saggio", 16);
        Libro l4 = new Libro(19, 1.9,"11960392544091", "Il Signore degli Agnelli", "Fantasy",
                1354);
        Libro l5 = new Libro(10,0.2, "9021384658493", "La Storia Finita", "Fantasy", 199);
        Dvd m1 = new Dvd (9.99, 0.2, 101, "Bleid Ranner", "Azione");
        Dvd m2 = new Dvd (8.99, 0.1, 128, "Taitenic", "Romantico");
        Dvd m3 = new Dvd (13.99, 0.1, 196, "Videoguida alla macellazione dello struzzo", "Romantico");
        Dvd m4 = new Dvd(6.99, 0.1, 96, "Fantozzi contro Thanos", "Azione");
        Dvd m5 = new Dvd(7.99, 0.1, 105,"Fantozzi contro Thanos 2","Romantico");
        Racchetta r1 = new Racchetta(95,385, "Adidas", "A goccia");
        Racchetta r2 = new Racchetta (115, 366.4, "White Crown", "A diamante");
        Racchetta r3 = new Racchetta(101, 379, "White Crown", "A goccia");
        Racchetta r4 = new Racchetta(89, 341, "Adidas", "A vertebra di moffetta");
        Racchetta r5 = new Racchetta(289, 371, "White Crown", "A tesseract");


        

    }

    public int contaStock(){
        return stock.size();
    }

    public double pesaStock(){
        double pesoTotale = 0;
        for (Prodotto p : stock){
            pesoTotale = pesoTotale + p.getPeso();
        }
        return pesoTotale;
    }

    public int contaFantasy(){
        int numeroFantasy = 0;
        for (Libro l : libreria){
            if (l.getCategoria().equals("Fantasy")){
                numeroFantasy++;
            }
        }
        return numeroFantasy;
    }

    public void aggiungiProdotto(Prodotto p){
        stock.add(p);
    }

    public Prodotto trovaCostoso(){
        Prodotto costoso = stock.get(0);
        for (int i = 0; i<stock.size(); i++){
            if (stock.get(i).getCosto() < stock.get(i+1).getCosto()){
                costoso = stock.get(i+1);
            }
        }
        System.out.println(costoso.getPeso());
        return costoso;
    }


    public ArrayList escludiRacchette(){
        for (Racchetta r : racchette){
            if (r.getCosto()<100){
                racchette.remove(r);
            }

            if (!r.getForma().equals("A goccia")){
                racchette.remove(r);
            }


        }
        return racchette;

    }

}

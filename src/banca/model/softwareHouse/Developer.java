package banca.model.softwareHouse;

import java.time.LocalDate;

public class Developer extends Person{

   private String favouriteLanguage;

   public Developer(String fN, String lN, LocalDate dob,char sex, String fL){
       super(fN, lN, dob, sex);
       this.favouriteLanguage = fL;
   }
    @Override
    public void work() {
        System.out.println("penso penso penso...");
        System.out.println("Non ci ho ancora capito niente...");
        System.out.println("Meglio che mi prenda un caffé.");
        System.out.println("Ah! Adesso ho capito!");
    }

    public String getFavouriteLanguage(){
       return favouriteLanguage;
    }


}

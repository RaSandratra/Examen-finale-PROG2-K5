package Asa;
import java.time.LocalDate;

public class Promotion {
    private  LocalDate date;
    private double nouveauSalaire;
    private String raison;


public Promotion (LocalDate date, double nouveauSalaire, String raison ){
    this.date = date;
    this.nouveauSalaire = nouveauSalaire;
    this.raison = raison;

    }
    public LocalDate getDate() {return date;}
    public double getNouveauSalaire() {return nouveauSalaire;}
    public String getRaison() {return raison;}


}
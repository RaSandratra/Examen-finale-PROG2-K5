package Asa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Travailleur {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected List<Promotion> promotions;
    protected List<Pointage> pointages;

    public Travailleur(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.promotions = new ArrayList<>();
        this.pointages = new ArrayList<>();
    }

    public void ajouterPromotion(Promotion promotion) {
        promotions.add(promotion);
    }

    public void ajouterPointage(Pointage pointage) {
        pointages.add(pointage);
    }

    public List<Pointage> getPointagesParDate(LocalDate date) {
        List<Pointage> result = new ArrayList<>();
        for (Pointage p : pointages) {
            if (p.getDate().equals(date)) {
                result.add(p);
            }
        }
        return result;
    }

    public abstract double getSalaireActuel();
    public abstract double getSalaireEntreDates(LocalDate debut, LocalDate fin);

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public List<Promotion> getPromotions() { return promotions; }
    public List<Pointage> getPointages() { return pointages; }

    @Override
    public String toString() {
        return "Travailleur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
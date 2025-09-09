package Asa;

import java.time.LocalDate;

public class Pointage {
    private final LocalDate date;

    public enum Type {
        ENSEIGNEMENT,
        ADMINISTRATION,
        COMMUNICATION,
        RD,
        ABS_PAYEE,
        ABS_NON_PAYEE
    }

    private final Type type;
    private final double quotaTemps;
    private final String description;
    private final String couleur;

    public Pointage(LocalDate date, Type type, double quotaTemps, String description, String couleur) {
        if (quotaTemps <= 0 || quotaTemps > 1) {
            throw new IllegalArgumentException("Le quota de temps doit être entre 0 et 1");
        }
        this.date = date;
        this.type = type;
        this.quotaTemps = quotaTemps;
        this.description = description;
        this.couleur = couleur;
    }

    // Getters
    public LocalDate getDate() { return date; }
    public Type getType() { return type; }
    public double getQuotaTemps() { return quotaTemps; }
    public String getDescription() { return description; }
    public String getCouleur() { return couleur; }

    @Override
    public String toString() {
        return "Pointage{" +
                "date=" + date +
                ", type=" + type +
                ", quotaTemps=" + quotaTemps +
                ", description='" + description + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
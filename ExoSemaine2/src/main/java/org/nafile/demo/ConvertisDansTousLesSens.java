package org.nafile.demo;

public class ConvertisDansTousLesSens {
    public static void main(String[] args) {
        // Conversion d'un int en float
        int entier = 42;
        float flottant = (float) entier;
        System.out.println("Conversion d'un int en float : " + flottant);

        // Conversion d'un double en int
        double reel = 3.14159;
        int arrondi = (int) reel;
        double apresVirgule = reel - arrondi;
        System.out.println("Conversion d'un double en int : " + arrondi);
        System.out.println("Partie après la virgule : " + apresVirgule);

        // Conversion d'une String en int (avec gestion d'erreur)
        String chaineEntier = "123";
        try {
            int resultat = Integer.parseInt(chaineEntier);
            System.out.println("Conversion d'une String en int : " + resultat);
        } catch (NumberFormatException e) {
            System.out.println("La conversion de la chaîne en int a échoué.");
        }

        // Conversion d'un int en String
        int nombre = 9876;
        String chaine = Integer.toString(nombre);
        System.out.println("Conversion d'un int en String : " + chaine);

        // Conversion d'un float en double
        float flottant2 = 3.14f;
        double doublePrecision = (double) flottant2;
        System.out.println("Conversion d'un float en double : " + doublePrecision);

        // Autres exemples de conversion...
    }
}

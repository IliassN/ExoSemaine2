package org.nafile.demo;


public class Pyramide {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Pyramide <taille>");
            return;
        }

        try {
            int taille = Integer.parseInt(args[0]);
            int nombreEspaces = taille - 1;
            int nombreEtoiles = 1;

            for (int ligne = 1; ligne <= taille; ligne++) {
                // Afficher le bon nombre d'espaces
                afficher(" ", nombreEspaces);
                nombreEspaces = nombreEspaces - 1;

                // Afficher le bon nombre d'étoiles
                afficher("*", nombreEtoiles);
                nombreEtoiles = nombreEtoiles + 2;
                // Sauter à la ligne
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("La taille doit être un entier valide.");
        }
    }

    public static void afficher(String caractere, int nombre) {
        for (int i = 1; i <= nombre; i++) {
            System.out.print(caractere);
        }
    }
}

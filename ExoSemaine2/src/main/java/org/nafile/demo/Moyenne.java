package org.nafile.demo;

import java.util.Random;

public class Moyenne {
    public static void main(String[] args) {
        int taille = 10; // Changer la taille du tableau ici
        int[] tableau = new int[taille];
        Random rand = new Random();

        // Remplir le tableau avec des entiers aléatoires entre 0 et 100
        for (int i = 0; i < taille; i++) {
            tableau[i] = rand.nextInt(101); // Génère un entier aléatoire entre 0 et 100
        }

        // Calculer la somme, la moyenne, le minimum et le maximum
        int somme = 0;
        int min = tableau[0];
        int max = tableau[0];

        for (int nombre : tableau) {
            somme += nombre;

            if (nombre < min) {
                min = nombre;
            }

            if (nombre > max) {
                max = nombre;
            }
        }

        double moyenne = (double) somme / taille;

        // Afficher les statistiques dans la console
        System.out.println("Tableau d'entiers aléatoires : " + java.util.Arrays.toString(tableau));
        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}

package org.nafile.demo;

public class BinairiseEntier {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java BinariseTonEntier <nombre_entier>");
            return;
        }

        try {
            // Récupérer le nombre entier à partir de l'argument
            String strNombre = args[0];
            int nombre = Integer.parseInt(strNombre);

            // Afficher la représentation binaire du nombre
            String binaire = Integer.toBinaryString(nombre);
            System.out.println("Représentation binaire de " + nombre + " : " + binaire);
        } catch (NumberFormatException e) {
            System.out.println("L'argument doit être un nombre entier valide.");
        }
    }

}



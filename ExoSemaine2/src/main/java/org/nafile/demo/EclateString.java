package org.nafile.demo;

public class EclateString {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java AfficherCaracteres <chaîne>");
            return;
        }

        String chaine = args[0];

        for (int i = 0; i < chaine.length(); i++) {
            char caractere = chaine.charAt(i);
            System.out.println(caractere);
        }
    }
}

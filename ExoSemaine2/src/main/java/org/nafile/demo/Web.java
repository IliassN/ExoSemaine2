package org.nafile.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Web {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java AfficherContenuURL <URL>");
            return;
        }

        String urlStr = args[0];

        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Définir la méthode de requête (GET par défaut)
            connection.setRequestMethod("GET");

            // Obtenir le code de réponse HTTP
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    System.out.println(ligne);
                }
                reader.close();
            } else {
                System.out.println("La requête a échoué avec le code de réponse : " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la récupération du contenu de l'URL : " + e.getMessage());
        }
    }
}

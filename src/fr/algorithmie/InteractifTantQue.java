package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        while (true) {
            System.out.print("Veuillez entrer un nb entre 1 et 10 : ");
            if (scanner.hasNextInt()) {
                nb = scanner.nextInt();
                if (nb >= 1 && nb <= 10) {
                    break; // nb valide
                }
            } else {
                scanner.next(); // Consomme l'entrée invalide
            }
            System.out.println("Erreur : veuillez entrer un nb entier entre 1 et 10.");
        }

        System.out.println("Vous avez entré le nb : " + nb);
        scanner.close();
    }
}

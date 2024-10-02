package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        int[] array = new int[0]; // Initialisation d'un tableau vide
        boolean fin = false;

        System.out.println("Bienvenue dans le menu !");

        while (!fin) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Veuillez saisir une option : ");

            nb = scanner.nextInt();

            if (nb == 1) {
                System.out.print("Veuillez saisir un nombre à ajouter au tableau : ");
                int nombreAAjouter = scanner.nextInt();

                // Créer un nouveau tableau avec une taille augmentée
                int[] nouveauTableau = new int[array.length + 1];
                // Copier l'ancien tableau dans le nouveau
                System.arraycopy(array, 0, nouveauTableau, 0, array.length);
                // Ajouter le nouveau nombre à la fin du tableau
                nouveauTableau[nouveauTableau.length - 1] = nombreAAjouter;

                // Réaffecter le tableau
                array = nouveauTableau;

                System.out.println("Nombre ajouté : " + nombreAAjouter);

            } else if (nb == 2) {
                System.out.print("Voici le tableau : " + Arrays.toString(array) + "\n");
            } else if (nb == 3) {
                fin = true; // Sortir de la boucle
                System.out.println("Au revoir !");
            } else {
                System.out.println("Veuillez saisir une option entre 1 et 3");
            }
        }
        scanner.close();
    }
}

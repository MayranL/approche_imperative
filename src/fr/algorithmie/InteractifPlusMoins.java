package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        boolean trouver = false;
        int nCoups = 0;

        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1; // Génère un nombre entre 1 et 100
        System.out.println("Nombre aléatoire entre 1 et 100 choisi par l'ordinateur !" );

        while (trouver == false){
            System.out.print("Veuillez saisir un nb : \n");
            nb = scanner.nextInt();
            nCoups++;

            if(nb == nombreAleatoire){
                System.out.println("Bravo, vous avez trouvé en "+nCoups+ " coups");
                trouver = true;
            } else if (nb < nombreAleatoire) {
                System.out.println("Vous êtes en dessous du nombre aléatoire");
            } else {
                System.out.println("Vous êtes au dessus du nombre aléatoire");
            }
        }

        scanner.close();
    }
}

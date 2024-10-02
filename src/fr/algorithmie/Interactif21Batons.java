package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        int nbBatons = 21;
        int nombreAleatoire = 0;
        boolean victoire = false;
        Random random = new Random();

        while (nbBatons>0){
            System.out.println("---------------------------------------------");
            System.out.println("Actuellement il reste "+nbBatons+" batons !");
            System.out.println("---------------------------------------------");
            System.out.print("Veuillez saisir un nombre de baton à retirer entre 1 et 3 : ");
            nb = scanner.nextInt();
            while (nb<1 || nb>3){
                System.out.print("Veuillez saisir un nombre de baton à retirer entre 1 et 3 : ");
                nb = scanner.nextInt();
            }
            nbBatons = nbBatons-nb;

            if(nbBatons<=0){
                victoire = false;
                break;
            } else if (nbBatons==1) {
                victoire = true;
                break;
            } else {
                nombreAleatoire = random.nextInt(3) + 1; // Génère un nombre entre 1 et 3
                System.out.println("L'ordinateur a choisi de retirer "+nombreAleatoire+" batons !");
                nbBatons = nbBatons-nombreAleatoire;
            }
        }
        if(victoire = true){
            System.out.println("Vous avez gagné !");
        }else{
            System.out.println("Vous avez perdu !");
        }
    }
}

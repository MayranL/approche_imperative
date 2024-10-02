package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.print("Veuillez entrer un nb : ");
        nb = scanner.nextInt();
        int valeurFinale=0;

        System.out.print("Somme des nombres de 1 à "+nb+" : ");
        for(int i=1;i<nb+1;i++){
            valeurFinale+=i;
        }
        System.out.println(valeurFinale);
        scanner.close();
    }
}

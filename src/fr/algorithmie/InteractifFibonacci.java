package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.print("Veuillez saisir une valeur pour le rang N : ");
        nb = scanner.nextInt();
        System.out.println("Nombre final : "+ TestFibonacci(nb));
    }

    public static int TestFibonacci(int nb){
         return ((nb-1)+(nb-2));
    }
}

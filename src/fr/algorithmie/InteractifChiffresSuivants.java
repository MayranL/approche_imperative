package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.print("Veuillez entrer un nb : ");
        nb = scanner.nextInt();

        System.out.println("Vous avez entré le nb : " + nb);
        System.out.print("Suite de "+nb+" : ");
        for(int i=1;i<11;i++){
            if(i==10){
                System.out.print((nb+i));
            } else {
                System.out.print((nb+i)+",");
            }
        }

        scanner.close();
    }
}

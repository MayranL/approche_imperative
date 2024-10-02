package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        int plusGrand = 0;

        System.out.print("Veuillez entrer 10 nb : \n");
        for(int i=1;i<11;i++){
            System.out.print("Nombre "+i+" : ");
            nb = scanner.nextInt();
            if(plusGrand < nb){
                plusGrand = nb;
            }
        }

        System.out.println("Nombre le plus grand : "+plusGrand);

        scanner.close();
    }
}

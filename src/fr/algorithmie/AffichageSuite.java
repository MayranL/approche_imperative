package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args){
        for (int i=1;i<11;i++){
            System.out.println("Nombre : " + i);
        }
        for (int i=0;i<10;i++){
            if(i % 2 == 0){
                System.out.println("Voici un nombre pair : " + i);
            }
        }
        for (int i=0;i<10;i++){
            if(i % 2 != 0){
                System.out.println("Voici un nombre impair : " + i);
            }
        }
        int j = 0;
        while (j <10){
            System.out.println("Nombre : " + j);
            j = j + 1;
        }
        int h = 0;
        while (h <11){
            if(h % 2 == 0){
                System.out.println("Nombre pair : " + h);
            }
            h = h + 1;
        }
        int k = 0;
        while (k<10){
            if(k % 2 != 0){
                System.out.println("Nombre impair : " + k);
            }
            k = k+1;
        }
    }
}


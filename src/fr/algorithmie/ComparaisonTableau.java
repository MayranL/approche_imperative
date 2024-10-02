package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args){
        int[] array = {1,15,-3,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[] array2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
        int elementCommun = 0;

        for(int value : array){
            for(int value2 : array2){
                if(value == value2){
                    elementCommun++;
                }
            }
        }

        System.out.println("Il y a "+elementCommun+" en commun !");

    }
}
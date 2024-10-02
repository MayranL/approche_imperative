package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args){
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[] array2 = {-1,12,17,14,5,-9,0,18};
        int[] tableauFinal = new int[array.length];

        for(int i =0;i<array.length;i++){
            if(i < array2.length){
                tableauFinal[i] = (array[i]+array2[i]);
            }else{
                tableauFinal[i] = array[i];
            }
        }

        System.out.println("Somme des deux tableaux : " + Arrays.toString(tableauFinal));
    }
}
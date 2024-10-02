package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        for(int i=0; i<array.length;i++){
            System.out.println("Element "+i+" du tableau : "+ array[i]);
        }

        for(int i= array.length -1; i>=0;i--){
            System.out.println("Element "+i +" du tableau : "+ array[i]);
        }

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for(int i=0;i< arrayCopy.length;i++){
            System.out.println("ArrayCopy : " + arrayCopy[i]);        }
        }
}


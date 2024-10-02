package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[] reversedArray = new int[array.length];
        int j = 0;
        for(int i = array.length-1; i>=0;i--){
            reversedArray[j]=array[i];
            j++;
        }
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("ReversedArray : " + Arrays.toString(reversedArray));
    }
}


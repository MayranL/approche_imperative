package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args){
        int array[] = {0,1,2,3};
        int arrayTransfert[] = new int[array.length];
        for(int i = 0; i<array.length;i++){
            if(i == 0){
                arrayTransfert[i]=array[array.length-1];
            }else{
                arrayTransfert[i]=array[i-1];
            }
        }
        System.out.println(Arrays.toString(arrayTransfert));
    }
}
package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args){
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        for(int i = 0; i< array.length; i++){
            if(array[i] > 3){
                System.out.println("Nombre : "+array[i]);
            }
        }

        for (int i=0;i< array.length;i++){
            if(array[i] % 2 == 0){
                System.out.println("Voici un nombre pair : " + array[i]);
            }
        }

        for (int i=0;i< array.length;i++){
            if(array[i] % 2 == 0){
                System.out.println("Voici un index pair : " + i);
            }
        }

        for (int i=0;i< array.length;i++){
            if(array[i] % 2 != 0){
                System.out.println("Voici un nombre pair : " + array[i]);
            }
        }
    }
}


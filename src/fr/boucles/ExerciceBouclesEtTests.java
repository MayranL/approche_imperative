package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array= {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        System.out.println("Affichage des valeurs du tableau : ");
        for(int value : array){
            System.out.println(value);
        }

        System.out.println("\nAffichage des valeurs dans le sens inverse du tableau : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("\nValeurs > à 3 :");
        for(int value : array){
            if(value > 3){
                System.out.println(value);
            }
        }

        System.out.println("\nValeurs pair :");
        for(int value : array){
            if(value % 2 == 0){
                System.out.println(value);
            }
        }

        System.out.println("\nValeurs pair d'index :");
        for(int i=0;i<array.length-1;i++){
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        System.out.println("\nValeurs impair :");
        for(int value : array){
            if(value % 2 != 0){
                System.out.println(value);
            }
        }
    }
}

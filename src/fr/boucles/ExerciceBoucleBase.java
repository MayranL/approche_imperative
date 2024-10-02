package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args){
        // Affichage valeur de 1 à 10
        for(int i=1; i<11;i++){
            System.out.println(i);
        }

        for(int i=0; i<20;i++){
            System.out.println("Mayran Loïc");
        }

        for(int i=2; i<101;i++){
            if(i % 2 == 0){
                System.out.println("Valeur pair entre 2 et 100 : "+i);
            }
        }

        for(int i=1; i<100;i++){
            if(i % 2 != 0){
                System.out.println("Valeur impair entre 1 et 99 : "+i);
            }
        }
    }
}

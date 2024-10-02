package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args){
        System.out.println("\nExercice : Declaration et modification\n");
        String[] array = {"Nantes","Toulouse","Montpellier","Paris","Albi"};

        // Première option pour les afficher distinctements
        for(int i =0; i<array.length;i++){
            System.out.println("Element numéro "+i+" de la liste : "+array[i]);
        }
        // Deuxième option pour afficher toutes les valeurs dans le tableau
        System.out.println(Arrays.toString(array));

        System.out.println("Taille du tableau : "+array.length);

        array[3] = "Reims";
        // Première option pour les afficher distinctements
        for(int i =0; i<array.length;i++){
            System.out.println("Element numéro "+i+" de la liste : "+array[i]);
        }
        // Deuxième option pour afficher toutes les valeurs dans le tableau
        System.out.println(Arrays.toString(array));
    }
}
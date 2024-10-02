package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args){
        int array[] = {8,-7,12,1,-2,14,17,9};
        System.out.println("Index 0 : "+ array[0]);

        System.out.println("Longueur du tableau : "+array.length);

        System.out.println("Dernier index : " + array[array.length-1]);

        System.out.println("Affichage index 10 : " + array[10]);
        // Erreur puisque le tableau ne peut aller que jusqu'à l'index 7 (taille-1)
    }
}

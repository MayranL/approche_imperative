package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int array[] = {6, 5, 2, 6, 3, 6, 4, 6};
        boolean val = false;

        if (array.length > 0 && array[0] == array[array.length - 1]) {
            val = true;
        }

        System.out.println("Valeur boolean : " + val);
    }
}
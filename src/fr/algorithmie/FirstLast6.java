package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int array[] = {6, 5, 2, 6, 3, 6, 4, 1};
        boolean val = false;

        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            val = true;
        }

        System.out.println("Valeur boolean : " + val);
    }
}
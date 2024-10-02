package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args){
        byte valByte = 16;
        short valShort = 10;
        int valInt = 1;
        long valLong = 1000L;
        float valFloat = 12.34F;
        double valDouble = 12.34;
        char valChar = 'A';
        boolean valBoolean = true;
        String valString = "Bonjour";

        System.out.println("Voici le premier affichage texte affiché !");
        System.out.println("Voici la première variable affichée : "+ valInt);

        String randomString = "\nVoici le résultat d'un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}

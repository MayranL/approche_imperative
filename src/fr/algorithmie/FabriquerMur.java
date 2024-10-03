package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        System.out.println("------------------------------------------");
        if(nbSmall+(nbBig*5)==longueur){
            resultat = true;
            System.out.println("La réponse est OUI !");
            System.out.println("Vous avez le nombre exacte de briques !");
            return resultat;
        } else if (nbSmall+(nbBig*5)<longueur) {
            System.out.println("La réponse est NON !");
            System.out.println("Vous n'avez pas assez de briques aux totals !");
            return resultat;
        } else {
            while (nbBig*5>longueur){
                nbBig--;
            }
            if ((nbBig*5)+nbSmall<longueur){
                System.out.println("La réponse est NON !");
                System.out.println("Il vous manque des petites briques");
                return resultat;
            }
            while ((nbBig*5)+nbSmall>longueur){
                nbSmall--;
            }
            System.out.println("La réponse est OUI !");
            System.out.println("Il vous suffit de "+nbSmall+" petites et " + nbBig + " grandes !");
            resultat = true;
        }
        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}

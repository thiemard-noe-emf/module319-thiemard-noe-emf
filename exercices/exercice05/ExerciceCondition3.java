public class ExerciceCondition3 {
    public static void main(String[] args) {
        int valeur1 = 1;
        int valeur2 = 4;
        int nbrpos = 0;
        if (valeur1 >= 0)
            nbrpos = nbrpos + 1;
        if (valeur2 >= 0)
            nbrpos = nbrpos + 1;
        if (nbrpos % 2 == 0)
            System.out.println("Le résultat est positif");
        else
            System.out.println("Le résultat est négatif");
    }
}

public class devoir01 {
    public static void main(String[] args) {
        int monAge = 15;
        boolean estMajeur;
        if (monAge >= 18)
            estMajeur = true;
        else
            estMajeur = false;
        System.out.println("je m'appelle THIEMARD Noe. Mon age est de : " + monAge);
        if (estMajeur)
            System.out.println("Je suis majeur");
        else
            System.out.println("Je ne suis pas encore majeur");
    }   
}

public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;
        int transfer;
        System.out.println("Le contenu de la variable1 est : " + variable1 + ".");
        System.out.println("Le contenu de la variable2 est : " + variable2 + ".");
        transfer = variable1;
        variable1 = variable2;
        variable2 = transfer;
        System.out.println("Le contenu de la variable1 est : " + variable1 + ".");
        System.out.println("Le contenu de la variable2 est : " + variable2 + ".");
    }
}

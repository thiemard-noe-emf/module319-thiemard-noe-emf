public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temperature = 20;
        if (temperature < 0)
            if (temperature < -10)
                System.out.println("Il fait froid");
            else
                System.out.println("Il fait très froid");
        else
            if (temperature < 25)
                System.out.println("Il fait normal");
            else
                if (temperature >= 35)
                    System.out.println("Il fait très chaud");
                else
                    System.out.println("Il fait chaud");
    }
}
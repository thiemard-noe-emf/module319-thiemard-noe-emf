public class ExerciceSwitch2 {
static public void main(String[] args) {
        boolean x = false;
        int age = 12;
        if(x)
            if (age == 7)
                System.out.println("Poussin");
            else
                if (age <= 9)
                    System.out.println("Pupille");
                else
                    if (age <= 11)
                        System.out.println("Minime");
                    else
                        System.out.println("Inconnu");
        else
            switch(age) {
            case 7:
                System.out.println("Poussin");
            break;
            case 8:
            case 9:
                System.out.println("Pupille");
            break;
            case 10:
            case 11:
                System.out.println("Minime");
            break;
            default:
                System.out.println("Inconnu");
            break;                    
         }
    }
}

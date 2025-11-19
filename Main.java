import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BodyWeight(Nearest lb )");
        int ogBodyweight = scanner.nextInt();
        System.out.println("Age ");
        int age = scanner.nextInt();
        System.out.println("Height(inches)");
        int height = scanner.nextInt();
        System.out.println("Exercise Daily(1=low,2=moderate,3=high)");
        int exercise = scanner.nextInt();
        System.out.println("Male? (true or false)");
        boolean male = scanner.nextBoolean();
        GymApp subjectZayden = new GymApp();
        String e = subjectZayden.Calorie(ogBodyweight, age, height, exercise, male);
        System.out.println(e);

        System.out.println("Gym or Food plan? (Gym or Food)");
        String gymOrFood =  scanner.nextLine();

        String s = "";

        {
            if (gymOrFood.equals("Gym")) ;
            {
                System.out.println("Legs, Torso, Arms?");
                String bodyRegion = scanner.nextLine();
            }

            if (gymOrFood.equals("Food")) ;
            {
                System.out.println("How many pounds do you want to lose or gain (ie.  10 or -10)");
                String weightChange = scanner.nextLine();
                System.out.println("In how many weeks do you want this change");
                String timeWeeks = scanner.nextLine();
            }
        }

    }

}
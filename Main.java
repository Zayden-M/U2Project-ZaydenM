import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BodyWeight(Nearest lb )");
        int ogBodyweight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Age ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Height(inches)");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Exercise Daily(1=low,2=moderate,3=high)");
        int exercise = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Male? (true or false)");
        boolean male = scanner.nextBoolean();
        scanner.nextLine();
        GymApp subjectZayden = new GymApp();
        String e = subjectZayden.Calorie(ogBodyweight, age, height, exercise, male);
        System.out.println(e);

        System.out.println("Gym or Food plan? (gym or food)");
        String gymOrFoo =  scanner.nextLine();
        System.out.println(" ");
        GymApp subjectZaydenGorF = new GymApp();
        String f =subjectZaydenGorF.gymFood(gymOrFoo);
        System.out.println(f);
        String targetChoice = scanner.nextLine();
        String bodyOrFree="";

        if (targetChoice.equals("legs")||targetChoice.equals("torso")||targetChoice.equals("arms"))
        {
            System.out.println("Body weight or free weight?(body or free)");
            String bodyFree= scanner.nextLine();
        if (bodyFree.equals("body"))
        {
         bodyOrFree= "body";
        }
            if (bodyFree.equals("free"))
            {
                bodyOrFree= "free";
            }
            GymApp subjectZaydenGym = new GymApp();
            String g =subjectZaydenGorF.gymChoice(gymOrFoo);
            System.out.println(g);

        }






    }


    }


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double  randomChoice=Math.random() * 100;
        System.out.println((int)randomChoice);
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

        String f =subjectZayden.gymFood(gymOrFoo);
        System.out.println(f);
        String targetChoice = scanner.nextLine();




        if (gymOrFoo.equals("gym")) {


            System.out.println("Body weight or free weight?(body or free)");
            String bodyFree = scanner.nextLine();


            String g = subjectZayden.gymChoice(targetChoice, bodyFree);
            System.out.println(g);


        }
    }


    }


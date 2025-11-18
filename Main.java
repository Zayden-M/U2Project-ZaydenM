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
        int exercise =  scanner.nextInt();
        System.out.println("Male? (true or false)");
        boolean male =  scanner.nextBoolean();
        GymApp subjectZayden = new GymApp();
        String e = subjectZayden.Calorie(ogBodyweight,age,height,exercise,male);
        System.out.println(e);




    }
}
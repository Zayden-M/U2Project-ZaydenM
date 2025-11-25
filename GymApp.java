import java.util.Random;

public class GymApp

{
    double ogCalCount = 0;
    double bmr = 0;
    double requiredCal= 0;
    int calBurnDaily=0;
    double intensityFactor=0;
    public String Calorie (double poundWeight, int age, int height, int exercise, boolean male)

    {
     ogCalCount= poundWeight * 3500;

    if (exercise == 1)
    {
         calBurnDaily = 130;
         intensityFactor=1.375;
    }
    if (exercise == 2)
    {
         calBurnDaily = 250;
         intensityFactor=1.55;
    }
    if (exercise == 3)
    {
         calBurnDaily = 600;
         intensityFactor=1.75;
    }
    if (male)
    {
         bmr = ((10 * poundWeight)/2.20462) + 6.25 * (height * 2.54) - (5 * age) +5;
        requiredCal = 2200 +  calBurnDaily;
    }
    if (!male)
    {
         bmr = ((10 * poundWeight)/2.20462) + 6.25 * (height * 2.54) - (5 * age) -161;
        requiredCal = 2000 +  calBurnDaily;
    }

    String returnString= "Your weight in calories is " + ogCalCount +" and your Basal Metabolic Rate is " + (int)(bmr)+ "your TDEE is " + (int)(bmr * intensityFactor)+ ", to gain 5 pounds in 1 month eat" + (int)(bmr * intensityFactor + 500) +" calories each day." ;

    //(2.7cal is burned by pound)

return returnString;
}

    public String gymFood(String gymOrFood)
    {String choice = "";
        {
            if (gymOrFood.equals("gym"))
            {
                choice = "legs, torso, or arms?";

            }

            if (gymOrFood.equals("food"))
            {
                choice = "How many pounds do you want to gain or lose (ie.  10 or -10)" + " In how many weeks do you want this change";

            }
        }
        return choice ;

    }
    public String foodChoice(String weightLsOrGn, int NumOfWeeks)
    {

        return null;
    }
    public String gymChoice(String bodyFunction, String bOrF)
    {double randomChoice=Math.random() * 100 ;
        String exersize = "";

        if (bodyFunction.equals("legs"))
        {
            if (bOrF.equals("free"))
            {
                if (randomChoice>75)
                {
                 exersize = "Romanian Deadlift";
                }
                else if (randomChoice>50)
                {
                    exersize = "Dumbbell calf raises";
                }
                else if (randomChoice>25)
                {
                    exersize = "Goblet squat";
                }
                else if (randomChoice>0);
                {
                    exersize = "Isometric Deadlift";
                }

            }
            if (bOrF.equals("body"))
            {
                if (randomChoice>75)
                {
                    exersize = "Glute Bridges";
                }
                else if (randomChoice>50)
                {
                    exersize = "Pistol Squats";
                }
                else if (randomChoice>25)
                {
                    exersize = "Reverse Lunges";
                }
                else if (randomChoice>0);
                {
                    exersize = "Step Ups";
                }
            }

        }

        if (bodyFunction.equals("torso"))
        {
            if (bOrF.equals("free"))
            {

                if (randomChoice>75)
                {
                    exersize = "Dumbbell Bench press";
                }
                else if (randomChoice>50)
                {
                    exersize = "Bent-over Rows";
                }
                else if (randomChoice>25)
                {
                    exersize = "Weighted russian twists";
                }
                else if (randomChoice>0);
                {
                    exersize = "Weighted Dead bug";
                }

            }
            if (bOrF.equals("body")) {

            }
        }

        if (bodyFunction.equals("arms"))
        {
            if (bOrF.equals("free"))
            {

            }
            if (bOrF.equals("body"))
            {

            }
        }

return null;
    }

}

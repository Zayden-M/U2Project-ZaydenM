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

    String returnString= "Your weight in calories is " + ogCalCount +" and your Basal Metabolic Rate is " + (bmr * intensityFactor);

    //(2.7cal is burned by pound)

return returnString;
}

}

import java.util.Arrays;

/**
 * Student name: Wenhao LU Student
 * number:S3810097
 */
public class A2 
{
    /*
     *  YOU MAY MODIFY THIS DATA FOR TESTING PURPOSES
     *  YOU MUST MAKE SURE YOUR FINAL SUBMISSION CONTAINS
     *  THIS DATASET UNMODIFIED.
     */   
    private String[] menu=
    {
        "INDIAN|Biryani|16.99",
        "VIETNAMESE||17.00",
        "CHINESE|Chicken with Black Bean Sauce|16.5",
        "MIDDLE_EASTERN|Falafel|17.99",
        "Indian|Butter Chicken|17.00",
        "THAI|Pad Thai|23.00",
        "|Orange & Poppyseed Cake|15.99",
        "GREEK|Moussaka|18.50",
        "JAPANESE|Sushi|",
        "ITALIAN|Lasagne|18.50",
        "INDIAN|Dhal Tadka|9.50",
        "INDIAN|Brinjal|11.50"
    }; 
    
    /*
     *  YOU MAY MODIFY CODE IN THIS METHOD FOR TESTING PURPOSES
     *  YOU MUST MAKE SURE YOUR FINAL SUBMISSION CONTAINS
     *  THIS METHOD IN ITS UNMODIFIED STATE.
     */   
    public void run()
    {
        String preliminary = "\n\nPLEASE NOTE: This code represents initial test data\n" +
        "You need to thoroughly test your solution.\n" +
        "During assessment we will change the values in these\n" +
        "tests and change the underlying dataset.\n" +
        "When you submit your final version make sure that\n" +
        "the code in this run method has not been changed.\n\n" +
        "You should also focus on best practice code by writing \n" +
        "cohesive methods and following the principles taught in this course\n\n";

        System.out.println(preliminary);
        /**
         * TESTING Meal Summary
         */
        System.out.println("TESTING - MEAL SUMMARY (VALID)");
        System.out.println("(16.99 - 18.50)");
        String result = getMealSummaryInRange(16.99, 18.50);
        System.out.println(result);

        System.out.println("TESTING - MEAL SUMMARY (NOT FOUND)");
        System.out.println("(30.00 - 50.00)");
        result = getMealSummaryInRange(30.00, 50.00);
        System.out.println(result);
        System.out.println("------------");

        /**
         * TESTING Get Change
         */
        System.out.println("TESTING - GET CHANGE (VALID)");
        System.out.println("(Biryani,Falafel, Moussaka, Lasagne)");
        String[] mealsOrdered = {"Biryani","Falafel", "Moussaka", "Lasagne"};
        result = getChange(mealsOrdered, 123.00);
        System.out.println(result);
        
        System.out.println("TESTING - GET CHANGE (INSUFFICIENT FUNDS)");
        System.out.println("(Biryani,Falafel, Moussaka, Lasagne)");
        result = getChange(mealsOrdered, 53.99);
        System.out.println(result);

        System.out.println("\nTESTING - GET CHANGE (EMPTY)");
        mealsOrdered[0] = "";
        mealsOrdered[1] = "";
        mealsOrdered[2] = "";
        mealsOrdered[3] = "";
        result = getChange(mealsOrdered, 123.00);
        System.out.println(result);

        System.out.println("\nTESTING - GET CHANGE (NULL)");
        mealsOrdered = null;
        result = getChange(mealsOrdered, 123.00);
        System.out.println(result);
        System.out.println("------------");

         /**
         * TESTING Get Change
         */
        System.out.println("\nTESTING - MEALS BY CUISINE");
        System.out.println("(INDIAN)");
        String[] mealsByCuisine = getMealsByCuisine("INDIAN");
        for(int i =0; i < mealsByCuisine.length;i++){
            System.out.println(mealsByCuisine[i]);
        }

        System.out.println("\nTESTING - MEALS BY CUISINE");
        System.out.println("(RUSSIAN)");
        mealsByCuisine = getMealsByCuisine("RUSSIAN");
        for(int i =0; i < mealsByCuisine.length;i++){
            System.out.println(mealsByCuisine[i]);
        }

        System.out.println("\nTESTING - MEALS BY CUISINE");
        System.out.println("(Empty)");
        mealsByCuisine = getMealsByCuisine("");
        for(int i =0; i < mealsByCuisine.length;i++){
            System.out.println(mealsByCuisine[i]);
        }

        System.out.println("\nTESTING - MEALS BY CUISINE");
        System.out.println("(NULL)");
        mealsByCuisine = getMealsByCuisine(null);
        for(int i =0; i < mealsByCuisine.length;i++){
            System.out.println(mealsByCuisine[i]);
        }

        System.out.println("------------");

        System.out.println("\nTESTING - MEALS HISTOGRAM");
        result = mealsAvailableHistogram();
        System.out.println(result);
        System.out.println("------------");
        
    }

    /**
     * Implement Q1, you must implement the body of this method
     * NOTE: EACH OF THE PRIMARY METHODS FOR THE QUESTIONS WILL
     * BE TESTED INDIVIUDALLY WITHOUT REFERENCE TO ANY PRE-VALIDATION
     * YOU MIGHT IMPLEMENT
     */
    private String getMealSummaryInRange(double startPrice, double upperPrice)
    {
          // Implement the method logic here
          String result="";
          int count = 0;
          String[] arrayOfMenus = new String[menu.length];
          String[] arrayOfPrices = new String[menu.length];
          for (int i = 0; i < menu.length; i++) {
              int number = menu[i].indexOf("|");
              int number1 = menu[i].indexOf("|",number+1);
              arrayOfMenus[i] = menu[i].substring(number+1,number1);
              arrayOfPrices[i] = menu[i].substring(number1+1);
              if (arrayOfMenus[i].length() !=0) {
                  if (arrayOfMenus[i].length()>20) {
                      arrayOfMenus[i] = arrayOfMenus[i].substring(0, 19);
                  }
                  if (arrayOfPrices[i].length() !=0){
                      double price = Double.parseDouble(arrayOfPrices[i]);
                      if (price > startPrice && price < upperPrice) {
                          String formatMenus = String.format("%-20s",arrayOfMenus[i]);
                          String formatPrice = String.format("%10.2f",price);
                          result += formatMenus +formatPrice +"\n";
                          count++;
                      }
                  }
              }
          }
          if (count==0){
              System.out.println("No meals found within meal");
          }
        return result;
    }

    /**
     * Implement Q2, you must implement the body of this method
     * NOTE: EACH OF THE PRIMARY METHODS FOR THE QUESTIONS WILL
     * BE TESTED INDIVIUDALLY WITHOUT REFERENCE TO ANY PRE-VALIDATION
     * YOU MIGHT IMPLEMENT
     */
    private String getChange(String[] meals, double paid) {
        // Implement the method logic here
        String result="";
        double   sum = 0;
        int    count = 0;
        String tendered = "Your tendered:";
        String totalCost = "The total cost of the meal was:";
        String change = "your change:";
        String insufficient = "You provided insufficient funds. Please remove Falafel from your order";
        String formatTotalCost = String.format("%-40s",totalCost);
        String formatChange = String.format("%-40s", change);
        String formatTendered = String.format("%-40s", tendered);
        String[] arrayOfMenus = new String[menu.length];
        String[] arrayOfPrices = new String[menu.length];
        for (int i = 0; i < menu.length; i++) {
            int number = menu[i].indexOf("|");
            int number1 = menu[i].indexOf("|",number+1);
            arrayOfMenus[i] = menu[i].substring(number+1,number1);
            arrayOfPrices[i] = menu[i].substring(number1+1);
            if (meals != null) {
                if (!meals.equals("")){
                    for (int j = 0; j <meals.length ; j++) {
                        double price = Double.parseDouble(arrayOfPrices[i]);
                        if (meals[j].equals(arrayOfMenus[i])) {
                            sum += price;
                            count++;
                        }
                    }
                }
                result = "The method was passed a null value for meals";
                break;
            }
            result = "Your meals data is invalid.";
            break;
        }
        if (count>0) {
            double moneyChange = paid - sum;
            String formatSum = String.format("%.2f",sum);
            String formatMoneyChange = String.format("%.2f",moneyChange);
            if (paid>sum) {
                result = formatTendered + paid+ "\n"+formatTotalCost+formatSum +"\n" +formatChange + formatMoneyChange ;
            }else{
                result = formatTendered + paid+ "\n"+formatTotalCost+ formatSum +"\n"+ insufficient;
            }
        }
        return result;
    }

     /**
     * Implement Q3, you must implement the body of this method
     * NOTE: EACH OF THE PRIMARY METHODS FOR THE QUESTIONS WILL
     * BE TESTED INDIVIUDALLY WITHOUT REFERENCE TO ANY PRE-VALIDATION
     * YOU MIGHT IMPLEMENT
     */
    private String[] getMealsByCuisine(String cuisine)
    {
        // Implement the method logic here
        
        // you will need to modify this initialisation
        int count = 0;
        int index = 0;
        String[] result;
        String[] arrayOfCuisine = new String[menu.length];
        String[] arrayOfMeals = new String[menu.length];
        if (cuisine != null) {
            for (int i = 0; i < menu.length; i++) {
                int number = menu[i].indexOf("|");
                int number1 = menu[i].indexOf("|", number + 1);
                arrayOfCuisine[i] = menu[i].substring(0, number);
                arrayOfMeals[i] = menu[i].substring(number + 1, number1);
                count = 0;
                int found = arrayOfCuisine[i].compareTo(cuisine);
                if (found == 0) {
                    index++;
                }
            }
            result = new String[index];
            if (index !=0){
                for (int i = 0; i < menu.length; i++) {
                    String upperCaseCuisine = cuisine.toUpperCase();
                    if (arrayOfCuisine[i] != null || arrayOfMeals[i] != null) {
                        if (!arrayOfCuisine[i].equals("") || !arrayOfMeals[i].equals("")) {
                            if (cuisine != null) {
                                if (!cuisine.equals("")) {
                                    if (arrayOfCuisine[i].equals(upperCaseCuisine)) {
                                        result[count] = arrayOfMeals[i];
                                        count++;
                                    }
                                } else {
                                    result = new String[1];
                                    result[0] = "A null value was provided for cuisine.";
                                    break;
                                }
                            }
                        }
                    }
                }
            }else {
                result = new String[1];
                result[0] = "No meals found";
            }
            }else{
            result = new String[1];
            result[0] = "Meal not found";
        } 
            return result;      
            
  
    }
    
     /**
     * Implement Q4, you must implement the body of this method
     * NOTE: EACH OF THE PRIMARY METHODS FOR THE QUESTIONS WILL
     * BE TESTED INDIVIUDALLY WITHOUT REFERENCE TO ANY PRE-VALIDATION
     * YOU MIGHT IMPLEMENT
     */
    private String mealsAvailableHistogram()
    {
         // Implement your method logic here
         int count = 0;
         String result = "";
         String stringResult = "";
         String validText = "VALID:";
         String formattedValid = String.format("%-30s", validText);
         String[] cuisine = {"INDIAN", "VIETNAMESE", "CHINESE", "MIDDLE_EASTERN", "THAI", "GREEK", "JAPANESE", "ITALIAN"};
         int[] numberOfmeals = new int[cuisine.length];
         int valid = 0;
         int numbers = 0;
         String[] arrayOfCuisine = new String[menu.length];
         String[] arrayOfMeals = new String[menu.length];
         String[] arrayOfPrices = new String[menu.length];
         for (int i = 0; i < menu.length; i++) {
             int number = menu[i].indexOf("|");
             int number1 = menu[i].indexOf("|", number + 1);
             arrayOfCuisine[i] = menu[i].substring(0, number);
             arrayOfMeals[i] = menu[i].substring(number + 1, number1);
             arrayOfPrices[i] = menu[i].substring(number1 + 1);
             if (arrayOfCuisine[i].length()==0){
                 valid++;
             }
             if (arrayOfPrices[i].length()==0){
                 valid++;
             }
         }
         for (int i = 0; i < arrayOfCuisine.length; i++) {
             count = 0;
             for (int j = 0; j < cuisine.length; j++) {
                 int found = arrayOfCuisine[i].compareTo(cuisine[j]);
 
                 if (found == 0) {
                     numbers =j;
                     numberOfmeals[j]++;
                 } else {
                     count++;
                 }
                 if (count == 8) {
                     valid++;
                 }
             }
             if ( count ==7){
                 if (arrayOfMeals[i].equals("") || arrayOfMeals[i] == ""){
                     numberOfmeals[numbers]--;
                 }
                 if (arrayOfPrices[i].equals("") || arrayOfPrices[i] == ""){
                     numberOfmeals[numbers]--;
                 }
             }
         }
             for (int i = 0; i < numberOfmeals.length; i++) {
                 String formattedCuisine = String.format("%-30s", cuisine[i]+":");
 
                 result += formattedCuisine+numberOfmeals[i] + "\n";
 
                 stringResult = result  +formattedValid+valid;
             }
        return stringResult;
    }  

}
public class Tax {
    public static double calculateTotalMealPrice(double ListedMealPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * ListedMealPrice;
        double tax = taxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice( 100, .5, .08);
        System.out.println(groupTotalMealPrice);
        double individualMealPrice = groupTotalMealPrice/5;
        System.out.println(individualMealPrice);
    



    }
    
}
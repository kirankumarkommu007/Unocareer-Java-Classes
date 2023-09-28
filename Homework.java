public class Homework {
    public static void main(String[] args) {
    	int totalBudget = 1780;
        int costPerKgTomato = 80; 
        int costPerKgOnion = 230;  
        int tomatoQuantity = 3;  
        int onionQuantity = 5; 
 
        int totalTomatoCost = costPerKgTomato * tomatoQuantity;
        int totalOnionCost = costPerKgOnion * onionQuantity;

        int remainingMoney = totalBudget - (totalTomatoCost + totalOnionCost);
        
        int additionaltomato= remainingMoney/costPerKgTomato ;
        int finalmoney= remainingMoney%costPerKgTomato;
        
        System.out.println("Total tomatoes ="	+ (tomatoQuantity + additionaltomato)+ "Kgs" );
        System.out.println("Total onions ="	+onionQuantity+ "Kgs");
        System.out.println("Reamining Money ="	 +finalmoney);
    }
}





package question4c;

public class QUESTION4C {
    public static void main(String[] args) {
       
        double initialLoad = 10000; 
        double chargeRate = 0.10;   
        int callRate = 200;         
        int callDuration = 5 * 60;  
        
        
        double loadCharge = initialLoad * chargeRate; 
        double afterLoadBalance = initialLoad - loadCharge; 
        
       
        double callCost = callDuration * callRate;
        
        
        double finalBalance = afterLoadBalance - callCost;
        
        System.out.println("Final balance: UGX " + finalBalance);
    }
}
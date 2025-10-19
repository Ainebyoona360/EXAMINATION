package question4b;

public class QUESTION4B {
    public static void main(String[] args) {
        double porridgeLiters = 2.0; 
        double milkLiters = 2.0;    
        double cupSize = 0.5;       
        double porridgeFeed = 0.5 * cupSize; 
        double milkFeed = cupSize;  
        int porridgeInterval = 45;   
        int milkInterval = 30;      
        
       
        int porridgeFeeds = (int)(porridgeLiters / porridgeFeed); 
        int milkFeeds = (int)(milkLiters / milkFeed); 
        
       
        int porridgeTime = (porridgeFeeds - 1) * porridgeInterval; 
        int milkTime = (milkFeeds - 1) * milkInterval; 
        
        
        int totalTime = Math.max(porridgeTime, milkTime);
        
        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
}
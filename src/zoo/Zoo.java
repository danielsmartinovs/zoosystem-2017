/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author m7_martin_d
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Shop Keeper
        
        Shop shopKeeper = new Shop();
        
        // Add one visitor Janis
        
        Visitor visitor1 = new Visitor("Janis");
        
        // Give him "general" ticket to 25-03-2017 for price of 5.00 (euros)
        
        shopKeeper.giveTicket(5.00, "25-03-2017", "general ticket", visitor1);
        
        // Check if visitor1 have "general" ticket for 25-03-2017
        // Should return true
        
        System.out.println(shopKeeper.checkVisitorTicket(visitor1, "25-03-2017", "general ticket"));
        
        // Check if visitor1 have "reptile house" ticket for 25-03-2017
        // Should return false
        
        System.out.println(shopKeeper.checkVisitorTicket(visitor1, "25-03-2017", "reptile house ticket"));
           
        
    }
    
}

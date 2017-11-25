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
        
        Shop shopKeeper = new Shop();
        
        Visitor visitor1 = new Visitor("Janis");
        
        shopKeeper.giveTicket(5.00, "25-03-2017", "general ticket", visitor1);
            
        System.out.println(shopKeeper.checkVisitorTicket(visitor1, "25-03-2017", "general ticket"));
        System.out.println(shopKeeper.checkVisitorTicket(visitor1, "25-03-2017", "reptile house ticket"));

    }
    
}

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
public class Shop {
    
    /**
     * Gives visitor specific type, price ticket to specific date
     */
    
    public void giveTicket(double price, String date, String type, Visitor visitor) {
        Ticket ticket = new Ticket( price, date, type );
        
        visitor.addTicket(ticket);
    }
    
    /**
     * Checks if specific visitor have specific type ticket to specific date
     * Returns true or false
     */
    
    public boolean checkVisitorTicket(Visitor visitor, String date, String type) {
        
        for (Ticket __ticket : visitor.getTickets()) {
            
            if(__ticket.getDate().equals(date) && __ticket.getType().equals(type))
            {
                return true;
            }
            
        }

        return false;
    }
    
}

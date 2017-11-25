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
    
    public void giveTicket(double price, String date, String type, Visitor visitor) {
        Ticket ticket = new Ticket( price, date, type );
        
        visitor.addTicket(ticket);
    }
    
    public boolean checkVisitorTicket(Visitor visitor, String date, String type) {
        
        boolean haveTicket = false;
        
        for (Ticket __ticket : visitor.getTickets()) {
            
            if(__ticket.getDate() == date && type == __ticket.getType())
            {
                haveTicket = true;
                break;
            }
            
        }

        return haveTicket;
    }
    
}

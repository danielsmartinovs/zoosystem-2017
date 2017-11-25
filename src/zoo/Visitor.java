/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author m7_martin_d
 */
public class Visitor {
    
    private String name = "";
    
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();  
    
    public Visitor() {
        
    }
    
    public Visitor(String name) {
        this.name = name;
    }
    
    public void addTicket(Ticket ticket) { 
        tickets.add(ticket);
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }  

}

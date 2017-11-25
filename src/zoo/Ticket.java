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
public class Ticket {
    
    private double price = (double)0.00;
    
    private String date = ""; 
    
    /**
     * Ticket type - general ticket, reptile house ticket, butterfly (insect) house etc.
     * We are using "General ticket" as default value
     */
    
    private String type = "general ticket";
    
    public Ticket () {
        
    }
    
    public Ticket (double price, String date, String type) {
        this.price = price;
        this.date = date;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
    
    
    
    
}

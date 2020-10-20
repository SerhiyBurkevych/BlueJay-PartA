import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Serhiy Yaroslavovych Burkevych
 * @version 20/10/2020
 */
public class Ticket
{
    private String destination;
    
    //this is in pence
    private int price;
    
    private Date datePurchased = new Date();
   

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
       this.price = price;
       this.destination = destination;
    }
    
 
    /**
     * 
     */public void print()
    {
       System.out.println(destination + ", Price "+ price );   
    }
       
    /**
     * 
     */
    public int getPrice()
    {
       return price;   
    }
    
    /**
     * 
     */
    public String getDestination()
    {
       return destination;   
    }
    
}
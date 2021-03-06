/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Serhiy Yaroslavovych Burkevych
 */
public class TicketMachine
{
   
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket;
    
    private Ticket highWycombeTicket;
    
    private Ticket userTicket;
    
   

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        aylesburyTicket = new Ticket("Aylesbury" ,220);
        amershamTicket = new Ticket("Amersham " ,300);
        highWycombeTicket = new Ticket("High Wycombe",330);
       
        userTicket = null;
    }
    
    public void printAll()
    {
     aylesburyTicket.print();
     amershamTicket.print();
     highWycombeTicket.print();
    }
 
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public void selectHighWycombe()
    {
        userTicket = highWycombeTicket;
    }
    
    public void selectAmersham()
    {
        userTicket = amershamTicket;
    }
    
    public void selectAylesbury()
    {
        userTicket = aylesburyTicket;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        
        
        if(balance >= userTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket " + userTicket.getDestination());
            System.out.println("# " + userTicket.getPrice() + " pence.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + userTicket.getPrice();
            // Reduce the balance by the price.
            balance = balance - userTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (userTicket.getPrice() - balance) + " more pence.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        printBalance(0);
        return amountToRefund;
    }
    
    /**
     * This method will print the current balance
     */
    public void printBalance(int amount)
    {
     System.out.println("Inserted " + amount + " pence.");
     System.out.println("Total " + balance + " pence.");
    }
    
    /**
     * This method will add 10p on the current balance
     */
    public void insert10p()
    {
     balance= balance + 10;
     printBalance(10);
    }
    
    /**
     * This method will add 20p on the current balance
     */
    public void insert20p()
    {
     balance= balance + 20;
     printBalance(20);
    }
    
    /**
     * This method will add £1 on the current balance
     */
    public void insert£1()
    {
     balance= balance + 100;
     printBalance(100);
    }
    
    /**
     * This method will add £2 on the current balance
     */
    public void insert£2()
    {
     balance= balance + 200;
     printBalance(200);
    }
    
     
}

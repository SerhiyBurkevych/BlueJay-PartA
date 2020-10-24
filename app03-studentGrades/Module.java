
/**
 * The module class represents the modules students will have.
 *
 * @author Serhiy Yaroslavovych Burkevych
 * @version 22/10/2020
 */
public class Module
{
  private String title;
  
  private String codeNo;
  
  private int mark;
  
  private boolean completed;
  
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    /**
     * Used to set mark on course
     */
    public void setMark(int mark)
    {   if ((mark >=0) && (mark <= 100))
       {
        this.mark = mark;
        if(mark >=40) completed = true;
       }
    }
    
    /**
     * Get classed the acess to the information about module completing
     */
    public boolean isCompleted()
    {
      return completed;   
    }
    
    
    /**
     * Used to get mark from course
     */
    public int getmark()
    {
        return mark;
    }
    
    /**
     * Method for printing course details
     */
    public void print()
    {
        System.out.println("Course:" + title + ", Code Number: "+ codeNo + ", Mark: " + mark); 
   
    }

    
}

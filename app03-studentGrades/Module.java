
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
  
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        
        
    }

    
}

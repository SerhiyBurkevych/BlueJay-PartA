
/**
 * The purpose of this class is to store the information of an university course 
 * title and ucas course code
 * 
 * @author Serhiy Burkevych
 * @version 09/10/2020
 */
public class Course
{
    // Attributes/Variables/Field
    
    private String title;
    
    // This is a UCAS code number
    
    private String codeNo; 
 
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        codeNo = code;
    }
   
    public void print()
    {
       System.out.println("Course: " + title + ", Code: " + codeNo);  
    }    
 
}

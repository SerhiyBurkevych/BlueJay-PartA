
/**
 * The purpose of this class is to store the information of an university course 
 * title and ucas course code
 * 
 * @author Serhiy Burkevych
 * @version 09/10/2020
 */
public class Course
{
    private String title;
    
    private String codeNo;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int noModules;
    
    private int finalMark;
    
    private Grades finalGrade;
 
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.codeNo = code;
        noModules = 0;
        finalGrade = Grades.NULL;
        createModules();
    }
    
    /**
     * Method that creates modules
     */
    public void createModules()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("3D Modelling", "CO461");
        module3 = new Module("Computer Architectures", "CO450");
        module4 = new Module("Game Design", "CO459");
    }
   
    /**
     * Print the course title and code number
     */
    public void print()
    {
       System.out.println("Course: " + title + ", Code: " + codeNo); 
       printModules();
    }
    
    public void printModules()
    {
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    
    public void addModule(Module module)
    {
        noModules ++;
        if(noModules == 1)
        {
            module1 = module;
        }
    }
    
    /**
     * Method used for setting marks.
     */
    public void setModuleMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.setMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.setMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.setMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.setMark(mark);
        }
    }
    
    public void calculateFinalGrade()
    {
        if(finalMark < 40)
        {
            finalGrade = Grades.F;
        }
        else if((finalMark >= 40) && (finalMark < 50))
        {
            finalGrade = Grades.D;
        }
         else if((finalMark >= 50) && (finalMark < 59))
        {
            finalGrade = Grades.C;
        }
         else if((finalMark >= 60) && (finalMark < 69))
        {
            finalGrade = Grades.B;
        }
         else if((finalMark >= 70) && (finalMark < 100))
        {
            finalGrade = Grades.A;
        }
        
    }
    
 
}

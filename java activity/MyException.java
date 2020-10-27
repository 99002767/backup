class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
  
public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("new throwed Exception"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught the Exception");
 
                 System.out.println(ex.getMessage()); 
        } 
    } 
}
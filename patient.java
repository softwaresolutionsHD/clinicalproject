
package exceptionhandling;
// this code doing exception handling
public class ExceptionTest {
    public static void main(String[] args) {
        int num []={1,2,3,4};
        try{
            System.out.println("Access Element 5:"+num[4]);
        }
        catch(Exception e ){
            System.out.println("Exception Thrown:"+e);   
        }
            System.out.println("out of try-catch block!");
        }
    }

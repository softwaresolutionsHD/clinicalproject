
package exceptionhandling;

public class FinallyBlock {
      public static void main(String[] args) {
        int num []=new int [4];
        try{
            System.out.println("Access Element 5:"+num[4]);
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception Thrown:"+e);   
        }
        finally{
            num[0]=1;
            System.out.println("First elemement value: "+num[0]);
            System.out.println("Finally block executed");
        }
      }
    
}

public class Null_Pointer_Exception_Handling {
    public static void main(String[] args) {
       String exampleString = "Pawan";

       try{
           System.out.println("String Name :"+exampleString);
           System.out.println("String Length :"+exampleString.length());
       }catch(NullPointerException exception){
           System.out.println("Error: Attempted to call a method on a null object reference.");
       }
    }
}

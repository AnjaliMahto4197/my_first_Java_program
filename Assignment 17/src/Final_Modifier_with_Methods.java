class Base{
    final void show(){
        System.out.println("Base class");
    }
}
class subclass extends Base{
  //  void show(){
  //     System.out.println("Base class and Sub class");
  // }
}



public class Final_Modifier_with_Methods {
    public static void main(String[] args) {
        subclass sub1 = new subclass();
     //   sub1.show();
    }
}


//Output:Compile Time Error
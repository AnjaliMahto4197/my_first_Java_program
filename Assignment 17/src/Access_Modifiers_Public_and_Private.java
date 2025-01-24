class demo1{
    public void method1(){
        System.out.println("Public Method");
        method2();
    }
    private void method2(){
        System.out.println("Private Method");
        //method1();
    }
}
public class Access_Modifiers_Public_and_Private {
    public static void main(String[] args) {
        demo1 myobj = new demo1();

       //public method
       myobj.method1();

       //private method
    //   myobj.method2();
    }
}

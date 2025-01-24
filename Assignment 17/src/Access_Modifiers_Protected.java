class parent{
    protected void display(){
        System.out.println("Protected method");
    }
}
class child extends parent{
    public void show(){
        System.out.println("Child class");
        display();
    }
}



public class Access_Modifiers_Protected {
    public static void main(String[] args) {
        child child1 = new child();
        child1.display();
        child1.show();
    }
}

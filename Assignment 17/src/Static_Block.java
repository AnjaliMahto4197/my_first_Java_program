class  InitializationClass{
static{
        int value = 10;
        System.out.println("Static block executed");
    System.out.println("Value :" + value);
    }
}

public class Static_Block {
    public static void main(String[] args)
    {
    InitializationClass example1 = new InitializationClass();
    }
}

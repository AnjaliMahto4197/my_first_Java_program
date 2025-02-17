public class Prime_Number {
    public static void is_Prime(int num) {
        int count = 0;
        for (int i = 2; i <=num; i++) {
            if (num % i == 0) {
                count ++;

            }


        }
        if (count >2){
            System.out.println(num + " is not a Prime number");
        }else{
            System.out.println(num + " is a Prime number");
        }

    }

    public static void main(String[] args) {
        int num = 5;
        is_Prime(num);


    }
}

public class Factorial {
    public static void main(String [] args)
    {
        int fact=1,num=4;
        do {
            fact*=num;
            num--;
        }while(num>1);
        System.out.println("Factorial of given number is: "+fact);
    }
}


public class FibonacciNum {
    public static void main(String [] args)
    {
        int a=0,b=1,i=1;
        System.out.println("The 10 Fibonacci numbers are: ");
        while(i<=10)
        {
            System.out.print(a+" ");
            int sum= a+b;
            a=b;
            b=sum;
            i++;
        }
    }
}

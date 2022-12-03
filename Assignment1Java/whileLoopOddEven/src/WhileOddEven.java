public class WhileOddEven {
    public static void main(String [] args)
    {
        int i=0;
        System.out.println("The 10 even numbers are:");
        while(i<=20)
        {
            System.out.println(i+" ");
            i=i+2;
        }
        System.out.println("The 10 odd numbers are:");
        i=1;
        while(i<=20)
        {
            System.out.println(i+"");
            i=i+2;
        }
    }
}

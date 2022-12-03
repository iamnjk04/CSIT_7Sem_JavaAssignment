public class OddEven {
    public static void main(String [] args)
    {
        System.out.println("The 10 even numbers are:");
        int i=0;
        do {
            System.out.println(i);
            i+=2;
        }while(i<=20);
        i = 1;
        System.out.println("The 10 odd numbers are:");
        do {
            System.out.println(i);
            i+=2;
        }while(i<=20);
    }
}

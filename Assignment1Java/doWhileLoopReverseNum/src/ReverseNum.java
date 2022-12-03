public class ReverseNum {
    public static void main (String [] args)
    {
        int reverse=0,rem=0,num=4321;
        do{
            rem = num % 10;
            reverse = reverse*10 + rem;
            num=num/10;
        }while(num!=0);
        System.out.println("The Reverse of given number is " + reverse);
    }
}

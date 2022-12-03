public class ReverseNum {
    public static void main (String [] args)
    {
        int reverse=0,rem=0,num=4321;
        for(;num!=0;num=num/10)
        {
            rem = num % 10;
            reverse = reverse*10 + rem;
        }
        System.out.println("The Reverse of given number is " + reverse);
    }
}

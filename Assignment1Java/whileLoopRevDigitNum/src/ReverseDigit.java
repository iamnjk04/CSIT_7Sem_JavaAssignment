public class ReverseDigit {
    public static void main (String [] args)
    {
        int reverse=0,rem=0,num=4321;
        while(num!=0)
        {
            rem = num % 10;
            reverse = reverse*10 + rem;
            num=num/10;
        }
        System.out.println("The Reverse of given number is " + reverse);
    }
}


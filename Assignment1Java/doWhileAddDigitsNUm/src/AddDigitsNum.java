public class AddDigitsNum {
    public static void main(String [] args)
    {
        int sum=0, num=4;
        do {
            sum+=num;
            num--;
        }while(num>0);
        System.out.println("Sum upto given number is :"+sum);
    }
}

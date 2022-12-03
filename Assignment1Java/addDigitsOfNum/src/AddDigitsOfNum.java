public class AddDigitsOfNum {
    public static void main(String [] args) {
        int num=4,sum=0;
        for(int i=num;i>0;i--) {
            sum+=i;
        }
        System.out.println("Sum upto "+num+" is: "+sum);
    }
}

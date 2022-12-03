public class WhileLoopFact {
    public static void main(String [] args)
    {
        int fact=1,num=4;
        while(num>0) {
            fact*=num;
            num--;
        }
        System.out.println("Factorial of given number is :"+ fact);
    }
}

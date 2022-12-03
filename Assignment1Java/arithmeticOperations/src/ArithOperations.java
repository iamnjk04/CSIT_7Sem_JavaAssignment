package assign1;
public class ArithOperations {
    public static void main(String [] args) {
        int num1=4,num2=6;
        int sum, difference,product,division,increment,decrement;
        System.out.println("number1:"+num1);
        System.out.println("number2:"+num2);
        //Printing the various arithmetic operations
        sum = num1+num2;
        System.out.println("Sum :"+sum);
        difference = num1-num2;
        System.out.println("Difference :"+difference);
        product = num1*num2;
        System.out.println("Product :"+product);
        division = num1/num2;
        System.out.println("Division :"+division);
        increment = num1++;
        System.out.println("Increment is:"+increment);
        decrement = num1--;
        System.out.println("Decrement is:"+decrement);
    }
}


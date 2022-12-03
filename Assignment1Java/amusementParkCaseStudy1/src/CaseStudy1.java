public class CaseStudy1 {
    public static void main (String [] args)
    {
        int ticket=12;
        double cost = 400,discount,amount,total;
        amount =cost*ticket;
        System.out.println("***********Buy More than 10 tickets for 10% discount***********");
        if (ticket > 10)
        {
            discount=amount*0.1;
            total=amount-discount;
            System.out.println("Ticket bought is "+ticket+" so, there is discount, Total amount after discount is: "+ total);
        }
        else
        {
            System.out.println("The Ticket bought is "+ticket+" so,there is no discount, Total amount without discount is: "+ amount);
        }
    }
}
